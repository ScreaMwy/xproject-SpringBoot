package com.xproject.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.IOException;

import javax.sql.DataSource;
import javax.annotation.Resource;

@Configuration
public class SessionFactoryConfiguration {
	@Value("${mybatis.configLocation}")
	private String mybatisConfigFilePath;
	
	@Value("${mybatis.mapperLocation}")
	private String mapperPath;
	
	@Resource(name = "dataSource", type = DataSource.class)
	private DataSource dataSource;
	
	@Value("${mybatis.entityPackage}")
	private String entityPackage;
	
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		
		String packageScanPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
		sqlSessionFactory.setMapperLocations(resolver.getResources(packageScanPath));
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setTypeAliasesPackage(entityPackage);
		return sqlSessionFactory;
	}
}
