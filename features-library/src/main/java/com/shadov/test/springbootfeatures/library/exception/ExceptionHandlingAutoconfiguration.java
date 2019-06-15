package com.shadov.test.springbootfeatures.library.exception;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(ExceptionHandlingAdvice.class)
@ConditionalOnProperty(name = "spring-utils.exceptionhandling.enabled", havingValue = "true", matchIfMissing = true)
public class ExceptionHandlingAutoconfiguration {
	@Bean
	public ExceptionHandlingAdvice exceptionHandlingAdvice() {
		return new ExceptionHandlingAdvice() {

		};
	}
}
