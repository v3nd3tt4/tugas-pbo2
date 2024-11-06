/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangsukri.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vendetta
 */
public class Basisdata {
    private static final String URL = "jdbc:mysql://localhost:3306/db_inventaris";
    private static final String USER = "root";
    private static final String PASS = "goldroger27";
    
    public static Connection getConnection(){
        Connection con;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting..");
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected!!");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }
}
