

package com.i42.jdb.orm.dao;

import java.sql.SQLException;
import java.util.List;
import com.i42.jdb.orm.Account;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;


public class AccountDao extends BaseDaoImpl<Account, String>
			implements AccountDaoInterface
{
    Dao<Account, String> accountDao;

    public AccountDao(ConnectionSource connSource) throws SQLException {
		super(connSource, Account.class);
    }

    public void performDBOp(ConnectionSource connSource) throws SQLException {
		accountDao = DaoManager.createDao(connSource, Account.class);
		TableUtils.createTableIfNotExists(connSource, Account.class);

		Account a1 = new Account();
		a1.setName("Kalin Rangelov");
		a1.setPassword("Secret Password");

		Account a2 = new Account();
		a2.setName("Max Mustermann");
		a2.setPassword("password");

		accountDao.create(a1);
		accountDao.create(a2);

		List<Account> list = accountDao.queryForAll();
		System.out.println("************** Accounts ***************");
		for(Account a : list) {
			System.out.println(a);
		}
    }
}