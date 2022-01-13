package com.online.taxi.verificationcode.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class GitConfig {

	@Value("${env}")
	private String env;
}
