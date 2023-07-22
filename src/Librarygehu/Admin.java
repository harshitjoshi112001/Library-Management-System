
package Librarygehu;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Admin extends JFrame implements ActionListener {
    
    JButton login,cancel;
    JTextField inusername;
    JPasswordField inpassword;
    JPanel jp;
    Admin()
    {
        super("Admin Login Page");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        JLabel heading=new JLabel("Admin Login");
        heading.setBounds(150,7,200,27);
        heading.setFont(new Font("Arial",Font.BOLD,23));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name=new JLabel("USERNAME:");
        name.setBounds(40,60,100,20);
        name.setFont(new Font("Arial",Font.BOLD,15));
        add(name);
        inusername=new JTextField();    // placeholder
        inusername.setBounds(160,50,180,30);
        add(inusername);
        
        JLabel password=new JLabel("PASSWORD:");
        password.setBounds(40,100,100,20);
        password.setFont(new Font("Arial",Font.BOLD,15));
        add(password);
        inpassword=new JPasswordField();
        inpassword.setBounds(160,100,180,30);
        add(inpassword);
        
        login=new JButton("Login");
        login.setBounds(70,160,130,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("serif",Font.BOLD,17));
        add(login);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(230,160,130,30);  //(x , y, width, height);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif",Font.BOLD,17));
        add(cancel);
        

        
        
        setSize(450,250);
        setLocation(430,250);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String name=inusername.getText();
        String pass = inpassword.getText();
         
        if(e.getSource() == login)
        {
          try{
              Connectionclass obj=new Connectionclass();
              String s="select * from admin where username='"+name+"' and password='"+pass+"'";
              
              ResultSet result=obj.stm.executeQuery(s);
              if(result.next())
              {
//                  System.out.println("Admin section");
                  this.setVisible(false);
                  new Adminsection().setVisible(true);
              }
              else
              {
                  //this is use to show incorrection;
                  JOptionPane.showMessageDialog(null,"Your username and password is incorrect"); 
                  this.setVisible(false);
                  this.setVisible(true);
              }
          }catch(Exception ae){
              ae.printStackTrace();
          }
            
        }
        else if(e.getSource() == cancel)
        {
            this.setVisible(false);
            Index o=new Index();
            o.setVisible(true);
        }
    }
    public static void main(String[] ar)
    {
        new Admin();
    }
}
