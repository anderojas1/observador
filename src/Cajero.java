/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android
 */

import javax.swing.*;
import java.util.*;

public class Cajero extends Observable{
    
    private String mensaje = "";
    private Date fechaHora = new Date ();
    private Banco banco = new Banco();
 
    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
        setChanged();
        notifyObservers();
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public void activarCajero () 
    {
        int opt = 0;
        int codop = 0;
        String msg;
        
        do {
            try {
                opt = Integer.parseInt(JOptionPane.showInputDialog("0 - Consignar\n1 - Retirar\n2 - Salir"));
                
                switch (opt) {
                    case 0: {
                        
                        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta");
                        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto"));
                        banco.consignarMonto(numeroCuenta, monto);
                        
                        msg = "Transaccion Exitosa\n Consigancion en la cuenta " 
                                + numeroCuenta + " por el valor de " + monto + "\n Fecha y hora de la transaccion " 
                                + fechaHora.toString();
                        
                        setMensaje(msg);
                        
                    }break;
                        
                    case 1: {
                        
                        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta");
                        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto"));
                        
                        codop = banco.retirarMonto(numeroCuenta, monto);
                        
                        if (codop == -1) JOptionPane.showMessageDialog(null, "saldo insuficiente");
                        else
                        {
                            msg = "Transaccion Exitosa\n Retiro en la cuenta " 
                                + numeroCuenta + " por el valor de " + monto + "\n Fecha y hora de la transaccion " 
                                + fechaHora.toString();
                            
                            setMensaje(msg);
                        }
                        
                    } break;
                        
                    case 2: JOptionPane.showMessageDialog(null, "Hasta luego");break;
                        
                    default: JOptionPane.showMessageDialog(null, "Ingrese una opción valida"); break;
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
            
        } while (opt != 2);
    }
}
