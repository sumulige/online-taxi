package com.online.taxi.passenger.schedule;

import com.online.taxi.common.dto.ResponseResult;
import com.online.taxi.common.dto.order.ForecastRequest;
import com.online.taxi.common.dto.order.ForecastResponse;
import com.online.taxi.passenger.feign.ServiceForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScheduleTest {
	
	@Autowired
	private ServiceForecast serviceForecast;

	public ResponseResult<ForecastResponse> forecast() {
		System.out.println("定时调用");
		ForecastRequest req = new ForecastRequest();
		req.setEndLatitude("el");
		req.setEndLongitude("el2");
		req.setStartLatitude("sl");
		req.setStartLongitude("sl2");
		ResponseResult<ForecastResponse> result = serviceForecast.forecast(req);
		
		return ResponseResult.success(result.getData());
	}
}
