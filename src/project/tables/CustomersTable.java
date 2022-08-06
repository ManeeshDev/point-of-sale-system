/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.tables;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maneesh
 */
public class CustomersTable {
    
    public static void createCustomersTable(Statement stmt) throws SQLException {
        
        stmt.executeUpdate(
                "CREATE TABLE customers("
                    + "id int NOT NULL AUTO_INCREMENT, "
                    + "fname varchar(200) NOT NULL, "
                    + "lname varchar(50) NOT NULL, "
                    + "contact varchar(50) NOT NULL, "
                    + "sex varchar(50) NOT NULL, "
                    + "address varchar(50) NOT NULL, "
                    + "time varchar(50) NOT NULL, "
                    + "date varchar(50) NOT NULL, "
                    + "email varchar(50) NOT NULL"
                    + "PRIMARY KEY (id) )"
        );
        
    }

}
