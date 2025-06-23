package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
 JRadioButton r1,r2,r3,r4;
 ButtonGroup buttonGroup;
 JCheckBox s1,s2,s3,s4,s5,s6,s7;

 JButton sub1,sub2;
  String formno;

 JTextField textcard,textpin;
    Signup3( String formno){
        this.formno=formno;
        super("APPLICATION FORM CONTINUE");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5, 100,100);
        add(image);

        //this.formno=formno;

        JLabel l1= new JLabel("Page 3 :");
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setBounds(300,40,600,40);
        add(l1);

        JLabel l2= new JLabel("Account Details :");
        l2.setFont(new Font("Raleway", Font.BOLD, 30));
        l2.setBounds(420,40,600,40);
        add(l2);

        JLabel l3= new JLabel("Account Type :");
        l3.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.setBounds(100,140,400,30);
        add(l3);

        r1= new JRadioButton("Savings account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(new Color(225,255,228));
        r1.setBounds(350,140,200,30);
        add(r1);

        r2= new JRadioButton("Reccuring account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(new Color(225,255,228));
        r2.setBounds(550,140,250,30);
        add(r2);

        r3= new JRadioButton("FD account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(new Color(225,255,228));
        r3.setBounds(350,170,200,30);
        add(r3);

        r4= new JRadioButton("Current account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(new Color(225,255,228));
        r4.setBounds(550,170,250,30);
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4= new JLabel("Card No :");
        l4.setFont(new Font("Raleway", Font.BOLD, 22));
        l4.setBounds(100,220,400,30);
        add(l4);


        JLabel l5= new JLabel("(Your 16-digit Card No)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100,250,200,20);
        add(l5);

        JLabel l6= new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(350,220,400,30);
        add(l6);

        JLabel l7= new JLabel("(It would appear on ATM /Cheque Book and Statements)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setBounds(350,250,400,30);
        add(l7);

        JLabel l8= new JLabel("PIN Number :");
        l8.setFont(new Font("Raleway", Font.BOLD, 22));
        l8.setBounds(100,300,400,30);
        add(l8);

        JLabel l9= new JLabel(" XXXX ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(350,300,400,30);
        add(l9);

        JLabel l10= new JLabel(" (4-digit Password )");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setBounds(100,330,400,20);
        add(l10);

        JLabel l11= new JLabel(" Services Required :");
        l11.setFont(new Font("Raleway", Font.BOLD, 22));
        l11.setBounds(100,370,400,30);
        add(l11);


        s1= new JCheckBox("ATM Card");
        s1.setFont(new Font("Raleway", Font.BOLD, 14));
        s1.setBackground(new Color(225,255,228));
        s1.setBounds(350,370,200,30);
        add(s1);

        s2= new JCheckBox("Internet Banking");
        s2.setFont(new Font("Raleway", Font.BOLD, 14));
        s2.setBackground(new Color(225,255,228));
        s2.setBounds(550,370,250,30);
        add(s2);

        s3= new JCheckBox("Mobile Banking");
        s3.setFont(new Font("Raleway", Font.BOLD, 14));
        s3.setBackground(new Color(225,255,228));
        s3.setBounds(350,410,200,30);
        add(s3);

        s4= new JCheckBox("Cheque Book");
        s4.setFont(new Font("Raleway", Font.BOLD, 14));
        s4.setBackground(new Color(225,255,228));
        s4.setBounds(550,410,250,30);
        add(s4);

        s5= new JCheckBox("EMAIL Alerts");
        s5.setFont(new Font("Raleway", Font.BOLD, 14));
        s5.setBackground(new Color(225,255,228));
        s5.setBounds(350,450,200,30);
        add(s5);

        s6= new JCheckBox("E- Statement");
        s6.setFont(new Font("Raleway", Font.BOLD, 14));
        s6.setBackground(new Color(225,255,228));
        s6.setBounds(550,450,250,30);
        add(s6);

        s7= new JCheckBox("I hereby declare that the above entered details are correct best to my knowledge. ");
        s7.setFont(new Font("Raleway", Font.BOLD, 14));
        s7.setBackground(new Color(225,255,228));
        s7.setBounds(100,520,650,30);
        add(s7);

        JLabel l12= new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13= new JLabel();
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760,10,60,30);
        add(l13);

        sub1=new JButton("Submit");
        sub1.setFont(new Font("Raleway", Font.BOLD, 14));
        sub1.setBounds(250,580,100,30);
        sub1.setBackground(Color.BLACK);
        sub1.setForeground(Color.white);
        sub1.addActionListener(this);
        add(sub1);

        sub2=new JButton("Cancel");
        sub2.setFont(new Font("Raleway", Font.BOLD, 14));
        sub2.setBounds(420,580,100,30);
        sub2.setBackground(Color.BLACK);
        sub2.setForeground(Color.white);
        sub2.addActionListener(this);
        add(sub2);



        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Acc_type= "";
        if(r1.isSelected()){
            Acc_type="Savings account";
        } else if (r2.isSelected()){
            Acc_type="reccuring account";
        }else if (r3.isSelected()) {
            Acc_type = "FD account";
        }else if (r4.isSelected()) {
            Acc_type = "Current account";
        }
Random ran = new Random();
        long first7=(ran.nextLong()% 90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);


        long first3= (ran.nextLong() %9000L)+1000L;
        String pin = ""+Math.abs(first3);
        String fac="";

        String services= "";
        if(s1.isSelected()){
            services+="ATM Card ";
        } else if (s2.isSelected()){
            services+="Internet Banking ";
        }else if (s3.isSelected()) {
            services+= "Mobile Banking ";
        }else if (s4.isSelected()) {
            services+= "Cheque Book ";
        }else if (s5.isSelected()) {
            services+= "Email Alerts ";
        }else if (s6.isSelected()) {
            services += "E-Statement";
        }

        try{
            if(e.getSource()==sub1){
                if(Acc_type== null || Acc_type.isEmpty() ){
                    JOptionPane.showMessageDialog(null,"Fill all the fields!");
                }else{
                    connect c1=new connect();
                    String q1= "insert into signup3 values('" +formno+"', '" +Acc_type+"', '" +cardno+"', '" +pin+"', '" +services+"')";
                    String q2= "insert into login values('" +formno+"', '" +cardno+"', '" +pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card No : "+cardno+"\n Pin : "+pin);
                    new deposit(pin);
                    //new Signup3(formno);
                    setVisible(false);
                }
            }else if (e.getSource()==sub2){
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
;        }


    }

    public static void main(String[] args) {
        new Signup3(" ");
    }
}
