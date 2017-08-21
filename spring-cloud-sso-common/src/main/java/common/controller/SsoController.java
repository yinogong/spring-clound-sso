package common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import common.service.TokenService;

@Controller
public class SsoController {
	
	@RequestMapping("/getToken")
	@ResponseBody
	public String getToken(){
		return TokenService.uuid;
	}
	
}
