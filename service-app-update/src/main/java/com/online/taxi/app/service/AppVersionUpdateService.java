package com.online.taxi.app.service;

import com.online.taxi.common.entity.AppVersionUpdate;

import java.util.List;

public interface AppVersionUpdateService {

	List<AppVersionUpdate> selectByBean(Integer platformType,Integer appType,Integer versionCode);
	
}
