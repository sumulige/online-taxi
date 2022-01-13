package com.online.taxi.app.service.impl;

import com.online.taxi.app.dao.AppVersionUpdateMapper;
import com.online.taxi.app.service.AppVersionUpdateService;
import com.online.taxi.common.entity.AppVersionUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppVersionUpdateServiceImpl implements AppVersionUpdateService {
	
	@Autowired
	private AppVersionUpdateMapper appVersionUpdateMapper;
	
	@Override
	public List<AppVersionUpdate> selectByBean(Integer platformType,Integer appType,Integer versionCode) {
		AppVersionUpdate record = new AppVersionUpdate();
		record.setPlatformType(platformType);
		record.setAppType(appType);
		record.setVersionCode(versionCode);
		
		return appVersionUpdateMapper.selectByBean(record);
	}

}
