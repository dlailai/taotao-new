package com.taotao.web.support.auth;

import org.springframework.security.core.Authentication;

public interface SessidGenerator {

	/**
	 * ����sessid
	 * @param auth
	 * @return
	 */
	String generateSessid(Authentication auth);
	
}
