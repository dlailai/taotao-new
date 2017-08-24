package com.taotao.commons.sign;

import com.taotao.commons.api.ApiSysParamConstants;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.security.SignatureException;
import java.util.Map;
import java.util.TreeMap;

/**
 * ǩ����
 * @author quzhuping
 *
 */
public class Sign {

	/**
     * ���ַ�������MD5ǩ��
     * @param text ����
     * @param inputCharset �����ʽ UTF-8��GBK
     * @return ����,32λ16����Сд�ַ���
     */
    public static String md5Hex(String text, String inputCharset) {

        return DigestUtils.md5Hex(getContentBytes(text, inputCharset));

    }

    /**
     * @param content
     * @param charset
     * @return
     * @throws SignatureException
     * @throws UnsupportedEncodingException
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5ǩ�������г��ִ���,ָ���ı��뼯����,��Ŀǰָ���ı��뼯��:" + charset);
        }
    }

	/**
	 * md5ǩ������
	 * @param srcStr
	 * @return ����32λ16���ƴ�д�ַ���
	 */
	public static String md5(String srcStr){
		return DigestUtils.md5Hex(srcStr).toUpperCase();
	}


	/**
	 * ���������������MD5ǩ��
	 * @param params ��ǩ�������������
	 * @param secretCode ǩ������
	 * @return ����null �� 32λ16���ƴ�д�ַ���
	 */
	public static String signMD5(Map<String, String> params, String secretCode){
		if(params == null || params.isEmpty())
			return "";
		if(params instanceof TreeMap){
			return signMD5Inner((TreeMap<String, String>) params, secretCode);
		}else{
			TreeMap<String, String> treeMap = new TreeMap<String, String>();
			treeMap.putAll(params);
			return signMD5Inner(treeMap, secretCode);
		}
	}
	/**
	 * ���������������MD5ǩ��
	 * @param param ��ǩ�������������
	 * @param secretCode ǩ������
	 * @return ����32λ16���ƴ�д�ַ���
	 */
	private static String signMD5Inner(TreeMap<String, String> param, String secretCode){
		return DigestUtils.md5Hex(signStr(param, secretCode, false)).toUpperCase();
	}

	/**
	 * �����������key=value&key=valuesecretCodeƴ��
	 * <br/>�ų�keyΪsign��signmethod��key-value
	 * @param param �������
	 * @param secretCode ǩ������
	 * @return
	 */
	public static String signStr(TreeMap<String, String> param, String secretCode, boolean startAppend){
		StringBuilder orgin = new StringBuilder();
		String value = "";
		for(String name : param.keySet()){
			//����ǩ����ֵ�����������е�ǩ��ֵ��ǩ������
			if(!StringUtils.equalsIgnoreCase(name, ApiSysParamConstants.SIGN)
					&& !StringUtils.equalsIgnoreCase(name, ApiSysParamConstants.SIGNMETHOD)){
				value = param.get(name);
				if(StringUtils.isEmpty(value)){
					value = "";
				}
				orgin.append(name).append("=").append(value).append("&");
			}
		}
		if(startAppend){
			return secretCode+StringUtils.substringBeforeLast(orgin.toString(), "&");
		}
		return StringUtils.substringBeforeLast(orgin.toString(), "&") + secretCode;
	}
}
