package com.beerhub.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myapp")
public class AppConfig {
	
	 private String dbHost;
	 private int dbPort;
	 private String dbName;
	 private String dbUsername;
	 private String dbPassword;
	 private String hibernateDdlAuto;
	 private boolean hibernateShowSql;
	 
	public String getDbHost() {
		return dbHost;
	}
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	public int getDbPort() {
		return dbPort;
	}
	public void setDbPort(int dbPort) {
		this.dbPort = dbPort;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDbUsername() {
		return dbUsername;
	}
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	public String getHibernateDdlAuto() {
		return hibernateDdlAuto;
	}
	public void setHibernateDdlAuto(String hibernateDdlAuto) {
		this.hibernateDdlAuto = hibernateDdlAuto;
	}
	public boolean isHibernateShowSql() {
		return hibernateShowSql;
	}
	public void setHibernateShowSql(boolean hibernateShowSql) {
		this.hibernateShowSql = hibernateShowSql;
	}
}
