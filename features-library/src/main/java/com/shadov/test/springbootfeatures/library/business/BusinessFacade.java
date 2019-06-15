package com.shadov.test.springbootfeatures.library.business;

import com.shadov.test.springbootfeatures.library.ServiceInfo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BusinessFacade implements BusinessApi {
	private ServiceInfo serviceInfo;

	public String getSome() {
		System.out.println("calling: " + serviceInfo.getEndpoint());
		return "business";
	}
}
