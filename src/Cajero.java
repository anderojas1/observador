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

public class Cajero {
    
    static Banco banco = new Banco();
 
    public static void main (String [] args) {
        
        int opt = 0;
        int codop = 0;
        
        do {

            try {

                opt = Integer.parseInt(JOptionPane.showInputDialog("0 - Consignar\n1 - Retirar\n2 - Salir"));
                
                switch (opt) {

                    case 0: {
                        
                        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta");
                        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto"));
                        banco.consignarMonto(numeroCuenta, monto);
                        
                    }break;
                    case 1: {
                        
                        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta");
                        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto"));
                        codop = banco.retirarMonto(numeroCuenta, monto);
                        if (codop == -1) System.out.println("saldo insuficiente");
                        
                    } break;
                        
                    case 2: System.err.println("Hasta luego");break;
                        
                    default: JOptionPane.showMessageDialog(null, "Ingrese una opción valida"); break;
                        
                }                

            } catch (Exception ex) {

                System.err.println(ex.getMessage());
                
            }

        } while (opt != 2);
        
    }
}
