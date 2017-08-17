package com.cdac.gist.jdbcTemplate;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {

	@Bean
	public JdbcTemplate oracleDatabaseTemplate(){
		JdbcTemplate jdbcTemplate=new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

	private DataSource getDataSource() {
		DataSource driverManageDataSource = new DriverManagerDataSource(
				"jdbc:postgresql://ordpdmgpmdw00.dswh.ds.adp.com:5432/fmr1", "bi_user", "bi_user");
		return driverManageDataSource;
	}
}
