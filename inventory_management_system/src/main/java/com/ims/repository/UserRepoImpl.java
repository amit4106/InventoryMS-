package com.ims.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ims.util.JDBCUtil;

public class UserRepoImpl implements UserRepo {

	@Override
	public String fetchUser(String username, String password) {
		String uname="";
		Connection con = JDBCUtil.getMySQLConnection();
		String sql="select username,pwd from ims_login where username=? AND pwd=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs!=null && rs.next()) {
				uname=rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return uname;
	}

}
