
package Librarygehu;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Returnbook extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField tf1,tf2;
    Font f,f1;
    JButton bt1,bt2;
    JPanel p1,p2;
    
    Returnbook()
    {
        super("Return Books");
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.PLAIN,20);
        
        l1=new JLabel("Return Books");
        l2=new JLabel("Book Id");
        l3=new JLabel("Student ID");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.WHITE);
        
        tf1=new JTextField();
        tf2=new JTextField();
        
        bt1=new JButton("Return Book");
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
//        System.out.print("error hello");
        
        if(e.getSource()==bt1)
        {
            String bookno=tf1.getText();
            int stuid=Integer.parseInt(tf2.getText());
            try{
                Connectionclass con=new Connectionclass();
                String s="delete from issuebook where BookNo='"+bookno+"'andStudentId='"+stuid+"'";
                int res=con.stm.executeUpdate(s);
                if(res == 0)
                {                        
                    JOptionPane.showMessageDialog(null,"Book is not Issue!!1");
                    this.setVisible(false);                                               
                }
                else
                {
                    String q1="update addbook set IssueBook=IssueBook-1 where BookNo='"+bookno+"'";
                    String q2="update addbook set Quantity=Quantity+1 where BookNo='"+bookno+"'";
                    int a1=con.stm.executeUpdate(q1);
                    int a2=con.stm.executeUpdate(q2);
                    
                    if(a1==1)
                    {
                        if(a2==1)
                        {
                            JOptionPane.showMessageDialog(null,"You successfully returned...");
                            this.setVisible(false);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Please!!!!Fill carefully...");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please!!!!Fill carefully...");
                    }
                }
                                
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
        if(e.getSource() == bt2)
        {
            JOptionPane.showMessageDialog(null,"Are you sure!!!");
            setVisible(false);

        }
    }
    public static void main(String[] args)
    {
        new Returnbook();
    }
}
