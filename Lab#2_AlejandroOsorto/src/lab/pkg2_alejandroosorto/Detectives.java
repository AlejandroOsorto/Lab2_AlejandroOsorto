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
public class Detectives
{
    //Atributos
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int añosLab;
    private int nivel;
    
    //Constructores
    public Detectives(String nombre, int edad, String nacionalidad, int añosLab, int nivel)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.añosLab = añosLab;
        this.nivel = nivel;
    }
    
    //Mutadores
    
    //Para el nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    //Para la edad
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    public int getEdad()
    {
        return edad;
    }
    
    //Para la nacaionalidad
    public void setNacionalidad(String nacionalidad)
    {
        this.nacionalidad = nacionalidad;
    }
    public String getNacionalidad()
    {
        return nacionalidad;
    }
    
    //Para los años laborales
    public void setAños(int añosLab)
    {
        this.añosLab = añosLab;
    }
    public int getAños()
    {
        return añosLab;
    }
    
    //Para el nivel
    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }
    public int getNivel()
    {
        return nivel;
    }
    
    //MA
    
    //Formato de impresion
    @Override
    public String toString()
    {
        return "Nombre: "+nombre+"; Edad: "+edad+"; Nacionalidad: "+nacionalidad+"; Años laborales: "+añosLab+"; Nivel:"+nivel;
    }
    
}
