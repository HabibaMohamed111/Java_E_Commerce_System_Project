 import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EcommerceSystemGUI extends JFrame implements ActionListener {

    //panel

    JPanel n = new JPanel();
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JTextField t4=new JTextField();
    JButton b1=new JButton("Create");
    JLabel l1=new JLabel("Welcome to the E-Commerce System !");
    JLabel l2=new JLabel("ID:");
    JLabel l3=new JLabel("Name:");
    JLabel l4=new JLabel("Address:");
    JLabel l5=new JLabel("How many products you want to add to your cart ?");
    public EcommerceSystemGUI()
    {

        this.setTitle("EcommerceSystem");
        this.setSize(500, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 100);
        n.setBackground(Color.pink);
        this.add(n);
        n.setLayout(null);
        l1.setBounds(80, 10, 400, 100);
        l1.setFont(new Font("Welcome to the E-Commerce System !",Font.PLAIN,20));
        n.add(l1);

        l2.setBounds(100, 100, 200, 30);
        l2.setFont(new Font("ID:",Font.PLAIN,20));
        n.add(l2);
        t1.setBounds(200, 100, 200, 30);
        n.add(t1);

        l3.setBounds(100, 150, 200, 30);
        l3.setFont(new Font("Name:",Font.PLAIN,20));
        n.add(l3);
        t2.setBounds(200, 150, 200, 30);
        n.add(t2);

        l4.setBounds(100, 200, 200, 30);
        l4.setFont(new Font("Address:",Font.PLAIN,20));
        n.add(l4);
        t3.setBounds(200, 200, 200, 30);
        n.add(t3);

        l5.setBounds(15, 300, 450, 30);
        l5.setFont(new Font("How many products you want to add to your cart ?",Font.PLAIN,20));
        n.add(l5);
        t4.setBounds(130, 350, 200, 30);
        n.add(t4);

        b1.setBounds(160,400,150,50);
        b1.setBackground(Color.lightGray);
        b1.setFont(new Font("Create",Font.PLAIN,30));
        //b1.setBorder();
        n.add(b1);
        b1.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            SwingUtilities.invokeLater(()->new ProductList());
            //ProductList p=new ProductList();

            //p.setNp(Integer.parseInt(t4.getText()));
            //Cart cart=new Cart(Integer.parseInt(t1.getText()),Integer.parseInt(t4.getText()));


        }
    }
}








