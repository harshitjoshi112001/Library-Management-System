
package Librarygehu;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Viewbook extends JFrame{
    
    String s[]={"Book_No" , "Book_Name" , "Author" , "Publisher" , "Quantity" , "Issue_Book","Date-Time"};
    String s1[][]=new String[50][7];
    int i=0,j=0;
    JTable t;
    Font f;
    
    Viewbook()
    {
        super("View Book Info");
        
        f=new Font("Arial",Font.BOLD,16);
        
        try{
            Connectionclass con=new Connectionclass();
            String ss="Select * from addbook";
            ResultSet res=con.stm.executeQuery(ss);
            while(res.next())
            {
//                s1[i][j++]=res.getString("Id");
                s1[i][j++]=res.getString("BookNo");
                s1[i][j++]=res.getString("BookName");
                s1[i][j++]=res.getString("author");
                s1[i][j++]=res.getString("Publisher");
                s1[i][j++]=res.getString("Quantity");
                s1[i][j++]=res.getString("Issuebook");
                s1[i][j++]=res.getString("date");
                i++;
                j=0;
            }
            t=new JTable(s1,s);
            t.setFont(f);
            t.setBackground(new java.awt.Color(255, 204, 204));
        }
        catch(Exception e){
            System.out.print("error");
            e.printStackTrace();
        }
        
        JScrollPane sp=new JScrollPane(t);
        add(sp);
        
        setLocation(220,120);
        setSize(1100,400);
        setVisible(true);
    }
   
    public static void main(String a[])
    {
        new Viewbook();
    }
}
