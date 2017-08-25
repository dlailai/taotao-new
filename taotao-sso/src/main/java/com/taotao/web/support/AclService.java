package com.taotao.web.support;

import com.taotao.model.acl.GewaraUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface AclService<T extends SecurityModule> extends UserDetailsService {
	GewaraUser getGewaraUser(Long userid, String logonType);
	/**
	 * 获取非API的拦截模块
	 * @return
	 */
	List<T> getSecurityModuleList();
	List<T> getMenuList(String tag);
	List<String> getRolenameList();
	void setLogonType(String ptn);
	
	
	/**
	 * 根据用户名获取用户对象
	 * @param name
	 * @param logonType
	 * @return
	 */
	@Override
	GewaraUser loadUserByUsername(String name);
	boolean isCopyAuthorities();
}