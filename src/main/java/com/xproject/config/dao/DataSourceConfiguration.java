package com.xproject.config.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;

@Configuration
public class DataSourceConfiguration {
	@Value("${jdbc.driver_class}")
	private String jdbcDriverClass;
	
	@Value("${jdbc.url}")
	private String jdbcUrl;
	
	@Value("${jdbc.username}")
	private String jdbcUsername;
	
	@Value("${jdbc.password}")
	private String jdbcPassword;
	
	@Bean(name = "dataSource")
	public ComboPooledDataSource createDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(jdbcDriverClass);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(jdbcUsername);
		dataSource.setPassword(jdbcPassword);
		
		//关闭连接后不自动提交事务
		dataSource.setAutoCommitOnClose(false);
		return dataSource;
	}
}
