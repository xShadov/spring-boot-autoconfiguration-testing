package com.shadov.test.springbootfeatures.main;

import com.shadov.test.springbootfeatures.library.ServiceInfo;
import com.shadov.test.springbootfeatures.library.business.BusinessEndpoint;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("external-services.properties")
@ConfigurationProperties("external-service")
public class ServiceEndpoints implements BusinessEndpoint {
	private ServiceInfo business;
}
