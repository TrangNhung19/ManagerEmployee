package qlnv;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;

public class JDBCnv {
	private Connection conn;
	public  JDBCnv() {
		
		try {
			String url="jdbc:mysql://localhost:3306/swing_demo";
			String user="root";
			String password="123456";
			conn=DriverManager.getConnection(url,user,password);
					
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Employee> getListNV(){
		ArrayList<Employee> list=new ArrayList<>();
		String sql="SELECT * FROM 'swing_demo.nhanvien'";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee n=new Employee();
				n.setSTT(rs.getInt("STT"));
				n.setTennv(rs.getString("Hoten"));
				n.setManv(rs.getString("Manv"));
				n.setChucvu(rs.getString("Chucvu"));
				n.setGt(rs.getString("Gioitinh"));
				n.setDate(rs.getString("Namsinh"));
				n.setSDT(rs.getString("SDT"));
				n.setEmail(rs.getNString("Email"));
				n.setLuong(rs.getInt("Luong"));
				list.add(n);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String [] args) {
		new JDBCnv();
	}
}
