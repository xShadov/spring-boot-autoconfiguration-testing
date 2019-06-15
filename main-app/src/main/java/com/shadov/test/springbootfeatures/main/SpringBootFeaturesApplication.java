package com.shadov.test.springbootfeatures.main;

import com.shadov.test.springbootfeatures.library.business.EnableBusiness;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBusiness
@SpringBootApplication
public class SpringBootFeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeaturesApplication.class, args);
	}

}
