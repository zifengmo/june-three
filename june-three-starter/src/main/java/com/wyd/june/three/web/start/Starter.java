package com.wyd.june.three.web.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 基础启动类
 *
 * @author chufeng
 * @date 2019-11-13 17:21
 */
@SpringBootApplication(scanBasePackages = {"com.wyd.june"})
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
}
