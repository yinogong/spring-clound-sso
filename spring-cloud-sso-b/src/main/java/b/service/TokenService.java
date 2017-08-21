package b.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class TokenService {
	@Resource
	private TokenFeignClient tokenFeignClient;
	
	public String getToken(){
		return tokenFeignClient.getToken();
	}
}
