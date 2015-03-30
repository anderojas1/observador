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
 
    public void retiro (Object Cuenta)
    {
        String strinCantidadRetirada;
        double doubleCantidadRetirada, doubleSaldoTotal;
        Cuenta objCuenta = (Cuenta) Cuenta;
        
        strinCantidadRetirada = JOptionPane.showInputDialog("Cuanto desea Retirar");
        doubleCantidadRetirada = Double.parseDouble(strinCantidadRetirada);
        
        if (objCuenta.getMonto() < doubleCantidadRetirada)
        {
            doubleSaldoTotal = objCuenta.getMonto() - doubleCantidadRetirada;
            objCuenta.setMonto(doubleSaldoTotal);
            
            System.out.println("Se han retirado " + doubleCantidadRetirada + " de la cuenta" + "\n Saldo: " + doubleSaldoTotal);
        }
        
        else 
        {
            System.err.println("Saldo actual insuficiente para retirar " + doubleCantidadRetirada + " de la cuenta");
        }
    }
    
    public void consignar (Object Cuenta)
    {
        String strinCantidadConsignada;
        double doubleCantidadConsignada, doubleSaldoTotal;
        Cuenta objCuenta = (Cuenta) Cuenta;
        
        strinCantidadConsignada = JOptionPane.showInputDialog("Cuanto desea Consignar");
        doubleCantidadConsignada = Double.parseDouble(strinCantidadConsignada);
        
        doubleSaldoTotal = objCuenta.getMonto() + doubleCantidadConsignada;
        objCuenta.setMonto(doubleSaldoTotal);
        
        System.out.println("Se ha consignado " + doubleCantidadConsignada + " a la cuenta" + "\n Saldo: " + doubleSaldoTotal);
    }
}
