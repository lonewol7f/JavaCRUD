package utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.User;

public class UserDBUtil {

	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean addUser(String fname, String lname, String email, String uname, String passwd) {
		boolean success = false;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO user VALUES(0,'"+fname+"','"+lname+"','"+email+"','"+uname+"','"+passwd+"')";
			
			int result = stmt.executeUpdate(sql);
			
			if (result != 0) {
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}
	
	public static User getSingleUser(String uname) {
		User user = new User();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM user WHERE uname='"+uname+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				user.setId(rs.getInt(1));
				user.setFname(rs.getString(2));
				user.setLname(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setUname(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public static ArrayList<User> listUser(){
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM user";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				User user = new User();
				
				user.setId(rs.getInt(1));
				user.setFname(rs.getString(2));
				user.setLname(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setUname(rs.getString(5));
				
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static boolean updateUser(int id, String fname, String lname) {
		boolean success = false;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "UPDATE user SET fname='"+fname+"', lname='"+lname+"' WHERE id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if (rs != 0) {
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}
	
	public static void deleteUser(int id) {
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "DELETE FROM user WHERE id='"+id+"'";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean login(String uname, String passwd) {
		boolean success = false;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT passwd FROM user WHERE uname='"+uname+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				if (passwd.equals(rs.getString(1))) {
					success = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}
}
