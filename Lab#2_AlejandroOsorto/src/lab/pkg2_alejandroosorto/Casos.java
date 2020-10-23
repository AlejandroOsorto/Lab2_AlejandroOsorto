/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Casos
{
    //Atributos
    private String lugar;
    private String desc;
    private int tipo;
    private String detectiveAC;
    private int estado;
    private String tipoS;
    private String estadoS;
    
    //Constructores
    public Casos(String lugar, String desc, int tipo, String detectiveAC, int estado)
    {
        this.lugar = lugar;
        this.desc = desc;
        this.tipo = tipo;
        this.detectiveAC = detectiveAC;
        this.estado = estado;
        
        //verificacion de tipo para imprimirlo
        switch (tipo)
        {
            case 1: tipoS = "Homicidio"; break;
            case 2: tipoS = "Secuestro"; break;
            case 3: tipoS = "Robo"; break;
        }
        
        
        //Se verifica el numero como opcion y se asigna a la cadena String el nombre respectivo 1 = RESUELTO, 2 = PENDIENTE
        if (estado == 1)
        {
            estadoS = "RESUELTO";
        }
        else
        {
            estadoS = "PENDIENTE";
        }
    }
    
    //Mutadores
    
    //Lugar
    public void setLugar(String lugar)
    {
        this.lugar = lugar;
    }
    public String getLugar()
    {
        return lugar;
    }
    
    //Descripcion
    public void setDescripcion(String desc)
    {
        this.desc = desc;
    }
    public String getDesc()
    {
        return desc;
    }
    
    //Tipo
    public void setTipo(int tipo)
    {
        this.tipo = tipo;
        
        //verificacion de tipo para imprimirlo
        switch (tipo)
        {
            case 1: tipoS = "Homicidio"; break;
            case 2: tipoS = "Secuestro"; break;
            case 3: tipoS = "Robo"; break;
        }
        
    }
    public int getTipo()
    {
        return tipo;
    }
    
    //Detective A Cargo
    public void setDectAC(String detectiveAC)
    {
        this.detectiveAC = detectiveAC;
    }
    public String getDectAC()
    {
        return detectiveAC;
    }
    
    //Estado
    public void setEstado(int estado)
    {
        this.estado = estado;
        
        //Se verifica el numero como opcion y se asigna a la cadena String el nombre respectivo 1 = RESUELTO, 2 = PENDIENTE
        if (estado == 1)
        {
            estadoS = "RESUELTO";
        }
        else
        {
            estadoS = "PENDIENTE";
        }
    }
    public int getEstado()
    {
        return estado;
    }
    
    
    //MA
    
    //Formatos de impresion
    @Override
    public String toString()
    {
        return "Lugar: "+lugar+"; Descripcion: "+desc+"; Tipo: "+tipoS+"; Detective a cargo: "+detectiveAC+"; Estado: "+estadoS;
    }
}
