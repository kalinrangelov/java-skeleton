
package com.i42.jdb;

import java.io.*;
import java.sql.*;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.i42.jdb.orm.dao.AccountDao;
import com.i42.jdb.orm.Movie;
import com.i42.jdb.orm.dao.MovieDao;

public class Main 
{
    public static void main(String[] args) {
	
	System.out.println("Connecting to DB... ");

		try {
			//Class.forName("org.sqlite.JDBC");
			//Connection conn = DriverManager.getConnection("jdbc:sqlite:../data/i42orm.sqlite");
			ConnectionSource connSource = new JdbcConnectionSource("jdbc:sqlite:../data/i42orm.sqlite");
			AccountDao ad = new AccountDao(connSource);
			ad.performDBOp(connSource);
			//System.out.println("Disconnecting from DB...");
			//cn.close();
			
			Movie m1 = new Movie();
			m1.setName("Kung Fu Panda 2");
			Movie m2 = new Movie();
			m2.setName("Kino - not movie!");
			MovieDao md = new MovieDao(connSource);
			md.save(m1);
			md.save(m2);
			md.print();
			
			
			System.out.println("DONE!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
}