package com.wyd.june.three.web.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 基础启动类
 *
 * @author chufeng
 * @date 2019-11-13 17:21
 */
@SpringBootApplication(scanBasePackages = {"com.wyd.june"}, exclude = { DataSourceAutoConfiguration.class})
@EnableTransactionManagement
@ComponentScan("com.wyd.june.three.web.dao")
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
}
