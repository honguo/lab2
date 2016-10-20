package com.bookmanager.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookmanager.model.Author;
import com.bookmanager.model.Book;
import com.bookmanager.util.DB;

public class AuthorService {
	public void add(Author c) {
		Connection conn = DB.createConn();
		String sql = "insert into Book values ( ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setInt(1, c.getAuthorID());
			ps.setString(2, c.getName());
			ps.setInt(3, c.getAge());
			ps.setString(4, c.getCountry());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}
	
	public List<Author> query(int AuthorID) {
		Connection conn = DB.createConn();		
		String sql = "select * from Author where AuthorID = ?";
		//SELECT * FROM tb_stu  WHERE sname  =  'Π‘Αυ'
		PreparedStatement ps = DB.prepare(conn, sql);
		List<Author> authors = new ArrayList<Author>();
		try {
			Author c = null;
			ps.setInt(1, AuthorID);
			ResultSet rs = ps.executeQuery();		
			while(rs.next()) {
				c = new Author();
				c.setAuthorID(rs.getInt("AuthorID"));
				c.setName(rs.getString("Name"));
				c.setAge(rs.getInt("Age"));
				c.setCountry(rs.getString("Country"));
				authors.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		DB.close(ps);
		DB.close(conn);
		return authors;
	}
	
	public List<Author> detail(String Tittle) {
		Connection conn = DB.createConn();
		String sql1 = "select * from Book where Tittle=?";
		String sql2 = "select * from Author where AuthorID=?";
		PreparedStatement ps1 = DB.prepare(conn, sql1);
		PreparedStatement ps2 = DB.prepare(conn, sql2);
		List<Author> authors = new ArrayList<Author>();
		try {
			ps1.setString(1, Tittle);		
			ResultSet rs1 = ps1.executeQuery();
			
			int id=0;
			while(rs1.next()){
				id=rs1.getInt("AuthorID");
				System.out.println(id);
			}
			ps2.setInt(1,id);
			ResultSet rs2 = ps2.executeQuery();
			Author c = null;		
			while(rs2.next()) {
				c = new Author();
				c.setAuthorID(rs2.getInt("AuthorID"));
				c.setName(rs2.getString("Name"));
				c.setAge(rs2.getInt("Age"));
				c.setCountry(rs2.getString("Country"));
				authors.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps1);
		DB.close(ps2);
		DB.close(conn);
		return authors;
	}
	
	public List<Author> search(String Name) {
		Connection conn = DB.createConn();		
		String sql = "select * from Author where Name = ?";
		//SELECT * FROM tb_stu  WHERE sname  =  'Π‘Αυ'
		PreparedStatement ps = DB.prepare(conn, sql);
		List<Author> authors = new ArrayList<Author>();
		try {
			Author c = null;
			ps.setString(1, Name);
			ResultSet rs = ps.executeQuery();		
			while(rs.next()) {
				c = new Author();
				c.setAuthorID(rs.getInt("AuthorID"));
				c.setName(rs.getString("Name"));
				c.setAge(rs.getInt("Age"));
				c.setCountry(rs.getString("Country"));
				authors.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		DB.close(ps);
		DB.close(conn);
		return authors;
	}
}



