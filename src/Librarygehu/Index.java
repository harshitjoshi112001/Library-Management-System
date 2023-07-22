
package Librarygehu;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Index extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;       //J written becoz we use swing library
    JButton bt1,bt2;
    JPanel panel1,panel2,panel3;       // panel 1=image...panel 2=heading ....panel 3=login buttons
    Font f,f1;
    
    Index(){
        
        super("Login Page");
        
     // getContentPane().setBackground(Color.GRAY);           //Color is a class in awt
//        setLayout(null);   
        
        setSize(530,250);
        setLocation(430,250);
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,20);
        
        l1=new JLabel("Admin Login:");
        l2=new JLabel("Librarian Login:");
        l3=new JLabel("Library Management GEHU");
        
        bt1=new JButton("LOGIN");
        bt2=new JButton("LOGIN");
        
        bt1.addActionListener(this);   //this is use becoz it belongs to same class
        bt2.addActionListener(this);
        
        ImageIcon img_logo=new ImageIcon(ClassLoader.getSystemResource("Librarygehu/icons/user_gehu.jpg"));
        Image img_logo2=img_logo.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon img_logo3=new ImageIcon(img_logo2);
        JLabel img_1=new JLabel(img_logo3);
//        img_l.setBounds(340,30,220,160);
//        add(img_l);  
        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f);
        bt1.setFont(f1);
        bt2.setFont(f1);
//        bt1.setBounds(0,0,1,1);
        
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(Color.WHITE);
        
        panel1=new JPanel();
        panel1.setLayout(new GridLayout(2,2,30,30));
        panel1.add(l1);
        panel1.add(bt1);
        panel1.add(l2);
        panel1.add(bt2);
//        panel1.setBackground(Color.GRAY);

        
        panel2=new JPanel();
        panel2.setLayout(new GridLayout(1,1,10,10));   //image set by row
        panel2.add(img_1);   //it is one 1 not L ok
//        panel1.add(bt1);
//        panel1.add(bt2);
        
        panel3=new JPanel();
        panel3.setLayout(new GridLayout(1,1));
        panel3.add(l3);    //add heading
        panel3.setBackground(Color.BLUE);
        
        setLayout(new BorderLayout(10,10));
        add(panel3,"North");
        add(panel2,"West");
        add(panel1,"East");
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == bt1)
        {
//            System.out.println("admin login");
            this.setVisible(false);
            new Admin().setVisible(true);
        }
        else if(e.getSource() == bt2)
        {
//             System.out.println("Librarian login");
            new Librarian();
            this.setVisible(false);
        }
        else
        {
            System.exit(0);
        }
    }
    public static void main(String[] ar)
    {
        new Index().setVisible(true);
    }
}
