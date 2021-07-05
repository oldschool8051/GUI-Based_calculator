import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class calculator implements ActionListener {
    JLabel k,l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    calculator()
    {
        JFrame f=new JFrame();

        k=new JLabel("*** WELCOME TO THIS GUI CALCULATOR **");
        k.setBounds(50,1,450,50);
        f.add(k);

        l1=new JLabel("FIRST NO:    ");
        l1.setBounds(60,50,100,20);
        f.add(l1);
        t1=new JTextField();
        t1.setBounds(180,50,150,20);
        f.add(t1);
        l2=new JLabel("SECOND NO:  ");
        l2.setBounds(60,80,100,20);
        f.add(l2);
        t2=new JTextField();
        t2.setBounds(180,80,150,20);
        f.add(t2);
        l3=new JLabel("RESULTS: ");
        l3.setBounds(90,120,100,20);
        f.add(l3);
        t3=new JTextField();
        t3.setBounds(180,120,150,20);
        f.add(t3);
   
        b1=new JButton("ADD");
        b1.setBounds(30,180,100,20);
        f.add(b1);
        b2=new JButton("SUBS");
        b2.setBounds(160,180,100,20);
        f.add(b2);
        b3=new JButton("MULTIPLY");
        b3.setBounds(280,180,100,20);
        f.add(b3);
        b4=new JButton("DIVIDE");
        b4.setBounds(390,180,100,20);
        f.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.GREEN);
    }
    public void actionPerformed(ActionEvent ae)
    {
        double a=Double.parseDouble(t1.getText());
        double b=Double.parseDouble(t2.getText());
        double c=0;
        if(ae.getSource()==b1)
        {
            c=a+b;
            t3.setText(String.valueOf(c));
        }
        else if(ae.getSource()==b2)
        {
            if(a>b)
            c=a-b;
            else
            c=b-a;
            t3.setText(String.valueOf(c));
        }
        else if(ae.getSource()==b3)
        {
            c=a*b;
            t3.setText(String.valueOf(c));
        }
        else
        {
            c=a/b;
            t3.setText(String.valueOf(c));
        }
    }
    public static void main(String[] args) {
        new calculator();
    }
}    