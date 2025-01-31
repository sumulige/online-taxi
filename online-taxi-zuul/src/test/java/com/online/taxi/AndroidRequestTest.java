package com.online.taxi;

import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONException;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.util.Calendar;

public class AndroidRequestTest {
	
	
	@Test
	public void userRequest() throws JSONException {
		
		String secret = "7yuijhyt45de2";
		
		RestTemplate userTemplate = new RestTemplate();
		
		// 时间戳
		String token = "tokenxxxxxxxxx";
		Long timestamp = Calendar.getInstance().getTimeInMillis();
		
		String sign = DigestUtils.sha1Hex(token + timestamp + secret);
		
		
		// 设置header
		HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE,"application/json");
        httpHeaders.add("timestamp", timestamp+"");
        httpHeaders.add("sign", sign);
        httpHeaders.add("token", token);
        
        HttpEntity<String> request = new HttpEntity<>(httpHeaders);
		
		String result = userTemplate.postForEntity("http://localhost:9100/api-driver/test/hello?name=trp&age=70", request, String.class).getBody();
		System.out.println("网关返回："+result);
		
	}
	
	
}