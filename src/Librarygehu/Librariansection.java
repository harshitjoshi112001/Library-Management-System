
package Librarygehu;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Librariansection extends JFrame implements ActionListener{
    
    JLabel img4;
    Font f,f1;
    Librariansection()
    {
        super("Librarian Section");
        
        f=new Font("Arial",Font.CENTER_BASELINE,17);
        f1=new Font("Serif",Font.CENTER_BASELINE,15);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Librarygehu/icons/section.jpg"));
        Image img2=img.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        img4=new JLabel(img3);
        add(img4);
        
        JMenuBar menubar=new JMenuBar();     //menu bar 
        JMenu menu1=new JMenu("Add Info");
        JMenuItem menu1_inner=new JMenuItem("Add Book");
        JMenuItem menu1_inner2=new JMenuItem("Delete Book");
        
        JMenu menu2=new JMenu("View Info");
        JMenuItem menu2_inner=new JMenuItem("View Book");
        JMenuItem menu2_inner2=new JMenuItem("View Issue Book");
        
        JMenu menu3=new JMenu("Issue Info");
        JMenuItem menu3_inner=new JMenuItem("Issue Book");
        
        JMenu menu4=new JMenu("Return");
        JMenuItem menu4_inner=new JMenuItem("Return Book");
        
        JMenu menu5=new JMenu("Exit");
        JMenuItem menu5_inner=new JMenuItem("Logout");
        
        menu1.add(menu1_inner);     //add menuitem to menu
        menu1.add(menu1_inner2);
        menu2.add(menu2_inner); 
        menu2.add(menu2_inner2); 
        menu3.add(menu3_inner); 
        menu4.add(menu4_inner); 
        menu5.add(menu5_inner); 
        
        menubar.add(menu1);     // add all menu to menu bar
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        menubar.add(menu5);
        
        menu1.setFont(f);     //set font
        menu2.setFont(f);
        menu3.setFont(f);
        menu4.setFont(f);
        menu5.setFont(f);
        
        menu1_inner.setFont(f1);
        menu1_inner2.setFont(f1);       //delete book
        menu2_inner.setFont(f1);
        menu2_inner2.setFont(f1);
        menu3_inner.setFont(f1);
        menu4_inner.setFont(f1);
        
        menu1_inner.addActionListener(this);
        menu1_inner2.addActionListener(this);
        menu2_inner.addActionListener(this);
        menu2_inner2.addActionListener(this);
        menu3_inner.addActionListener(this);
        menu4_inner.addActionListener(this);
        menu5_inner.addActionListener(this);
        
        setJMenuBar(menubar);       //set menubar to our frame
        
        setLocation(220,70);
        setSize(1000,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
         String s=ae.getActionCommand();
         
         if(s.equals("Add Book"))
        {
//            System.out.println("add book");
            new Addbook();
        }
          if(s.equals("Delete Book"))
        {
//            System.out.println("Delete book");
            new Deletebook();
        }
        else if(s.equals("View Book"))
        {
//            System.out.println("VIEW book");
            new Viewbook();
        }
        else if(s.equals("View Issue Book"))
        {
//            System.out.println("VIEW issue book");
            new Viewissuebook();
        }
        else if(s.equals("Issue Book"))
        {
//            System.out.println("issue");
            new Issuebook();
        }
        else if(s.equals("Return Book"))
        {
//            System.out.println("return book");
            new Returnbook();
        }
        else if(s.equals("Logout"))
        {
//            new Logutinfo();
            this.setVisible(false);
            Index o=new Index();
            o.setVisible(true);
//            System.exit(0);
        }
    }
    public static void main(String[] ar)
    {
        new Librariansection();
    }
}
