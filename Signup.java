package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public  class Signup extends JFrame implements ActionListener {
    JButton next;
    JRadioButton r1, r2,m1 , m2, m3;

    JTextField textName, textFName ,textEmail,  textA, textCi,textPi,textstate;
    JDateChooser dateChooser;

    Random ran=new Random();

    long first4=(ran.nextLong()% 9000L)+1000L;

    String first= " "+Math.abs(first4);
     Signup(){
        super("APPLICATION FORM ");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10, 100,100);
        add(image);

        JLabel label1= new JLabel("APPLICATION FORM NO. "+first);
        label1.setForeground(Color.darkGray);
        label1.setBounds(180,30,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2= new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        label1.setForeground(Color.darkGray);
        label2.setBounds(400,80,600,30);
        add(label2);

        JLabel label3= new JLabel("Personal Details:");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(350,105,600,30);
        add(label3);

        JLabel labelName= new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD,20));
        labelName.setBounds(100,170,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,14));
        textName.setBounds(300,170,400,30);
        add(textName);

        JLabel labelfName= new JLabel(" Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD,20));
        labelfName.setBounds(90,220,180,30);
        add(labelfName);

        textFName=new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD,14));
        textFName.setBounds(300,220,400,30);
        add(textFName);

        JLabel DOB= new JLabel(" Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(90,270,180,30);
        add(DOB);

        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300 ,270 ,400, 30);
        add(dateChooser);

        JLabel labelG=new JLabel(("Gender :"));
        labelG.setFont(new Font("Raleway",Font.BOLD, 20 ));
        labelG.setBounds(100,320,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD, 14));
        r1.setBackground(new Color(222, 225 ,228));
        r1.setBounds(300,320,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD, 14));
        r2.setBackground(new Color(222, 225 ,228));
        r2.setBounds(450,320,90,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail= new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD, 20));
        labelEmail.setBounds(100,370,200,30);
        add(labelEmail);


        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(300,370,400,30);
        add(textEmail);

        JLabel labelMs= new JLabel("Married Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD, 20));
        labelMs.setBounds(100,420,200,30);
        add(labelMs);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD, 14));
        m1.setBackground(new Color(222, 225 ,228));
        m1.setBounds(300,420,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried ");
        m2.setFont(new Font("Raleway",Font.BOLD, 14));
        m2.setBackground(new Color(222, 225 ,228));
        m2.setBounds(440,420,130,30);
        add(m2);

        m3=new JRadioButton("Others  ");
        m3.setFont(new Font("Raleway",Font.BOLD, 14));
        m3.setBackground(new Color(222, 225 ,228));
        m3.setBounds(600,420,100,30);
        add(m3);

        ButtonGroup buttonGroup1= new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelA= new JLabel("Permanent Address :");
        labelA.setFont(new Font("Raleway",Font.BOLD, 20));
        labelA.setBounds(90,470,200,30);
        add(labelA);

        textA=new JTextField();
        textA.setFont(new Font("Raleway", Font.BOLD,14));
        textA.setBounds(300,470,400,30);
        add(textA);


        JLabel labelCi= new JLabel("City :");
        labelCi.setFont(new Font("Raleway",Font.BOLD, 20));
        labelCi.setBounds(90,520,100,30);
        add(labelCi);

        textCi=new JTextField();
        textCi.setFont(new Font("Raleway", Font.BOLD,14));
        textCi.setBounds(300,520,100,30);
        add( textCi);

        JLabel labelPi= new JLabel("PIN Code:");
        labelPi.setFont(new Font("Raleway",Font.BOLD, 20));
        labelPi.setBounds(470,520,100,30);
        add(labelPi);

        textPi=new JTextField();
        textPi.setFont(new Font("Raleway", Font.BOLD,14));
        textPi.setBounds(600,520,100,30);
        add( textPi);


        JLabel labelstate= new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD, 20));
        labelstate.setBounds(90,570,100,30);
        add(labelstate);

        textstate=new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD,14));
        textstate.setBounds(300,570,400,30);
        add( textstate);

        next= new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,620,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
       setSize(850,900);
       setLocation(360,40);
       setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name= textName.getText();
        String fname= textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender= null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()){
            gender="Female";
        }
        String email= textEmail.getText();
        String marry= null;
        if(m1.isSelected()){
            marry="Married";
        } else if (m2.isSelected()) {
            marry = "Unmarried";
        } else if (m3.isSelected()) {
            marry = "Others";
        }

        String address= textA.getText();
        String city= textCi.getText();
        String pin= textPi.getText();
        String state= textstate.getText();

        try {
            if(textName.getText()==null|| textName.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill all the field");
            } else {
                connect con1= new connect();
                String q= "insert into signup values('" +formno+"', '" +name+"', '" +fname+"', '" +dob+"', '" +gender+"', '" +email+"','" +marry+"' , '" +address+"', '" +city+"', '" +pin+"', '" +state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
     }


    public static void main(String[]args){
        new Signup();
    }
}
