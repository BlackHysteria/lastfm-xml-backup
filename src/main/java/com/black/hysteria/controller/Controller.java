package com.black.hysteria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/backup/run")
	public void getRun(
			@RequestParam(value = "nickName") String nickName) {
		System.out.println("qw3e");
	}

}
