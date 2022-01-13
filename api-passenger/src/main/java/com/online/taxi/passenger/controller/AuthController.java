package com.online.taxi.passenger.controller;

import com.online.taxi.common.dto.ResponseResult;
import com.online.taxi.passenger.request.UserAuthRequest;
import com.online.taxi.passenger.response.UserAuthResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author yueyi2019
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@PostMapping("/login")
	public ResponseResult login(@RequestBody UserAuthRequest userAuthRequest) {
		
		UserAuthResponse response = new UserAuthResponse();
		
		response.setToken("");
		return ResponseResult.success(response);
	}

}
