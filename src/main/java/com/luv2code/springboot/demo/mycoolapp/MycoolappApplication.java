package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// what we did is we put the common folder outside of the app package so it doesn't get scanned automatically
//@SpringBootApplication(scanBasePackages = {"com.luv2code.springboot.demo.mycoolapp", "com.luv2code.springboot.demo.common"})//(scanBasePackages={"com.luv2code.springboot.demo.mycoolapp","com.luv2code.springboot.demo.utils"})
@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
