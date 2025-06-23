package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox1,comboBox2,comboBox3;
    JButton next;

    JTextField textOccu, textPan,textaadhar;
    JRadioButton r1,r2,e1,e2;
    ButtonGroup buttonGroup, buttonGroup1;

    String formno;
    Signup2( String formno){
        super("APPLICATION FORM CONTINUE");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5, 100,100);
        add(image);

        this.formno=formno;

       JLabel l1= new JLabel("Page 2 :");
       l1.setFont(new Font("Raleway", Font.BOLD, 30));
       l1.setBounds(300,40,600,40);
       add(l1);

        JLabel l2= new JLabel("Additional Details:");
        l2.setFont(new Font("Raleway", Font.BOLD, 30));
        l2.setBounds(420,40,600,40);
        add(l2);

        JLabel l3= new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100,140,100,30);
        add(l3);

        String religion[]= {"Hindu","Muslim","Christian","Sikh","Others"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(222,255,228));
        comboBox.setBounds(350,140,320,30);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox);

        JLabel l4= new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100,190,100,30);
        add(l4);

        String category[]= {"General","SC","ST","OBC","Others"};
        comboBox1=new JComboBox(category);
        comboBox1.setBackground(new Color(222,255,228));
        comboBox1.setBounds(350,190,320,30);
        comboBox1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox1);

        JLabel l5= new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100,240,100,30);
        add(l5);

        String income[]= {"Null","<1,50,000",">2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox2=new JComboBox(income);
        comboBox2.setBackground(new Color(222,255,228));
        comboBox2.setBounds(350,240,320,30);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox2);


        JLabel l6= new JLabel("Educational Details :");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100,290,200,30);
        add(l6);

        String edu[]= {"Non-Graduate","<Graduate","Post-Graduation","Doctrate","Others"};
        comboBox3=new JComboBox(edu);
        comboBox3.setBackground(new Color(222,255,228));
        comboBox3.setBounds(350,290,320,30);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox3);

        JLabel l7= new JLabel("Occupation :");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100,340,200,30);
        add(l7);

        textOccu=new JTextField();
        textOccu.setFont(new Font("Raleway", Font.BOLD,14));
        textOccu.setBounds(350,340,320,30);
        add(textOccu);

        JLabel l8= new JLabel("PAN No :");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100,390,200,30);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,14));
        textPan.setBounds(350,390,320,30);
        add( textPan);

        JLabel l9= new JLabel("AADHAR No :");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100,440,200,30);
        add(l9);

        textaadhar=new JTextField();
        textaadhar.setFont(new Font("Raleway", Font.BOLD,14));
        textaadhar.setBounds(350,440,320,30);
        add(  textaadhar);

        JLabel l10= new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100,490,200,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD, 14));
        r1.setBackground(new Color(222, 225 ,228));
        r1.setBounds(350,490,60,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD, 14));
        r2.setBackground(new Color(222, 225 ,228));
        r2.setBounds(450,490,60,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11= new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100,540,200,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD, 14));
        e1.setBackground(new Color(222, 225 ,228));
        e1.setBounds(350,540,60,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD, 14));
        e2.setBackground(new Color(222, 225 ,228));
        e2.setBounds(450,540,60,30);
        add(e2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12= new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD, 18));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 16));
        l13.setBounds(760,10,60,30);
        add(l13);

        next= new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(570,580,100,30);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(850,750);
        setLocation( 350, 80);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
 String rel = (String)comboBox.getSelectedItem();
 String cat= (String) comboBox1.getSelectedItem();
 String inc = (String) comboBox2.getSelectedItem();
 String edu= (String) comboBox3.getSelectedItem();
 String occ = textOccu.getText();
 String pan= textPan.getText();
 String aadhar= textaadhar.getText();
     String senior_citizen= null;
     if(r1.isSelected()){
      senior_citizen="Yes";
     } else if (r2.isSelected()){
      senior_citizen="No";
     }
     String existing_acc= null;
     if(e1.isSelected()){
      existing_acc="Yes";
     } else if (e2.isSelected()){
      existing_acc="No";
     }

     try{
         if((textPan.getText()==null|| textPan.getText().isEmpty()) || (textaadhar.getText()==null|| textaadhar.getText().isEmpty())){
       JOptionPane.showMessageDialog(null,"Fill all the fields!");
         }else {
           connect c1=new connect();
           String q= "insert into signup2 values('" +formno+"', '" +rel+"', '" +cat+"', '" +inc+"', '" +edu +"', '" +occ+"','" +pan+"' , '" +aadhar+"', '" +senior_citizen+"', '" +existing_acc+"')";
           c1.statement.executeUpdate(q);
           new Signup3(formno);
           setVisible(false);
         }


     }catch( Exception E){
      E.printStackTrace();
     }



    }

    public static void main (String[] args){
           new Signup2(" ");
    }
}
