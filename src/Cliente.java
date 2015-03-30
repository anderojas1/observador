/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android
 */
public class Cliente 
{
    private String nombre, direccion, numeroContacto;
    private int identificacion;
    
    Cliente() 
    {
        this.nombre = "";
        this.direccion = "";
        this.numeroContacto = "";
        this.identificacion = 0;
    }
    
    Cliente(String nombre, String direccion, String numeroContacto, int identificacion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setNumeroContacto(String numeroContacto) 
    {
        this.numeroContacto = numeroContacto;
    }
    
    public String getNumeroContacto() 
    {
        return numeroContacto;
    }

    public void setIdentificacion(int identificacion) 
    {
        this.identificacion = identificacion;
    }

    public int getIdentificacion() 
    {
        return identificacion;
    }    
}
