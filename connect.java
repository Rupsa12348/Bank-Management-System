package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connect {
    Connection connection ;
    Statement statement;
    public  connect(){
        try{
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "sumirup@1234");
           statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
