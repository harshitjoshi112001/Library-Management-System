
package Librarygehu;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;

/*//import java.awt.*;
//import javax.swing.*;
//import java.sql.*;
//
public class AddLibrarian extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,top1;
    JPanel top,content;
    Font ftop;
    JTextField l1text,l3text,l4text,l5text,l6text;
    JPasswordField l2pass;
    JButton add,cancel;
    AddLibrarian()
    {
        super("Add Librarian");
        setLayout(null);
        
        top1=new JLabel("Add Librarian");
        ftop=new Font("Arial",Font.BOLD,22);
        top1.setFont(ftop);
        top1.setHorizontalAlignment(JLabel.CENTER);
        top1.setForeground(Color.WHITE);
        
        top=new JPanel();
        top.setLayout(new GridLayout(1,1,10,10));
        top.add(top1);
        top.setBackground(Color.BLUE);
        
        
        
        l1=new JLabel("Name:");
        l1.setBounds(30,40,100,30);
        l1.setFont(new Font("Serif",Font.ROMAN_BASELINE,20));
        add(l1);
        l1text = new JTextField();
        l1text.setBounds(300,40,150,30);
        add(l1text);
        
        l2=new JLabel("Password:");
        l2.setBounds(30,90,100,30);
        l2.setFont(new Font("Serif",Font.ROMAN_BASELINE,20));
        add(l2);
        l2pass = new JPasswordField();
        l2pass.setBounds(300,90,150,30);
        add(l2pass);
        
        l3=new JLabel("EMail:");
        l3.setBounds(30,140,100,30);
        l3.setFont(new Font("Serif",Font.ROMAN_BASELINE,20));
        add(l3);
        l3text = new JTextField();
        l3text.setBounds(300,140,150,30);
        add(l3text);
        
        l4=new JLabel("Contact:");
        l4.setBounds(30,190,100,30);
        l4.setFont(new Font("Serif",Font.ROMAN_BASELINE,20));
        add(l4);
        l4text = new JTextField();
        l4text.setBounds(300,190,150,30);
        add(l4text);
        
        l5=new JLabel("Address:");
        l5.setBounds(30,240,100,30);
        l5.setFont(new Font("Serif",Font.ROMAN_BASELINE,20));
        add(l5);
        l5text = new JTextField();
        l5text.setBounds(300,240,150,30);
        add(l5text);
        
        l6=new JLabel("City:");
        l6.setBounds(30,290,100,30);
        l6.setFont(new Font("Serif",Font.ROMAN_BASELINE,20));
        add(l6);
        l6text = new JTextField();
        l6text.setBounds(300,290,150,30);
        add(l6text);
        
        add=new JButton("Add Librarian");
        add.setFont(new Font("Arial",Font.BOLD,20));
        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Arial",Font.BOLD,20));
        
        add.addActionListener(this);
        cancel.addActionListener(this);
        
        content=new JPanel();
        content.setLayout(new GridLayout(7,2,30,10));
        content.add(l1);
        content.add(l1text);
        content.add(l2);
        content.add(l2pass);
        content.add(l3);
        content.add(l3text);
        content.add(l4);
        content.add(l4text);
        content.add(l5);
        content.add(l5text);
        content.add(l6);
        content.add(l6text);
        content.add(add);
        content.add(cancel);
        
        setLayout(new BorderLayout(10,10));
        add(top,"North");
        add(content,"Center");
        
        
        setSize(540,400);
        setLocation(430,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        
    }
    public static void main(String[] ar)
    {
        new AddLibrarian();
    }
}
*/
public class AddLibrarian extends JFrame implements ActionListener{

   
    AddLibrarian() {
        super("Add Librarian");
        
//        initComponents();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Librarian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Name        :");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Password  :");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("E-Mail       :");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Contact     :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Address    :");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("City          :");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Add Librarian");


        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        pack();
        setVisible(true);
    }

//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    public void initComponents() {
//        
//    }// </editor-fold>                                                                 

    public void actionPerformed(ActionEvent evt) {                                         
        String name=jTextField1.getText();
        String pass=jPasswordField1.getText();
        String email=jTextField2.getText(); 
        String contact=jTextField3.getText(); 
        String address=jTextField4.getText();
        String city=jTextField5.getText();
        
        if(evt.getSource()==jButton1)
        {
            try
            {
                Connectionclass obj=new Connectionclass();
                String q="insert into librarian1(name,password,email,contact,address,city) values('"+name+"','"+pass+"','"+email+"','"+contact+"','"+address+"','"+city+"')";   //making sql query
                int a=obj.stm.executeUpdate(q);    // update sql query
                if(a==1)
                {
                    JOptionPane.showMessageDialog(null,"Your data successfully added");
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please!! Fill all detail carefully");
                    this.setVisible(true);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(evt.getSource()==jButton2)
        {
            this.setVisible(false);
        }         
          
    } 

    
    public static void main(String args[]) {
                new AddLibrarian();

    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}
