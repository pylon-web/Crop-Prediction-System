package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class SVMTestModel {
	static Connection con = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	static PreparedStatement preparedStatement = null;
	
	public Double getAVGRainfall(String area) {
		con = DBConnection.createConnection();
		Double rainfall=0.0;
		String sql = "select * from rainfalltraindata";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String taluka=rs.getString(2);
				Double rain=rs.getDouble(3);
				if(area.equals(taluka)) {
					rainfall=rainfall+rain;
				}
			}
			con.close();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	return rainfall;
	}
	
	public Double getAvgNPKSoil(String soil) {
		con = DBConnection.createConnection();
		Double npk=0.0;
		String sql = "select * from soiltraindata";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String soilvalue=rs.getString(2);
				Double npkvalue=rs.getDouble(3);
				if(soil.equals(soilvalue)) {
					npk=npk+npkvalue;
				}
			}
			con.close();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	return npk;
	}
	

	public void getRainBasedSuggestion(ArrayList<Double> getAllParameters) {
		con = DBConnection.createConnection();
		Double rainfall=getAllParameters.get(0); 		
		
		try {
			Statement stmt = con.createStatement();
			String sql ="select * from allcrops";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id=null;
				String cropSuggestion=rs.getString(2);
				Double rainvalue=rs.getDouble(3);
				Double npkvalue=rs.getDouble(4);
				String season=rs.getString(5);
				Double tempvalue=rs.getDouble(6);
				
				if(rainfall<=50.0 && rainvalue<=50.0 ) {
					String query = "insert into cropsuggestion01(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, cropSuggestion);
					 preparedStatement.setDouble(3, rainvalue);
					 preparedStatement.setDouble(4, npkvalue);
					 preparedStatement.setString(5, season);
					 preparedStatement.setDouble(6, tempvalue);
					 
					 preparedStatement.executeUpdate();
				}
				else if(rainfall>50.0 && rainfall<=100.0 && rainvalue<=100.0 ) {
					String query = "insert into cropsuggestion01(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, cropSuggestion);
					 preparedStatement.setDouble(3, rainvalue);
					 preparedStatement.setDouble(4, npkvalue);
					 preparedStatement.setString(5, season);
					 preparedStatement.setDouble(6, tempvalue);
					 
					 preparedStatement.executeUpdate();
				}
				else if(rainfall>100.0 && rainfall<=200.0 && rainvalue<=200.0 ) {
					String query = "insert into cropsuggestion01(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, cropSuggestion);
					 preparedStatement.setDouble(3, rainvalue);
					 preparedStatement.setDouble(4, npkvalue);
					 preparedStatement.setString(5, season);
					 preparedStatement.setDouble(6, tempvalue);
					 
					 preparedStatement.executeUpdate();
				}
				else if(rainfall>200.0 && rainfall<=300.0 && rainvalue<=300.0) {
					String query = "insert into cropsuggestion01(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, cropSuggestion);
					 preparedStatement.setDouble(3, rainvalue);
					 preparedStatement.setDouble(4, npkvalue);
					 preparedStatement.setString(5, season);
					 preparedStatement.setDouble(6, tempvalue);
					 
					 preparedStatement.executeUpdate();
				}
				
				else if(rainfall>300.0 && rainfall<=800.0 && rainvalue<=800.0) {
					String query = "insert into cropsuggestion01(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, cropSuggestion);
					 preparedStatement.setDouble(3, rainvalue);
					 preparedStatement.setDouble(4, npkvalue);
					 preparedStatement.setString(5, season);
					 preparedStatement.setDouble(6, tempvalue);
					 
					 preparedStatement.executeUpdate();
				}
				
				else if(rainfall>800.0 && rainfall<=1000.0 && rainvalue<=1000.0) {
					String query = "insert into cropsuggestion01(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, cropSuggestion);
					 preparedStatement.setDouble(3, rainvalue);
					 preparedStatement.setDouble(4, npkvalue);
					 preparedStatement.setString(5, season);
					 preparedStatement.setDouble(6, tempvalue);
					 
					 preparedStatement.executeUpdate();
				}
				
				else if(rainfall>1000.0 && rainvalue<=1000.0) {
					String query = "insert into cropsuggestion01(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, cropSuggestion);
					 preparedStatement.setDouble(3, rainvalue);
					 preparedStatement.setDouble(4, npkvalue);
					 preparedStatement.setString(5, season);
					 preparedStatement.setDouble(6, tempvalue);
					 
					 preparedStatement.executeUpdate();
				}
				
			}
			con.close();
			stmt.close();
			preparedStatement.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
		public void getSoilBasedSuggestion(ArrayList<Double> getAllParameters) {
			con = DBConnection.createConnection();
			
			Double soilNPK=getAllParameters.get(1);
			
			try {
				Statement stmt = con.createStatement();
				String sql ="select * from cropsuggestion01";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					String id=null;
					String cropSuggestion=rs.getString(2);
					Double rainvalue=rs.getDouble(3);
					Double npkvalue=rs.getDouble(4);
					String season=rs.getString(5);
					Double tempvalue=rs.getDouble(6);
					
					if(soilNPK<=90.0 && npkvalue<=90.0 ) {
						String query = "insert into cropsuggestion02(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 preparedStatement.executeUpdate();
					}
					else if(soilNPK>90.0 && soilNPK<=110.0 && npkvalue<=110.0 ) {
						String query = "insert into cropsuggestion02(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 preparedStatement.executeUpdate();
					}
					else if(soilNPK>110.0 && soilNPK<=135.0 && npkvalue<=135.0 ) {
						String query = "insert into cropsuggestion02(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 preparedStatement.executeUpdate();
					}	
					else if(soilNPK>135.0 && npkvalue>135.0 ) {
						String query = "insert into cropsuggestion02(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 preparedStatement.executeUpdate();
					}	
				}
				con.close();
				stmt.close();
				preparedStatement.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public int getTempBasedSuggestion(ArrayList<Double> getAllParameters) {
			con = DBConnection.createConnection();
		
			Double temp=getAllParameters.get(2);
			int status=0;
			
			try {
				Statement stmt = con.createStatement();
				String sql ="select * from cropsuggestion02";
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()){
					String id=null;
					String cropSuggestion=rs.getString(2);
					Double rainvalue=rs.getDouble(3);
					Double npkvalue=rs.getDouble(4);
					String season=rs.getString(5);
					Double tempvalue=rs.getDouble(6);
					
					if(temp<=25.0 && tempvalue<=25.0 ) {
						String query = "insert into cropsuggestion03(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 status=preparedStatement.executeUpdate();
					}
					else if(temp>25.0 && temp<=30.0 && tempvalue<=30.0) {
						String query = "insert into cropsuggestion03(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 status=preparedStatement.executeUpdate();
					}
					else if(temp>30.0 && temp<=35.0 && tempvalue<=35.0) {
						String query = "insert into cropsuggestion03(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 status=preparedStatement.executeUpdate();
					}
					else if(temp>35.0 && temp<=60.0 && tempvalue<=60.0) {
						String query = "insert into cropsuggestion03(id,name,rainfall,npk_avg,season,temprature) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, cropSuggestion);
						 preparedStatement.setDouble(3, rainvalue);
						 preparedStatement.setDouble(4, npkvalue);
						 preparedStatement.setString(5, season);
						 preparedStatement.setDouble(6, tempvalue);
						 
						 status=preparedStatement.executeUpdate();
					}	
				}
				con.close();
				stmt.close();
				preparedStatement.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		public Double getAVGYieldPrediction(String region,String crop,String season,String area  ) {
			con = DBConnection.createConnection();
			region = "t_"+region.trim();
			Double yield=0.0;
			Double farmarea=Double.parseDouble(area);
			String sql = "select * from "+region+" where name= '"+crop+"' ";

			System.out.println("Query ..."+sql);
		
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					String cropDB=rs.getString(2);
					String seasonDB=rs.getString(3);
					String yieldDB=rs.getString(4);
					Double cropYield=Double.parseDouble(yieldDB);
					
					if(cropDB==crop && seasonDB==season) {
						yield=cropYield*farmarea;
					}
					else {
						Double yield01=cropYield*farmarea;
						double k = (double)(yield01*(25.0f/100.0f));
						yield=(yield01-k);
					}
				}
				con.close();
				stmt.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return yield;
		}
		
		public ArrayList<String> getCropSuggestion() {
			con = DBConnection.createConnection();
			ArrayList<String> finalcropsuggestion=new ArrayList<String>(); 
			
			
			try {
				Statement stmt = con.createStatement();
				String sql ="select * from cropsuggestion03";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					String crops=rs.getString(2);
					finalcropsuggestion.add(crops);
				}
				con.close();
				stmt.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return finalcropsuggestion;
		}
	
}
