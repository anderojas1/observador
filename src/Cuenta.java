/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anderojas
 */
public class Cuenta {
    
    double monto = 0.0;
    String numeroCuenta = null;
    Cliente persona = null;
    
    public Cuenta (double monto, String numero, Cliente cliente) {
        
        this.monto = monto;
        numeroCuenta = numero;
        persona = cliente;
        
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cliente getPersona() {
        return persona;
    }

    public void setPersona(Cliente persona) {
        this.persona = persona;
    }
    
    
    
}
