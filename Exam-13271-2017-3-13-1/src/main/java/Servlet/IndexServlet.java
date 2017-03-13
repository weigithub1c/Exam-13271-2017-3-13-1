package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.DocAttribute;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("uname");

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "select film_id,tile,decription,language from filem, language l f where f.language_id = l.language_id";


		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");

			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			List rs = (List) ps.executeQuery();
			if(rs!=null && rs.size()>0){  
				for(int i=0;i<rs.size();i++){
					DocAttribute film1=(DocAttribute)rs.get(i);

					ps.close();
				}
			}
		}
		catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		req.setAttribute("film1", resp);;
		req.getRequestDispatcher("success.jsp").forward(req, resp);
		System.out.println("ssssssssssssss");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}