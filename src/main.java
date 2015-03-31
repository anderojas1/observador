/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android
 */
public class main 
{
    public static void main (String [] args) 
    {
        Cajero objCajero = new Cajero();
        MovilUsuario movil = new MovilUsuario(objCajero);
        CorreoUsuario correo = new CorreoUsuario(objCajero);
        
        objCajero.addObserver(movil);
        objCajero.addObserver(correo);
        objCajero.activarCajero();
    }
}
