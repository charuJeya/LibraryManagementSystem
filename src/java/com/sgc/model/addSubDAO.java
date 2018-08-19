/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.model;

import com.sgc.data.databaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Saruga
 */
public class addSubDAO {
    public void saveSub(addSub sub) throws ClassNotFoundException,SQLException {
        databaseConnection dbconnection = new databaseConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement(); 
        String sql="insert into subclassification(subClassificationId,subClassificationName,mainClassificationName) values('"+sub.getSubClassificationId()+"','"+sub.getSubClassificationName()+"','"+sub.getMainClassificationName()+"')";

 
        statement.execute(sql);
}
}
