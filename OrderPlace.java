import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class OrderPlace extends JFrame {

    JPanel panel1=new JPanel();
    JLabel label1=new JLabel("Here 's your order 's summary");
    JLabel label2=new JLabel("Order ID : ");
    JLabel label3=new JLabel("Customer ID : ");
    JLabel label4=new JLabel("Products : ");
    JLabel label5=new JLabel("Total Price : $ ");
    JButton button=new JButton("OK");

    public OrderPlace(){

        this.setTitle(" Your Place Order");
        this.setSize(500, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 100);
        panel1.setBackground(Color.WHITE);
        this.add(panel1);
        panel1.setLayout(null);


        label1.setBounds(100, 0, 500, 100);
        label1.setFont(new Font("Here 's your order 's summary",Font.BOLD,20));
        panel1.add(label1);

        label2.setBounds(80, 40, 100, 100);
        label2.setFont(new Font("Order ID : ",Font.ITALIC,20));
        panel1.add(label2);

        label3.setBounds(80, 80, 150, 100);
        label3.setFont(new Font("Customer ID : ",Font.ITALIC,20));
        panel1.add(label3);

        label4.setBounds(80, 120, 150, 100);
        label4.setFont(new Font("Products : ",Font.ITALIC,20));
        panel1.add(label4);


        label5.setBounds(80,350,150,80);
        label5.setFont(new Font("Total Price : $ ",Font.ITALIC,20));
        panel1.add(label5);

        button.setBounds(200,450,80,50);
        panel1.add(button);
    }
}
