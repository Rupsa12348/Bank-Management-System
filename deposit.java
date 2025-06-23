package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {

    JTextField textField;

    JButton d1,d2;
    String pin;
    deposit( String pin){
        this.pin=pin;
        super("DEPOSIT SECTION ");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1400,700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0, 1400,700);
        add(image);

        JLabel l1= new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.white);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(410,150,380,35);
        image.add(l1);

        textField=new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(410,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(textField);

        d1=new JButton("DEPOSIT");
        d1.setBounds(655,305,100,30);
        d1.setBackground(new Color(65,125,128));
        d1.setForeground(Color.white);
        d1.addActionListener(this);
        image.add(d1);

        d2=new JButton("BACK");
        d2.setBounds(655,345,100,30);
        d2.setBackground(new Color(65,125,128));
        d2.setForeground(Color.white);
        d2.addActionListener(this);
        image.add(d2);


        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==d1) {
                if (textField.getText() == null || textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter valid amount!");
                } else {
                    connect c = new connect();
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', ' deposit','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + "Deposited Successfully");
                    //new Signup3(formno);
                    setVisible(false);
                    new Transaction(pin);
                }
            } else if (e.getSource()==d2) {
                setVisible(false);
                new Transaction(pin);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new deposit("");
    }
}
