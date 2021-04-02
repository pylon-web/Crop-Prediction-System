package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.*;


public class SVMTrainModel {
	static Connection con = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	static PreparedStatement preparedStatement = null;
	
	
	
		public int trainSoilData() {
			con = DBConnection.createConnection();
			int status=0;
			String sql = "Select * from soil_types";
			
			try { 		
				Statement stmt = con.createStatement();
				String sql1 = "TRUNCATE TABLE soiltraindata;";
	    		ResultSet rs1 = stmt.executeQuery(sql1);
				ResultSet rs = stmt.executeQuery(sql);
				
	    		
				while(rs.next()){
					String id=null;
					String soilname=rs.getString(2);
		    		String nitrogen=rs.getString(5);
		    		Double d1=Double.parseDouble(nitrogen);
		    		String Phosphorous=rs.getString(6);
		    		Double d2=Double.parseDouble(Phosphorous);
		    		String potassium=rs.getString(7);
		    		Double d3=Double.parseDouble(potassium);
		    		
		    		
		    		double total=d1+d2+d3;
		    		double avg=(total/3);
		    		
		    		
		    		String query = "insert into soiltraindata(id,soiltype,NPK_Avg) values (?,?,?)"; //Insert train result into the table 'train-result'
					 
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, soilname);
					 preparedStatement.setDouble(3, avg);
					
					status=preparedStatement.executeUpdate();
					total=0;
					avg=0.0f;
				}
			
				}catch (Exception e) {
					e.printStackTrace();
				}
			return status;
		}
		
		public static Double getSumAll(List<Double> al) {
			Double total=0.0;
			for(int i=0;i<al.size();i++) {
				total=total+(al.get(i));
			}
			return total;
		}
		
		public int trainRainfallData() {
			con = DBConnection.createConnection();
			LinkedList<Double> totalrainfall = new LinkedList<Double>();
			LinkedList<String> totaltaluka = new LinkedList<String>();
			String sql = "Select * from rainfall";
			int status=0;
			try {
				List<Double> t1 = new ArrayList<Double>();
				List<Double> t2 = new ArrayList<Double>();
				List<Double> t3 = new ArrayList<Double>();
				List<Double> t4 = new ArrayList<Double>();
				List<Double> t5 = new ArrayList<Double>();
				List<Double> t6 = new ArrayList<Double>();
				List<Double> t7 = new ArrayList<Double>();
				List<Double> t8 = new ArrayList<Double>();
				List<Double> t9 = new ArrayList<Double>();
				List<Double> t10 = new ArrayList<Double>();
				List<Double> t11 = new ArrayList<Double>();
				List<Double> t12 = new ArrayList<Double>();
				List<Double> t13 = new ArrayList<Double>();
				List<Double> t14 = new ArrayList<Double>();
				
				Statement stmt = con.createStatement();
				String sql1 = "TRUNCATE TABLE rainfalltraindata;";
	    		ResultSet rs1 = stmt.executeQuery(sql1);
				ResultSet rs = stmt.executeQuery(sql);
				
				
				while(rs.next()){
					
					t1.add(rs.getDouble(2));
					t2.add(rs.getDouble(3));
					t3.add(rs.getDouble(4));
					t4.add(rs.getDouble(5));
					t5.add(rs.getDouble(6));
					t6.add(rs.getDouble(7));
					t7.add(rs.getDouble(8));
					t8.add(rs.getDouble(9));
					t9.add(rs.getDouble(10));
					t10.add(rs.getDouble(11));
					t11.add(rs.getDouble(12));
					t12.add(rs.getDouble(13));
					t13.add(rs.getDouble(14));
					t14.add(rs.getDouble(15));


		    		
				}
				
				Double d1=getSumAll(t1);
				Double d2=getSumAll(t2);
				Double d3=getSumAll(t3);
				Double d4=getSumAll(t4);
				Double d5=getSumAll(t5);
				Double d6=getSumAll(t6);
				Double d7=getSumAll(t7);
				Double d8=getSumAll(t8);
				Double d9=getSumAll(t9);
				Double d10=getSumAll(t10);
				Double d11=getSumAll(t11);
				Double d12=getSumAll(t12);
				Double d13=getSumAll(t13);
				Double d14=getSumAll(t14);
				
				totalrainfall.add(d1);
				totalrainfall.add(d2);
				totalrainfall.add(d3);
				totalrainfall.add(d4);
				totalrainfall.add(d5);
				totalrainfall.add(d6);
				totalrainfall.add(d7);
				totalrainfall.add(d8);
				totalrainfall.add(d9);
				totalrainfall.add(d10);
				totalrainfall.add(d11);
				totalrainfall.add(d12);
				totalrainfall.add(d13);
				totalrainfall.add(d14);
				totaltaluka.add("punecity");
				totaltaluka.add("haveli");
				totaltaluka.add("mulasi");
				totaltaluka.add("bhor");
				totaltaluka.add("maval");
				totaltaluka.add("velhe");
				totaltaluka.add("junnar");
				totaltaluka.add("khed");
				totaltaluka.add("ambegaon");
				totaltaluka.add("shirur");
				totaltaluka.add("baramati");
				totaltaluka.add("indapur");
				totaltaluka.add("daund");
				totaltaluka.add("purandar");
						
		    	for(int i=0;i<totalrainfall.size();i++) {	
					
		    		double avg=(totalrainfall.get(i)/10.0);
		    		String taluka=totaltaluka.get(i);
					String id=null;
					
		    		String query = "insert into rainfalltraindata(id,taluka,rainfall_avg) values (?,?,?)"; //Insert train result into the table 'train-result'
					 
					 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
					 preparedStatement.setString(1, id);
					 preparedStatement.setString(2, taluka);
					 preparedStatement.setDouble(3, avg);
					
					status=preparedStatement.executeUpdate();
					taluka=null;
					avg=0.0f;
				}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			return status;
		}
		
}