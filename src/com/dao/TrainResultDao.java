package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class TrainResultDao {
	static Connection con = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	static PreparedStatement preparedStatement = null;
	
	
	public  int saveTrainResult( Map<List<String>,List<String>> finalResult){
		List<String> decisionFactorValue = new ArrayList<String>();
		List<String> decision = new ArrayList<String>();
		int status=0;
		LinkedHashMap<List<String>,List<String>> obj = new LinkedHashMap<List<String>,List<String>>(finalResult); 
			
		    for (HashMap.Entry<List<String>,List<String>> entry : obj.entrySet()) {  
		    	decisionFactorValue=entry.getKey();
		    	decision=entry.getValue();
		    }
		
			System.out.println("Decision Values..."+decisionFactorValue);
			System.out.println("Decisions..."+decision);

		try {
				con = DBConnection.createConnection();
				
				for(int i=0;i<decisionFactorValue.size();i++) {
						String id=null;
						String value=decisionFactorValue.get(i);
						String dec=decision.get(i);
						
						String query = "insert into trainresult(id,decisionvalue,decision) values (?,?,?)"; //Insert train result into the table 'train-result'
						 
						 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
						 preparedStatement.setString(1, id);
						 preparedStatement.setString(2, value);
						 preparedStatement.setString(3, dec);
						
						
						 status= preparedStatement.executeUpdate();
				}
				if (status!=0) {  //Just to ensure data has been inserted into the database
					 return 1; 
				}
				con.close();
	 	}
		catch(SQLException e){
			 e.printStackTrace();
		}
	 
	 return 0;  // On failure, send a message from here.
	}
	
	public  void updateBusDataStatus(ResultSet rs) throws SQLException{
		while(rs.next()){
    		String str1=rs.getString(2);
    		int i1=Integer.parseInt(str1);
    		con = DBConnection.createConnection();
    		
    		if(i1==250) {
    				String sql = "UPDATE busdata SET utilization = 'NotUtilized' WHERE revenue<=250";
    			try {
    				Statement stmt = con.createStatement();
    				int res1 = stmt.executeUpdate(sql);
    				
    				}catch (Exception e) {
    					e.printStackTrace();
    				} 			
    		}
    		else if(i1==500) {
				String sql = "UPDATE busdata SET utilization = 'Utilized' WHERE revenue<=500 AND revenue>250";
			try {
				Statement stmt = con.createStatement();
				int res1 = stmt.executeUpdate(sql);
				
				}catch (Exception e) {
					e.printStackTrace();
				} 			
    		}
    		else if(i1==750) {
				String sql = "UPDATE busdata SET utilization = 'Moderate' WHERE revenue<=1000 AND revenue>500";
			try {
				Statement stmt = con.createStatement();
				int res1 = stmt.executeUpdate(sql);
				
				}catch (Exception e) {
					e.printStackTrace();
				} 			
    		}
    		else if(i1==1000) {
    			String sql = "UPDATE busdata SET utilization = 'OverUtilized' WHERE revenue>1000";
    			try {
    				Statement stmt = con.createStatement();
    				int res1 = stmt.executeUpdate(sql);
    				
    				}catch (Exception e) {
    					e.printStackTrace();
    				} 		
    		}
		}
	}
		public ResultSet selectTrainResult() {
			con = DBConnection.createConnection();
			ResultSet rs=null;
			String sql = "Select * from trainresult";
			try {
				Statement stmt = con.createStatement();
			     rs = stmt.executeQuery(sql);
			
				}catch (Exception e) {
					e.printStackTrace();
				}
			return rs;
		}
		
		public void deleteTrainResult() {
			con = DBConnection.createConnection();
			
			String sql = "truncate table trainresult";
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
			
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
}