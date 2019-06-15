package com.shadov.test.springbootfeatures.library.business;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(BusinessAutoconfiguration.class)
@Configuration
public @interface EnableBusiness {
}
