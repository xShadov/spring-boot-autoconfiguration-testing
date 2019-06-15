package com.shadov.test.springbootfeatures.library.business;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean({BusinessApi.class})
@ConditionalOnBean({BusinessEndpoint.class})
@ConditionalOnProperty(name = "spring-utils.business.enabled", havingValue = "true", matchIfMissing = true)
public class BusinessAutoconfiguration {
	@Bean
	public BusinessApi businessApi(BusinessEndpoint businessEndpoint) {
		return new BusinessFacade(businessEndpoint.getBusiness());
	}
}
