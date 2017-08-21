package a.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import a.service.TokenService;

@Controller
public class ResourceController {
	@Resource
	private TokenService tokenService;
	
	@RequestMapping("/resource")
	@ResponseBody
	public ResponseEntity<String> resource(@CookieValue(value="token",required=false) String token){
		if(token==null || !token.equals(tokenService.getToken())){
			return new ResponseEntity<String>("请登录", HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<String>("aaa resource", HttpStatus.OK);
	}
}
