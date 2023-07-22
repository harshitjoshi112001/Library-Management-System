
package Librarygehu;

import java.sql.*;

public class Connectionclass {
    Connection con;
    Statement stm;
    Connectionclass()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","Siyaram@11@11");
            stm=con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] ar){
        new Connectionclass();
    }
}
