package com.i42.jdb.orm.dao;

import java.sql.SQLException;
import java.util.List;
import com.i42.jdb.orm.Movie;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class MovieDao extends BaseDaoImpl<Movie, Integer>
			implements MovieDaoInterface
{
	Dao<Movie, Integer> movieDao;
	
	public MovieDao(ConnectionSource connSource) throws SQLException {
		super(connSource, Movie.class);
		TableUtils.createTableIfNotExists(connSource, Movie.class);
		movieDao = DaoManager.createDao(connSource, Movie.class);
	}
	
	public void save(Movie movie) throws SQLException {
			movieDao.create(movie);
	}
	
	public void print() throws SQLException {
		List<Movie> list = movieDao.queryForAll();
		System.out.println("************** Movie ***************");
		for(Movie m : list) {
			System.out.println(m);
		}
	}
}