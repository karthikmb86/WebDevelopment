package com.kr.web.dao;

import com.kr.web.model.BusinessPartners;
import java.sql.*;

public class BusinessPartnersDao {
	
	public BusinessPartners getBusinessPartner(int bpid) {
		BusinessPartners a = new BusinessPartners();
		a.setBPid(bpid);
		/*
		a.setBPName("BPTest4");
		a.setSupplier("332232");
		a.setBPCategory("BBGT");
		*/
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saplocal","root","Pass#123");
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("SELECT * from saplocal.businesspartners where BPid="+ bpid);
		    if(result.next()) {
		    	a.setBPid(result.getInt("BPid"));
		    	a.setBPName(result.getString("BPName"));
		    	a.setSupplier(result.getString("Supplier"));
		    	a.setBPCategory(result.getString("BPCategory"));
		    }
		}
		catch (Exception e) {
			a.setBPid(bpid);
			a.setBPName("BPTest4");
			a.setSupplier("test");
			a.setBPCategory(e.getStackTrace().toString());
		}
		
		return a;
	}
}
