
package Librarygehu;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Deletebook extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1,tf2;
    Font f,f1;
    JButton bt1,bt2;
    JPanel p1,p2;
    
    Deletebook()
    {
        super("Delete Book");
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.PLAIN,20);
        
        l1=new JLabel("Delete Book");
        l2=new JLabel("Enter Book Id");
        l3=new JLabel("Enter Book Name");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.WHITE);
        
        tf1=new JTextField();
        tf2=new JTextField();
        
        bt1=new JButton("Delete");
        bt2=new JButton("Cancel");
        
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        tf1.setFont(f1);
        tf2.setFont(f1);
        
        bt1.setFont(f1);
        bt2.setFont(f1);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);   //heading add
        p1.setBackground(Color.BLUE);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(3,2,10,10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p2.add(bt1);
        p2.add(bt2);
        
        setLayout(new BorderLayout(10,10));
        add(p1,"North");
        add(p2,"Center");
        
        setLocation(500,200);
        setSize(480,200);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
//        Librariansection lb=new Librariansection();
        if(e.getSource()==bt1)
        {
            String bookno=tf1.getText();          //book id
            String bookname=tf2.getText();
            try
            {
                Connectionclass con=new Connectionclass();
                String s="delete from addbook where BookNo='"+bookno+"' and BookName='"+bookname+"'";
                int res=con.stm.executeUpdate(s);
                if(res == 1)
                {                        
                    JOptionPane.showMessageDialog(null,"Book deleted....");
                    this.setVisible(false);
//                    lb.show();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Oops...Please fill detail correctly!!");
                    this.setVisible(false);
                }
            }catch(Exception ae)
            {
                ae.printStackTrace();
                System.out.println("Error");
            }
        }
        if(e.getSource()==bt2)
        {
            JOptionPane.showMessageDialog(null,"Okkk Byeee!!!");
            setVisible(false);
//            lb.show();
        }
    }
    public static void main(String[] args)
    {
        new Deletebook();
    }
}
