package com.management;


import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionManager {
	
	public static Connection getConnection()
	{
		Connection con=null;
		Properties prop=new Properties();
		try
		{
			FileInputStream fis=new FileInputStream("database.properties");
			prop.load(fis);
			String url=prop.getProperty("url");
			String user=prop.getProperty("username");
			String pass=prop.getProperty("password");
			Class.forName(prop.getProperty("drivername"));
			con=DriverManager.getConnection(url,user,pass);
		}
		catch(Exception e)
		{

			e.printStackTrace();	
		}
		
		return con;
	}
}
