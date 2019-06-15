package com.shadov.test.springbootfeatures.main;

import com.shadov.test.springbootfeatures.library.business.BusinessApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {
	private BusinessApi businessApi;

	private BusinessController(final BusinessApi businessApi) {
		this.businessApi = businessApi;
	}

	@GetMapping("/some")
	public String some() {
		return businessApi.getSome();
	}

	@GetMapping("/ex")
	public String ex() {
		throw new RuntimeException("Testing exception");
	}
}
