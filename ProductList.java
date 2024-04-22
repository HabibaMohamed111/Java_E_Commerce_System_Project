import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ProductList extends JFrame implements ActionListener{


    private int ind=0;
    protected Cart cart;
    ProductList [] array;
   // Order order=new Order(cart.getCustomerId(), 1, cart.getProducts());
    EcommerceSystemGUI e1=new EcommerceSystemGUI();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel label1 = new JLabel("SmartPhone");
    JLabel label2 = new JLabel("$599.99");

    JButton b1 = new JButton(" Add ");
    JButton b2 = new JButton(" Remove ");

    JLabel label7=new JLabel();

    JLabel label3 = new JLabel("T-Shirt");
    JLabel label4 = new JLabel("$19.99");

    JButton b3 = new JButton(" Add ");
    JButton b4 = new JButton(" Remove ");

    JLabel label8=new JLabel();

    JLabel label5 = new JLabel("OOP");
    JLabel label6 = new JLabel("$39.99");

    JButton b5 = new JButton(" Add ");
    JButton b6 = new JButton(" Remove ");

    JLabel label9=new JLabel();
    JLabel label10=new JLabel();

    JButton button=new JButton("Place Order");

    public void setCart(Cart c){
        this.cart=c;
    }
    public ProductList() {

        this.setTitle("Products");
        this.setSize(400, 900);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 50);

        label7.setBackground(Color.PINK);
        label7.setOpaque(true);
        label7.setBounds(10, 80, 150, 60);
        label7.setLayout(null);

        label8.setBackground(Color.PINK);
        label8.setOpaque(true);
        label8.setBounds(480, 80, 150, 60);
        label8.setLayout(null);

        label9.setBackground(Color.PINK);
        label9.setOpaque(true);
        label9.setBounds(1120, 80, 150, 60);
        label9.setLayout(null);

        label1.setBounds(200, 20, 100, 80);
        label1.setFont(new Font("SmartPhone", Font.BOLD, 15));
        label7.add(label1);

        label2.setBounds(40, 20, 100, 80);
        label2.setFont(new Font("$599.99", Font.BOLD, 15));
        label7.add(label2);

        b1.setBounds(200, 100, 100, 50);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setFont(new Font("Add", Font.BOLD, 15));
        b1.setForeground(Color.WHITE);
        label7.add(b1);

        b2.setBounds(30, 100, 130, 50);
        b2.setBackground(Color.DARK_GRAY);
        b2.setFont(new Font("Remove", Font.BOLD, 15));
        b2.setForeground(Color.WHITE);
        label7.add(b2);
        button.setBounds(100,80,30,50);
        button.setFont(new Font("Place Order", Font.BOLD, 15));
        label10.add(button);


        label3.setBounds(220, 20, 100, 80);
        label3.setFont(new Font("T-Shirt", Font.BOLD, 15));
        label8.add(label3);

        label4.setBounds(60, 20, 100, 80);
        label4.setFont(new Font("$19.99", Font.BOLD, 15));
        label8.add(label4);

        b3.setBounds(200, 100, 100, 50);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setFont(new Font("Add", Font.BOLD, 15));
        b3.setForeground(Color.WHITE);
        label8.add(b3);

        b4.setBounds(30, 100, 130, 50);
        b4.setBackground(Color.DARK_GRAY);
        b4.setFont(new Font("Remove", Font.BOLD, 15));
        b4.setForeground(Color.WHITE);
        label8.add(b4);




        label5.setBounds(220, 20, 100, 80);
        label5.setFont(new Font("OOP", Font.BOLD, 15));
        label9.add(label5);

        label6.setBounds(60, 20, 100, 80);
        label6.setFont(new Font("$39.99", Font.BOLD, 15));
        label9.add(label6);

        b5.setBounds(200, 100, 100, 50);
        b5.setBackground(Color.LIGHT_GRAY);
        b5.setFont(new Font("Add", Font.BOLD, 15));
        b5.setForeground(Color.WHITE);
        label9.add(b5);

        b6.setBounds(30, 100, 130, 50);
        b6.setBackground(Color.DARK_GRAY);
        b6.setFont(new Font("Remove", Font.BOLD, 15));
        b6.setForeground(Color.WHITE);
        label9.add(b6);


        this.setLayout(new GridLayout(4,1,10,1));
        this.add(label7);this.add(label8);this.add(label9);this.add(button);
        //this.getLayout().addLayoutComponent("Button", button);

       button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
           SwingUtilities.invokeLater(()->new OrderPlace());

        }
    }

}
