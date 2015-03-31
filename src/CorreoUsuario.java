/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android
 */

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class CorreoUsuario extends JFrame implements Observer, ActionListener {

    private JPanel panelPrincipal;
    private JLabel labelTitulo, labelMensaje;
    private JButton buttonSalir;
    private Cajero objCajero;
    
    public CorreoUsuario (Cajero cajeroObservado) 
    {
        objCajero = cajeroObservado;
        
        panelPrincipal = new JPanel();
        
        labelTitulo = new JLabel();
        labelTitulo.setText("Correo Electronico");
        labelTitulo.setBounds(20, 10, 70, 40);
        
        labelMensaje = new JLabel();
        labelMensaje.setText("");
        labelMensaje.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelMensaje.setBounds(20, 50, 300, 100);
        
        buttonSalir = new JButton();
        buttonSalir.setText("Salir");
        buttonSalir.setBounds(20, 160, 80, 20);
        buttonSalir.addActionListener(this);
        
        add(labelTitulo);
        add(labelMensaje);
        add(buttonSalir);
        
        setSize(380, 200);
        setTitle("Computador -> Correo Electronico");
        setLocation(280, 300);
        setLayout(null);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void update(Observable o, Object arg) 
    {
        labelMensaje.setText(objCajero.getMensaje());
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == buttonSalir)
        {
            System.exit(0);
        }
    }
    
}
