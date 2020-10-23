/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab.pkg2_alejandroosorto;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Lab2_AlejandroOsorto 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        //Listas para las clases ----------------------------------------------
        ArrayList listaDetectives = new ArrayList();
        ArrayList listaCasos = new ArrayList();
        //----------------------------------------------
        
        
        //Arrays para ordenar a la hora de listar ----------------------------------------------
        ArrayList listaCasosHomi = new ArrayList();
        ArrayList listaCasosSecu = new ArrayList();
        ArrayList listaCasosRobo = new ArrayList();
        //----------------------------------------------
        
        int opcion = 0;
        
        
        while (opcion != 10) //Inicio del ciclo inicial ----------------------------------------------
        {
            System.out.println("----MENU----");
            System.out.println("1) Agregar detectives");
            System.out.println("2) Eliminar detectives");
            System.out.println("3) Modificar detectives");
            System.out.println("4) Listar detectives");
            System.out.println("5) Registrar casos");
            System.out.println("6) Modificar casos");
            System.out.println("7) Listar casos");
            System.out.println("8) Listar casos RESUELTOS");
            System.out.println("9) Listar casos PENDIENTES");
            System.out.println("10) Salir");
            System.out.println("------------");
            System.out.print("Ingrese la opcion del menu que deseee: ");
            opcion = leer.nextInt();
            
            switch (opcion)
            {
                //Inicio gestion de detectives ------------------------------------------------------
                case 1: //Agregar detectives
                {
                    System.out.print("Ingrese el nombre del detective: ");
                    String nombre = leer.next();
                    
                    System.out.print("Ingrese la edad: ");
                    int edad = leer.nextInt();
                    
                    while (edad < 0)
                    {
                        System.out.print("Edad ingresada no valida, ingrese otra: ");
                        edad = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese la nacionalidad: ");
                    String nacionalidad = leer.next();
                    
                    System.out.print("Ingrese los años laborales del detective: ");
                    int añosLab = leer.nextInt();
                    
                    while (añosLab < 0)
                    {
                        System.out.print("Numero ingresado no valido, ingrese otro: ");
                        añosLab = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese el nivel del detective(del 1 al 10): ");
                    int nivel = leer.nextInt();
                    
                    while (nivel < 1|| nivel > 10)
                    {
                        System.out.print("Nivel ingresado no valido, ingrese otro: ");
                        nivel = leer.nextInt();
                    }
                    
                    listaDetectives.add(new Detectives(nombre, edad, nacionalidad, añosLab, nivel));
                    
                } break;
                case 2: //Eliminar detectives
                {
                    System.out.print("Ingrese la posicion en la lista del detective que desea eliminar: ");
                    int pos = leer.nextInt();
                    
                    if (pos >= 0 && pos < listaDetectives.size())
                    {
                        listaDetectives.remove(pos);
                    }
                    else
                    {
                        System.out.println("Posicion ingresada no valida o fuera de rango");
                    }
                } break;
                case 3: //Modificar detectives
                {
                    System.out.print("Ingrese la posicion en la lista el detective que desea modificar: ");
                    int pos = leer.nextInt();
                    
                    if (pos >= 0 && pos < listaDetectives.size())
                    {
                        System.out.println("Que desea modificar del detective?");
                        System.out.println("1) Nombre");
                        System.out.println("2) Edad");
                        System.out.println("3) Nacionalidad");
                        System.out.println("4) Años laborales");
                        System.out.println("5) Nivel");
                        System.out.print("Ingrese la opcion: ");
                        int subOpcion = leer.nextInt();
                        
                        switch (subOpcion)
                        {
                            case 1:
                            {
                                System.out.print("Ingrese el nuevo nombre: ");
                                String nombre = leer.next();
                                
                                ((Detectives)listaDetectives.get(pos)).setNombre(nombre);
                                
                            } break;
                            case 2:
                            {
                                System.out.print("Ingrese la nueva edad: ");
                                int edad = leer.nextInt();
                                
                                ((Detectives)listaDetectives.get(pos)).setEdad(edad);
                            } break;
                            case 3:
                            {
                                System.out.print("Ingrese la nueva nacionaliadd: ");
                                String nacionalidad = leer.next();
                                
                                ((Detectives)listaDetectives.get(pos)).setNacionalidad(nacionalidad);
                            } break;
                            case 4:
                            {
                                System.out.print("Ingrese los nuevos años laborales: ");
                                int añosLab = leer.nextInt();
                                
                                ((Detectives)listaDetectives.get(pos)).setAños(añosLab);
                            } break;
                            case 5:
                            {
                                System.out.print("Ingrese el nuevo nivel: ");
                                int nivel = leer.nextInt();
                                
                                ((Detectives)listaDetectives.get(pos)).setNivel(nivel);
                            } break;
                        }
                    }
                    else
                    {
                        System.out.println("Posicion ingresada no valida o fuera de rango");
                    }
                    //Fin del modificador
                } break;
                case 4: //Listar detectives
                {
                    String salida = "";
                    
                    for (Object t : listaDetectives)
                    {
                        salida += listaDetectives.indexOf(t)+": "+t+"\n";
                    }
                    
                    System.out.println(salida);
                } break;
                //Fin de gestion de detectives ------------------------------------------------------
                //Inicio gestion de casos ------------------------------------------------------
                case 5: //Registrar casos
                {
                    System.out.print("Ingrese el lugar del caso: ");
                    String lugar = leer.next();
                    
                    System.out.print("Ingrese la descripcion del caso: ");
                    leer.nextLine();
                    String desc = leer.nextLine();
                    
                    System.out.println("Ingrese el tipo de caso: ");
                    System.out.println("1) Homicidio");
                    System.out.println("2) Secuestro");
                    System.out.println("3) Robo");
                    System.out.print("Ingrese una opcion del menu: ");
                    int tipo = leer.nextInt();
                    
                    while (tipo < 1 || tipo > 3)
                    {
                        System.out.print("Numero ingresado fuera de rango, ingrese otro: ");
                        tipo = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese el nombre del detective a cargo, este debe estar en la lista de detectives: ");
                    String detectiveAC = leer.next();
                    
                    //Validar que el detective esté en la lista ------------------------------------------------------
                    boolean check = false;
                    
                    for (Object t : listaDetectives)
                    {
                        int num = listaDetectives.indexOf(t);
                        
                        if (((Detectives)listaDetectives.get(num)).getNombre().equals(detectiveAC))
                        {
                            check = true;
                        }
                    }
                    
                    while (check == false) //Se inicia un bucle infinito si el nombre ingresado no esta en la lista de detectives
                    {
                        System.out.print("Nombre ingresado no esta en la lista de detectives, ingrese otro: ");
                        detectiveAC = leer.next();
                        
                        for (Object t : listaDetectives)
                        {
                            int num = listaDetectives.indexOf(t);

                            if (((Detectives)listaDetectives.get(num)).getNombre().equals(detectiveAC))
                            {
                                check = true;
                            }
                        }
                    }
                    //------------------------------------------------------------------------------------------------------------
                    
                    System.out.println("Ingrese el estado del caso: ");
                    System.out.println("1) Resuelto");
                    System.out.println("2) Pendiente");
                    System.out.print("Ingrese la opcion del menu: ");
                    int estado = leer.nextInt();
                    
                    while (estado < 1 || estado > 2)
                    {
                        System.out.print("Numero ingresado fuera de rango, ingrese otro: ");
                        estado = leer.nextInt();
                    }
                    
                    listaCasos.add(new Casos(lugar, desc, tipo, detectiveAC, estado));
                    
                } break;
                case 6: //Modificar caso
                {
                    System.out.print("Ingrese la posicion del caso dentro de la lista: ");
                    int pos = leer.nextInt();
                    
                    if (pos >= 0 && pos < listaCasos.size())
                    {
                        System.out.println("Que desea modificar del caso?");
                        System.out.println("1) Lugar");
                        System.out.println("2) Descripcion");
                        System.out.println("3) Tipo");
                        System.out.println("4) Detective a cargo");
                        System.out.println("5) Estado");
                        System.out.print("Ingrese la opcion: ");
                        int subOpcion = leer.nextInt();
                        
                        switch (subOpcion)
                        {
                            case 1:
                            {
                                System.out.print("Ingrese el nuevo lugar: ");
                                String lugar = leer.next();
                                
                                ((Casos)listaCasos.get(pos)).setLugar(lugar);
                            } break;
                            case 2:
                            {
                                System.out.print("Ingrese la nueva descripcion: ");
                                leer.nextLine();
                                String desc = leer.nextLine();
                                
                                ((Casos)listaCasos.get(pos)).setDescripcion(desc);
                            } break;
                            case 3:
                            {
                                System.out.println("Ingrese el nuevo tipo");
                                System.out.println("1) Homicidio");
                                System.out.println("2) Secuestro");
                                System.out.println("3) Robo");
                                System.out.print("Ingrese la opcion: ");
                                int tipo = leer.nextInt();
                                
                                while (tipo < 1 || tipo > 3)
                                {
                                    System.out.print("Numero ingresado fuera de rango, ingrese otro: ");
                                    tipo = leer.nextInt();
                                }
                                
                                ((Casos)listaCasos.get(pos)).setTipo(tipo);
                            } break;
                            case 4:
                            {
                                System.out.print("Ingrese el nuevo detective a cargo: ");
                                String detectiveAC = leer.next();
                                
                                ((Casos)listaCasos.get(pos)).setDectAC(detectiveAC);
                            } break;
                            case 5:
                            {
                                System.out.println("Ingrese el nuevo estado del caso");
                                System.out.println("1) RESUELTO");
                                System.out.println("2) PENDIENTE");
                                System.out.print("Ingrese la opcion: ");
                                int estado = leer.nextInt();
                                
                                while (estado < 1 || estado > 2)
                                {
                                    System.out.print("Numero ingresado fuera de rango, ingrese otro: ");
                                    estado = leer.nextInt();
                                }
                                
                                ((Casos)listaCasos.get(pos)).setEstado(estado);
                            } break;
                            default: System.out.println("Opcion elegida invalida");
                        }
                    }
                    else
                    {
                        System.out.println("Numero ingresado fuera de rango");
                    }
                } break;
                case 7: //Listar todos los casos
                {
                    for (int i = 0; i < listaCasos.size(); i++)                    
                    {
                        if (((Casos)listaCasos.get(i)).getTipo() == 1)
                        {
                            listaCasosHomi.add(listaCasos.get(i));
                        }
                        else if (((Casos)listaCasos.get(i)).getTipo() == 2)
                        {
                            listaCasosSecu.add(listaCasos.get(i));
                        }
                        else if (((Casos)listaCasos.get(i)).getTipo() == 3)
                        {
                            listaCasosRobo.add(listaCasos.get(i));
                        }
                    }
                    
                    //Se asignan las listas a sus respectivas cadenas para poder imprimirlas en orden ----------------------------------------------
                    String salidaH = "";
                    for (Object t : listaCasosHomi)
                    {
                        salidaH += listaCasosHomi.indexOf(t)+": "+t+"\n";
                    }
                    
                    String salidaS = "";
                    for (Object t : listaCasosSecu)
                    {
                        salidaS += listaCasosSecu.indexOf(t)+": "+t+"\n";
                    }
                    
                    String salidaR = "";
                    for (Object t : listaCasosRobo)
                    {
                        salidaR += listaCasosRobo.indexOf(t)+": "+t+"\n";
                    }
                    //Fin de asignaciones ----------------------------------------------
                    
                    System.out.println("Homicidios: \n"+salidaH+"\nSecuestros: \n"+salidaS+"\nRobos: \n"+salidaR);
                    
                    listaCasosHomi.clear();
                    listaCasosSecu.clear();
                    listaCasosRobo.clear();
                } break;
                case 8: //Listar solo los casos resueltos
                {
                    int estado;
                    
                    for (int i = 0; i < listaCasos.size(); i++)                    
                    {
                        estado = ((Casos)listaCasos.get(i)).getEstado();
                        
                        if (estado == 1) //RESUELTOS
                        {
                            if (((Casos)listaCasos.get(i)).getTipo() == 1)
                            {
                                listaCasosHomi.add(listaCasos.get(i));
                            }
                            else if (((Casos)listaCasos.get(i)).getTipo() == 2)
                            {
                                listaCasosSecu.add(listaCasos.get(i));
                            }
                            else if (((Casos)listaCasos.get(i)).getTipo() == 3)
                            {
                                listaCasosRobo.add(listaCasos.get(i));
                            }
                        }
                    }
                    
                    //Se asignan las listas a sus respectivas cadenas para poder imprimirlas en orden ----------------------------------------------
                    String salidaH = "";
                    for (Object t : listaCasosHomi)
                    {
                        salidaH += listaCasosHomi.indexOf(t)+": "+t+"\n";
                    }
                    
                    String salidaS = "";
                    for (Object t : listaCasosSecu)
                    {
                        salidaS += listaCasosSecu.indexOf(t)+": "+t+"\n";
                    }
                    
                    String salidaR = "";
                    for (Object t : listaCasosRobo)
                    {
                        salidaR += listaCasosRobo.indexOf(t)+": "+t+"\n";
                    }
                    //Fin de asignaciones ----------------------------------------------
                    
                    System.out.println("Homicidios: \n"+salidaH+"\nSecuestros: \n"+salidaS+"\nRobos: \n"+salidaR);
                    
                    listaCasosHomi.clear();
                    listaCasosSecu.clear();
                    listaCasosRobo.clear();
                } break;
                case 9: //Listar solo los casos pendientes
                {
                    int estado;
                    
                    for (int i = 0; i < listaCasos.size(); i++)                    
                    {
                        estado = ((Casos)listaCasos.get(i)).getEstado();
                        
                        if (estado == 2) //PENDIENTES
                        {
                            if (((Casos)listaCasos.get(i)).getTipo() == 1)
                            {
                                listaCasosHomi.add(listaCasos.get(i));
                            }
                            else if (((Casos)listaCasos.get(i)).getTipo() == 2)
                            {
                                listaCasosSecu.add(listaCasos.get(i));
                            }
                            else if (((Casos)listaCasos.get(i)).getTipo() == 3)
                            {
                                listaCasosRobo.add(listaCasos.get(i));
                            }
                        }
                    }
                    
                    //Se asignan las listas a sus respectivas cadenas para poder imprimirlas en orden ----------------------------------------------
                    String salidaH = "";
                    for (Object t : listaCasosHomi)
                    {
                        salidaH += listaCasosHomi.indexOf(t)+": "+t+"\n";
                    }
                    
                    String salidaS = "";
                    for (Object t : listaCasosSecu)
                    {
                        salidaS += listaCasosSecu.indexOf(t)+": "+t+"\n";
                    }
                    
                    String salidaR = "";
                    for (Object t : listaCasosRobo)
                    {
                        salidaR += listaCasosRobo.indexOf(t)+": "+t+"\n";
                    }
                    //Fin de asignaciones ----------------------------------------------
                    
                    System.out.println("Homicidios: \n"+salidaH+"\nSecuestros: \n"+salidaS+"\nRobos: \n"+salidaR);
                    
                    listaCasosHomi.clear();
                    listaCasosSecu.clear();
                    listaCasosRobo.clear();
                } break;
                case 10: System.out.println("Saliendo . . ."); break; //Estetica a la hora de la salida del programa
            }
        } //Fin del ciclo inicial
    } //Fin del metodo
}//Fin de la clase
