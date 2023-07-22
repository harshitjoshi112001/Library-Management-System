
package Librarygehu;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Viewissuebook extends JFrame{
    String s[]={"BookId","BookNo","BookName","StudentId","StudentName","StudentContact","Date"};
    String s1[][]=new String[50][7];
    int i=0,j=0;
    JTable t;
    Font f;
    
    Viewissuebook()
    {
        super("View Issue Book");
        
        f=new Font("Arial",Font.BOLD,16);
        
        try{
            Connectionclass con=new Connectionclass();
            String ss="Select * from issuebook";
            ResultSet res=con.stm.executeQuery(ss);
            while(res.next())
            {
                s1[i][j++]=res.getString("BookId");
                s1[i][j++]=res.getString("BookNo");
                s1[i][j++]=res.getString("BookName");
                s1[i][j++]=res.getString("StudentId");
                s1[i][j++]=res.getString("StudentName");
                s1[i][j++]=res.getString("StudentContact");
                s1[i][j++]=res.getString("Date");
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
        new Viewissuebook();
    }
}
