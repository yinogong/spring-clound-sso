package common.service;

import java.util.UUID;

public class TokenService {
	private TokenService(){}
	
	public static String uuid = UUID.randomUUID().toString();
}
