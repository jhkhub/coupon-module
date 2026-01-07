package com.jhkhub.coupon;

import org.springframework.boot.SpringApplication;

public class TestCouponModuleApplication {

	public static void main(String[] args) {
		SpringApplication.from(CouponModuleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
