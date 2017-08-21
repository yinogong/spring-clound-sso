package a.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import a.service.TokenService;

@Controller
public class LoginController {
	@Resource
	private TokenService tokenService;
	
	@RequestMapping("/login")
	public ResponseEntity<String> login(HttpServletResponse response){
		Cookie token = new Cookie("token",tokenService.getToken());
		response.addCookie(token);
		return new ResponseEntity<String>("登录成功", HttpStatus.OK);
	}
	
	@RequestMapping("/logout")
	public ResponseEntity<String> out(HttpServletResponse response){
		Cookie token = new Cookie("token",tokenService.getToken());
		token.setMaxAge(0);
		response.addCookie(token);
		return new ResponseEntity<String>("退出成功", HttpStatus.OK);
	}
}
