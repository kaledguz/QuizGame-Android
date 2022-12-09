package com.example.quizgame_android.data;

import com.example.quizgame_android.controller.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAOMySQL {

	private Controller myController;

	private Connection cnx = null;
	private Statement stmt = null;

	public DAOMySQL(Controller aController) {

		this.myController = aController;
	}

	public boolean connectDatabase() throws Exception {
		String url = "jdbc:mysql://localhost:3306/quiz_db";
		String login = "root";
		String password = "root";
		try {
			//1-load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2- create a connection - a plug on driver
			this.cnx = DriverManager.getConnection(url, login, password);
			//3- connect a wire - the statement
			this.stmt = cnx.createStatement();
			return true;
		}
		catch (Exception e) {
			System.out.println("Connexion Error");
			return false;
		}
	}

	public Statement getStmt() {
		return stmt;
	}
}
