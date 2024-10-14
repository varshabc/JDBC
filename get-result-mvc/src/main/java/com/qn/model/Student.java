package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student  {
	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	public Student(int id, String name, int marks1, int marks2, int marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3="
				+ marks3 + "]";
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public void getResult() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root","W7301@jqir*");
			
			String s = "select * from Student where id=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setInt(1, id);
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				id = res.getInt(1);
				name = res.getString(2);
				marks1 = res.getInt(3);
				marks2 = res.getInt(4);
				marks3 = res.getInt(5);
			}	
			
		} catch (Exception e) {
			
		}
	}
}
