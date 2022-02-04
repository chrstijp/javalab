package com.company.javacourse;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registration extends Frame implements ActionListener {

    TextField textField1 = new TextField(20);
    TextField textField2 = new TextField(20);
    TextField textField3 = new TextField(20);
    TextField textField4 = new TextField(20);
    Registration() {
        Frame f=new Frame();
        setTitle("Registration");
        setSize(350, 100);
        setVisible(true);
        setLayout(new FlowLayout());
        setBounds(100,100,250,300);


        Label l1 = new Label("First Name");
        l1.setBounds(50,90,100,50);
        Label l2 = new Label("Last Name");
        l2.setBounds(50,140,100,50);
        Label l3 = new Label("Email");
        l3.setBounds(50,200,100,50);
        Label l4 = new Label("Phone Number");
        l4.setBounds(50,260,100,50);

        add(l1);
        textField1.setBounds(150, 90, 160, 40);
        add(textField1);
        add(l2);
        textField2.setBounds(150, 150, 160, 40);
        add(textField2);
        add(l3);
        textField3.setBounds(150,200,160,40);
        add(textField3);
        add(l4);
        textField4.setBounds(150, 260, 260, 40);
        add(textField4);
        textField1.setText("enter first name here..");
        textField2.setText("enter last name here..");
        textField3.setText("enter email here..");
        textField4.setText("enter phone number here..");
        Checkbox checkbox1=new Checkbox("Male");
        checkbox1.setBounds(150,300,50,50);

        Checkbox checkbox2=new Checkbox("Female");
        checkbox2.setBounds(250,300,50,50);

        add(checkbox1);
        add(checkbox2);


        Button button = new Button("SUBMIT");
        add(button);
        button.setBounds(170,350,100,30);
        button.addActionListener(this);

    }
 public void actionPerformed(ActionEvent e){
        System.out.println("Username:"+textField1.getText()+" "+textField2.getText());
        System.out.println("Email:"+textField3.getText());
        System.out.println("Password:"+textField4.getText());
}
 public static void main(String[] args){
        Registration demo=new Registration();
 }
}