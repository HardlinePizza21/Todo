package Renders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Renders {

  public int seleccion = 3;
  public JFrame frame = new JFrame("ToDos-App");
  public JFrame inicioSesion = new JFrame("Inicio sesion");
  

  public int menuInicio() {
    frame.setLayout(new BorderLayout());
    frame.setSize(500, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel titulo = new JLabel("ToDos-App");

    JPanel panel = new JPanel(new FlowLayout());
    JPanel panelNorte = new JPanel(new FlowLayout());

    JButton boton1 = new JButton("Iniciar Sesion");
    JButton boton2 = new JButton("Crear Cuenta");
    JButton boton3 = new JButton("salir");

    panelNorte.add(titulo);
    panel.add(boton1);
    panel.add(boton2);

    frame.add(panelNorte, BorderLayout.NORTH);
    frame.add(panel, BorderLayout.CENTER);
    frame.add(boton3, BorderLayout.SOUTH);


    frame.setVisible(true);
    
    do{
      boton1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          seleccion = 1;
        }
      });
      boton2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          seleccion = 2;
        }
      });
      boton3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.exit(0);
          
        }
      });
    }while(seleccion == 3);
    
    return seleccion;
  }

  public String[] logIn(){

    final String[] credenciales = new String[2];
    
    this.inicioSesion.setSize(500, 300);
    this.frame.setVisible(false);
    this.inicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.inicioSesion.setLayout(new GridLayout(3,2));
    
    final JTextField textField1 = new JTextField(20);
    textField1.setSize(20,20);
    
    JLabel message1 = new JLabel("Ingrese el nombre de usuario: ");
    
    final JTextField textField2 = new JTextField(20);
    textField2.setSize(20,20);

    JLabel message2 = new JLabel("Ingrese la contraseña: ");

    
    JButton button = new JButton("Mostrar Input");
    button.setSize(20,20);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        credenciales[0] = textField1.getText(); 
        credenciales[1] = textField2.getText(); 
      }
    });


    this.inicioSesion.add(message1);
    this.inicioSesion.add(textField1);
    this.inicioSesion.add(message2);
    this.inicioSesion.add(textField2);
    this.inicioSesion.add(button);
    this.inicioSesion.setVisible(true);

    return credenciales;
  }

  public String[] crearCuenta(){

    final String[] credenciales = new String[2];

    this.inicioSesion.setSize(500, 300);
    this.frame.setVisible(false);
    this.inicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.inicioSesion.setLayout(new BorderLayout());

    final JPanel panel = new JPanel(new GridLayout(4,2));
    JButton salida = new JButton("salir");
    salida.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    final JTextField textField1 = new JTextField(20);
    textField1.setSize(20,20);

    JLabel message1 = new JLabel("Ingrese el nombre de usuario: ");

    final JTextField textField2 = new JTextField(20);
    textField2.setSize(20,20);

    JLabel message2 = new JLabel("Ingrese la contraseña: ");

    final JTextField textField3 = new JTextField(20);
    textField2.setSize(20,20);

    JLabel message3 = new JLabel("Ingrese la contraseña nuevamente: ");
    
    final JButton button = new JButton("Crear!!!");
    button.setSize(20,20);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(textField2.getText().equals(textField3.getText())){
          credenciales[0] = textField1.getText(); 
          System.out.println(credenciales[0]);
          credenciales[1] = textField2.getText();
          System.out.println(credenciales[1]);
        }else {
          JOptionPane.showMessageDialog(inicioSesion, "Las constraseñas no coinciden");
          textField1.setText("");
          textField2.setText("");
          textField3.setText("");          
        }
      }
    });


    panel.add(message1);
    panel.add(textField1);
    panel.add(message2);
    panel.add(textField2);
    panel.add(message3);
    panel.add(textField3);
    panel.add(button);
    
    this.inicioSesion.add(panel, BorderLayout.CENTER);
    this.inicioSesion.add(salida, BorderLayout.SOUTH);
    this.inicioSesion.setVisible(true);

    return credenciales;
  }
  
}
