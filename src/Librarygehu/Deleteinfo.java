
package Librarygehu;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class Deleteinfo extends JFrame implements ActionListener{
    String s[]={"Id" , "Name" , "Password" , "E-mail" , "Contact" , "Address" , "City"};
    String s1[][]=new String[50][7];
    JButton bt;
    int i=0,j=0;
    JTable t;
    Font f,f1;
    JTextField text;
    JPanel jp;
    JLabel l1;
    
    Deleteinfo()
    {
        super("Delete Info");
        
        f=new Font("Arial",Font.BOLD,15);
        f1=new Font("Serif",Font.BOLD,17);
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
        l1=new JLabel("Delete Librarian");
        text=new JTextField();    //textfield
        bt=new JButton("Delete");
        bt.addActionListener(this);
        bt.setFont(f1);
        l1.setFont(f);
        text.setFont(f);
        
        jp=new JPanel();     //panel of 3 column 
        jp.setLayout(new GridLayout(1,3,10,10));
        jp.add(l1);
        jp.add(text);
        jp.add(bt);
        setLayout(new BorderLayout(10,10));
        
        add(sp,"Center");
        add(jp,"South");
//        add(sp);             scrollpane
        
        setLocation(240,120);
        setSize(1000,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == bt && !text.getText().equals(""))
        {
            int id=Integer.parseInt(text.getText());     // change textfield to intger  
            try{
                Connectionclass ob=new Connectionclass();
                String q="delete from librarian1 where Lid='"+id+"'";      //it will delete the data from table
                int res=ob.stm.executeUpdate(q);       //return 1 for true it will update
                
                if(res==1)
                {
                    JOptionPane.showMessageDialog(null,"Your data is successfully deleteted");
                    setVisible(false);
                    new Deleteinfo().setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Your data is did not successfully deleteted");
                    setVisible(false);
                    new Deleteinfo().setVisible(true);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please!!!Enter ID...");
        }
    }
    public static void main(String[] arg)
    {
        new Deleteinfo();
    }
}
