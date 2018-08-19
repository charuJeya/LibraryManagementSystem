/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.model;
import com.sgc.data.databaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Saruga
 */
public class BookDAO {
    public void saveBook(book bk) throws ClassNotFoundException,SQLException {
        databaseConnection dbconnection = new databaseConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement(); 
        String sql="insert into bookdetails(bookId,title,author,mainClassification,subClassification,yearOfPublishing,lastPrintedYear,isbnNo,noOfPages) values('"+bk.getBookId()+"','"+bk.getAuthor()+"','"+bk.getTitle()+"','"+bk.getMainClassification()+"','"+bk.getSubClassification()+"','"+bk.getYearOfPublishing()+"','"+bk.getLastPrintedYear()+"','"+bk.getIsbnNo()+"','"+bk.getNoOfPages()+"')";
//        String sql = "insert into bookdetails(`bookId`, `title`, `author`, `mainClassification`, `subClassification`, `yearOfPublishing`, `lastPrintedYear`, `isbnNo`, `noOfPages`) values('"+addbook.getBookId()+"','"+addbook.getTitle()+"','"+addbook.getAuthor()+"','"+addbook.getMainClassification()+"','"+addbook.getSubClassification()+"','"+addbook.getYearOfPublishing()+"','"+addbook.getLastPrintedYear()+"','"+addbook.getIsbnNo()+"','"+addbook.getNoOfPages()+"')";
//       String sql = "insert into bookdetails  values('1','1','1','1','1','1','1','1','1')";
        statement.execute(sql);
}
    
    public List M_name(){
         List<String> classificationList=new ArrayList<>();
        try{ 
            databaseConnection dbconnection = new databaseConnection();
        Connection con = dbconnection.getDbConnection();
        
        String query="select mainClassificationName from mainclassification ";
        
        Statement stmt = con.createStatement();
       ResultSet rs= stmt.executeQuery(query);
       
            while (rs.next()) {
               classificationList.add(rs.getString("mainClassificationName"));
                System.out.println("test"+rs.getString("mainClassificationName"));
            }
        }
              
      catch(SQLException e){
           System.out.println(e.toString());
       }
       
    return classificationList;
    }
    
    
    
    public List S_name(){
         List<String> classificationList=new ArrayList<>();
        try{ 
            databaseConnection dbconnection = new databaseConnection();
        Connection con = dbconnection.getDbConnection();
        
        String query="select subClassificationName from subclassification ";
        
        Statement stmt = con.createStatement();
       ResultSet rs= stmt.executeQuery(query);
       
            while (rs.next()) {
               classificationList.add(rs.getString("subClassificationName"));
               System.out.println("test"+rs.getString("subClassificationName"));
            }
        }
              
      catch(SQLException e){
           System.out.println(e.toString());
       }
       
    return classificationList;
    }
       public List Subclassificationname(String mname){
        List<String> subclassificationList=new ArrayList<>();
        try{    
        databaseConnection dbconnection = new databaseConnection();
        Connection con =dbconnection.getDbConnection();
        String query="select subClassificationName from subclassification sc join mainclassification mc on sc.mainClassificationId=mc.mainClassificationId where mainclassification='"+mname+"'";
        Statement stmt = con.createStatement();
        
       ResultSet rs= stmt.executeQuery(query);
       
       
            while (rs.next()) {
               subclassificationList.add(rs.getString("subClassificationName"));
                System.out.println("test"+rs.getString("subClassificationName"));
            }
            
        }
             
      catch(SQLException e)
       {
           System.out.println(e.toString());
       }
       
    return subclassificationList;  
     }          
    
}

