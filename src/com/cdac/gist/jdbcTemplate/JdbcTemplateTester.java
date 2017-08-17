package com.cdac.gist.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JdbcTemplateTester {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				"com.cdac.gist.jdbcTemplate");
		JdbcTemplate jdbcTemplate=appContext.getBean(JdbcTemplate.class);
		jdbcTemplate.query("select * from dim_dates limit 5",new Person());
		System.out.println("Testing");
	}
}
class Person implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet arg0, int arg1) throws SQLException {
		ResultSetMetaData rsmd=arg0.getMetaData();
		//rsmd.getColumnCount()
		
		for(int i=1;i<rsmd.getColumnCount();i++){
			System.out.println(rsmd.getColumnName(i));
		}
//		while(arg0.next()){
//			String str=arg0.getString(1);
//			System.out.println(str);
//		}
		return null;
	}
	
}
