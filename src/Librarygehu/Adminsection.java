
package Librarygehu;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Adminsection extends JFrame implements ActionListener{
    
    JLabel img4;
    Font f,f1;
    Adminsection()
    {
        super("Admin Section");
        
        f=new Font("Arial",Font.CENTER_BASELINE,17);
        f1=new Font("Serif",Font.CENTER_BASELINE,15);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Librarygehu/icons/gehu_img-new2.jpg"));
        Image img2=img.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        img4=new JLabel(img3);
        add(img4);
        
        JMenuBar menubar=new JMenuBar();     //menu bar 
        JMenu menu1=new JMenu("Add Info");
        JMenuItem menu1_inner=new JMenuItem("Add Librarian");
        
        JMenu menu2=new JMenu("View Info");
        JMenuItem menu2_inner=new JMenuItem("View Librarian");
        
        JMenu menu3=new JMenu("Delete");
        JMenuItem menu3_inner=new JMenuItem("Delete Information");
        
        JMenu menu4=new JMenu("Exit");
        JMenuItem menu4_inner=new JMenuItem("Logout");
        
        menu1.add(menu1_inner);     //add menuitem to menu
        menu2.add(menu2_inner); 
        menu3.add(menu3_inner); 
        menu4.add(menu4_inner); 
        
        menubar.add(menu1);     // add all menu to menu bar
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        
        menu1.setFont(f);     //set font
        menu2.setFont(f);
        menu3.setFont(f);
        menu4.setFont(f);
        
        menu1_inner.setFont(f1);
        menu2_inner.setFont(f1);
        menu3_inner.setFont(f1);
        menu4_inner.setFont(f1);
        
        menu1_inner.addActionListener(this);
        menu2_inner.addActionListener(this);
        menu3_inner.addActionListener(this);
        menu4_inner.addActionListener(this);
        
        setJMenuBar(menubar);       //set menubar to our frame

        
        setLocation(220,70);
        setSize(1000,600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
        String s=ae.getActionCommand();
        if(s.equals("Add Librarian"))
        {
//            System.out.println("add");
            new AddLibrarian();
        }
        else if(s.equals("View Librarian"))
        {
//            System.out.println("VIEW");
            new ViewLibrarian();
        }
        else if(s.equals("Delete Information"))
        {
//            System.out.println("delete");
            new Deleteinfo();
        }
        else if(s.equals("Logout"))
        {
//            new Logutinfo();
            new Index().setVisible(true);
            this.setVisible(false);
        }
       
    }
    public static void main(String args[])
    {        
        new Adminsection();
        
    }
}
