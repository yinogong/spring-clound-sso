package a.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(name="sso-common")
public interface TokenFeignClient {
	@RequestMapping("/getToken")
	public String getToken();
}
