
package Librarygehu;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class ViewLibrarian extends JFrame
{
    String s[]={"Id" , "Name" , "Password" , "E-mail" , "Contact" , "Address" , "City"};
    String s1[][]=new String[50][7];
    JButton bt;
    int i=0,j=0;
    JTable t;
    Font f,f1;
    
    ViewLibrarian(){
        
        super("View Librarian Detail");
        
        f=new Font("Arial",Font.BOLD,15);
        
        try{
            Connectionclass obj=new Connectionclass();
            String q="Select * from librarian1";
            ResultSet result=obj.stm.executeQuery(q);
            
            while(result.next())     //read the column wise data in mysql table unitl one data is complete
            {
                s1[i][j++]=result.getString("Lid");
                s1[i][j++]=result.getString("name");
                s1[i][j++]=result.getString("password");
                s1[i][j++]=result.getString("email");
                s1[i][j++]=result.getString("contact");
                s1[i][j++]=result.getString("address");
                s1[i][j++]=result.getString("city");
                i++;
                j=0;   //again gives table data until whole data is add
            }
            t=new JTable(s1,s);     //form a table
            t.setFont(f);
            t.setBackground(new java.awt.Color(255, 204, 204));
        }
        catch(Exception e) 
        {
           e.printStackTrace();
        }
        
        JScrollPane sp=new JScrollPane(t);
        add(sp);
        
        setLocation(240,120);
        setSize(1000,500);
        setVisible(true);
    }
    
    
    public static void main(String args[]){
                new ViewLibrarian();

    }
}
