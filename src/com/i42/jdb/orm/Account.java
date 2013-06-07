
package com.i42.jdb.orm;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Account")
public class Account 
{
    @DatabaseField(generatedId = true)
	private int id;

    @DatabaseField(canBeNull = false)
	private String name;

    @DatabaseField(canBeNull = false)
	private String password;

    
    public Account() {
		// ORMLite needs this
    }

    public Account(String name, String password) {
		this.name = name;
		this.password = password;
    }

    public void setName(String name) {
		this.name = name;
    }
    public void setPassword(String password) {
		this.password = password;
    }
    public int getId() {
		return this.id;
    }
    public String getName() {
		return this.name;
    }
    public String getPassword() {
		return this.password;
    }

    
    @Override
    public String toString() {
		return "(" + id + ")  " + name + "[" + password + "]"; 
    }
}
