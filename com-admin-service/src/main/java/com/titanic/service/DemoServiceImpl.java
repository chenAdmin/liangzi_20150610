package com.titanic.service;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.titanic.bean.Customer;



@Service
public class DemoServiceImpl implements Demoservice
{
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	DataSource dataSource; 
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void demo()
	{
		System.out.println("DemoServiceDemoServiceDemoServiceDemoServiceDemoServiceDemoService-------->");
	}
	
	public void mysql() throws SQLException
	{
		System.out.println(dataSource.getConnection());
	}

	
	public  void mongo()
	{
		Customer c = new Customer();
		c.setFirstName("exia");
		c.setLastName("bin");
		mongoTemplate.insert(c);
	}
	
	public void testUpdate()
	{
		String sql = "UPDATE test SET name= ?  WHERE id=?";
		
		int x =  jdbcTemplate.update(sql, "松岛枫" ,1);
		System.out.println("x->>>>>>>>>>>>>>>>."+x);
	}
	
	
	
	
	
}
