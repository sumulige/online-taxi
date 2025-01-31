package com.online.taxi.sms.dao;

import com.online.taxi.common.entity.Sms;
import com.online.taxi.sms.mapper.SmsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author yueyi2019
 */
@Service
public class SmsDao {
	
	@Autowired
	private SmsMapper smsMapper;
	
	public int insert(Sms sms) {
		
		return smsMapper.insert(sms);
	}
}
