package com.piash;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;

    public static Connection createC(){

       try {
           Class.forName("com.mysql.jdbc.Driver");
           String user = "root";
           String password = "Piash328911*#*";
           String url = "jdbc:mysql://localhost:3306/student";
           con = DriverManager.getConnection(url, user, password);



       }catch(Exception e){
           e.printStackTrace();
       }
       return con;
    }
}
