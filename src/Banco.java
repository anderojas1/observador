import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anderojas
 */
public class Banco {
          
    Cliente cliente1 = new Cliente ("Cliente 1", "Dirección 1", "1234667", 12345);        
    Cuenta cuenta1 = new Cuenta("100-1", cliente1);
    
    //HashMap<Cuenta, Cliente> cuentas = new HashMap<>();
    ArrayList<Cuenta> cuentas = new ArrayList<>();
    
    public Banco () {
        
        cuentas.add(cuenta1);
        
    }
    
    public int retirarMonto (String num_cuenta, double monto) throws NullPointerException {
        
        Cuenta cuentaRetiro = consultarCuenta(num_cuenta);
        
        if (cuentaRetiro.getMonto() > monto) {
            
            cuentaRetiro.setMonto (cuentaRetiro.getMonto() - monto);
        
        }
        
        else return -1;
        
        return 0;
        
    }
    
    
    public void consignarMonto (String num_cuenta, double monto) throws NullPointerException {
        
        Cuenta cuentaRetiro = consultarCuenta(num_cuenta);
            
        cuentaRetiro.setMonto (cuentaRetiro.getMonto() + monto);
        
    }
    
    
    private Cuenta consultarCuenta (String num_cuenta) {
        
        Cuenta cuentaRetiro = null;

        for (Cuenta tmp : cuentas) {

            if (tmp.getNumeroCuenta().equals(num_cuenta)) {
                cuentaRetiro = tmp;
                break;
            }

        }
        
        return cuentaRetiro;
    }
        
    
}
