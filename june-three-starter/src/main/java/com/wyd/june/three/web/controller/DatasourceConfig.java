package com.wyd.june.three.web.controller;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 数据源配置
 *
 * @author chufeng
 * @date 2019-11-21 19:55
 */
@Configuration
public class DatasourceConfig {

	@Value("${db.mysql.url}")
	private String dbUrl;

	@Value("${db.mysql.username}")
	private String dbUsername;

	@Value("${db.mysql.password}")
	private String dbPassword;

	@Bean
	public DataSource getDataSource() {
		Properties properties = new Properties();
		properties.setProperty("user", dbUsername);
		properties.setProperty("password", dbPassword);
		DataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver", dbUrl, properties);
		return dataSource;
	}
}
