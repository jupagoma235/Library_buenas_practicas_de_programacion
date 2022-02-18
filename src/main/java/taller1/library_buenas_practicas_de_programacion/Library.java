/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad de generar la libreria de canciones, en donde estaran listadas todos los objetos
 * cancion y lista.
 * ]
 * @version: 1.01.001  11/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Library implements ILibrary {
    /**
     * Array de objetos sing para crear las canciones.
     */    
    private final ArrayList<Sing> sing = new ArrayList<>();
    /**
     * Array de objetos Collection para crear las listas de canciones.
     */
    private ArrayList<Collection> collection = new ArrayList<>();
    /**
     * Array creado con la finalidad de recibir el filtrado por genero y año e imprimirlo.
     */
    private ArrayList<Sing> Filtersing = new ArrayList<>();
    /**
     * Objeto tipo scanner que captura la información ingresada por el usuario.
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Entero que capta las opciones ingresadas por el usuario para las diferentes ramas de desicion.
     */
    int option=0;
    /**
     * Variable utilziada para recibir el parametro de filtrado de genero y año.
     */
    String filter;
    
    /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de crear la estructura para el manejo de la libreria
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void PrincipalList() {
        /**
         * Corresponde a variable del metodo para recibir el nombre de la colección que se crea.
         */
        String collectionName="";
        /**
         * Variable del metodo que recibe el identificador de la canción que se asigna a las listas.
         */
        int singSelection=0;
        /**
         * Variable del metodo que recibe el número de la lista a la que se le asigna una canción.
         */
        int collectionSelection=0;
        try{            
            while(option!=5){
                if(sing.size()==0){
                    System.out.println("No existen canciones, por favor agregue algunas a la lista");
                    Sing();                            
                }else{
                    System.out.println("Actualmente hay "+sing.size()+" canciones en la biblioteca");
                    System.out.println("1) agregar, 2) ordenar, 3) Filtrar, 4) Ver Listas, 5) Salir");
                    option=sc.nextInt();
                    switch (option){
                        case 1:
                            System.out.println("1) agregar canción a la biblioteca, 2) agregar canción a una lista, 3) Crear nueva lista");
                            option=sc.nextInt();
                            if(option==1){Sing();}
                            if(option==2){
                                if(collection.isEmpty()){
                                    sc.nextLine();
                                    System.out.println("Ingrese el nombre de nueva colección");
                                    collectionName=sc.nextLine();  
                                    collection.add(new Collection(collectionName));
                                }
                                ViewGeneralList(sing);
                                System.out.println("Seleccione la cancion a agregar");
                                singSelection=sc.nextInt();
                                ViewCollection(collection);
                                System.out.println("Seleccione el numero de la lista");
                                collectionSelection=sc.nextInt();
                                collection.get(collectionSelection-1).AddSing(sing.get(singSelection-1));                                                                       
                            }
                            if(option==3){
                                if(collection.size()!=0){  
                                    sc.nextLine();
                                    System.out.println("Ingrese el nombre de nueva colección");                                        
                                    collectionName=sc.nextLine();                                     
                                }
                                if(collection.size()==0){
                                    sc.nextLine();
                                    System.out.println("########################################################################################"); 
                                    System.out.println("Ingrese el nombre de nueva colección");
                                    collectionName=sc.nextLine();                                                                        
                                } 
                                collection.add(new Collection(collectionName));
                                ViewCollection(collection);
                            }
                            break;
                        case 2:
                            System.out.println("1) Ordenar por fecha, 2) Ordenar por duración");
                            option=sc.nextInt();
                            if(option==1){OrderDate();}
                            if(option==2){OrderDuration();}
                            break;
                        case 3:
                            System.out.println("1) Filtrar por genero, 2) Filtrar por año");
                            option=sc.nextInt();
                            if(option==1){
                                sc.nextLine();
                                System.out.println("Ingrese el genero.");
                                filter=sc.nextLine();
                                FilterGenre(filter);
                            }
                            if(option==2){
                                System.out.println("Ingrese el año por el que desea filtrar.");
                                sc.nextLine();
                                filter=sc.nextLine();
                                FilterYear(filter);
                            }
                            break;
                        case 4:    
                            if(collection.size()>0){
                                ViewCollection(collection);
                                System.out.println("Seleccione la colección que desea ver.");
                                collectionSelection=sc.nextInt();
                                collection.get(collectionSelection-1).ViewSings();  
                            }else{System.out.println("Debe ingresar primero una colección.");}
                            break;
                        default:
                            System.out.println("Opción fuera del rango solicitado.");  
                            break;
                    }
                    Filtersing.clear();
                }
            }
        }catch(Exception e){
            System.out.print("Se estan ingresando datos no validos en las opciones de selección ("+e.getMessage()+")");
            option=0;
        }finally{
            System.out.print("Tarea terminada correctamente");
        }        
    }
    
    /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de ingresar los parametros que conforman la canción.
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void Sing() {
        try{
            String[] dates= new String[6];        
            System.out.println("Ingrese los datos de la cancion");         
            for(int i=0;i<6;i++){
                switch (i){
                    case 0:
                        dates[0]=String.valueOf(sing.size()+1);
                        break;
                    case 1:
                        System.out.println("Ingrese el año de la canción");
                        dates[1]=String.valueOf(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Ingrese la duración de la canción en segundos");
                        dates[2]=String.valueOf(sc.nextInt());
                        break;
                    case 3:
                        System.out.println("Ingrese el genero al que pertenece la cancion ");
                        dates[3]=sc.next();
                        break;
                    case 4:
                        System.out.println("Ingrese el album al que pertenece la caratula ");
                        dates[4]=sc.next();
                        break;
                    case 5:
                        System.out.println("Ingrese la descripción de la cancion ");
                        dates[5]=sc.next();
                        break;
                    default:
                        break;                    
                }
            }
        
            sing.add(new Sing(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5]));
            ViewGeneralList(sing);
        }catch(Exception e){
            System.out.print("Se estan ingresando datos no validos en las opciones de selección  ("+e.getMessage()+")");
        }    
    }
    
    /**
     * @param viewList Lista que trae la información para ingresarla al ciclo for e imprimirla.
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de imprimir los valores de la lista general de la libreria.
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void ViewGeneralList(ArrayList viewList){
        try{
            System.out.println("################################### Biblioteca #########################################");
            for(int i=0;i<viewList.size();i++){
                System.out.println(viewList.get(i).toString());
            }
            System.out.println("########################################################################################");        
        }catch(Exception e){
            System.out.println(e);
        }
    }  
    
    /**
     * @param viewCollection Lista que trae la información para ingresarla al ciclo for e imprimirla.
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de imprimir los valores de las listas creadas por el usuario.
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void ViewCollection(ArrayList viewCollection){
        try{
            int numCollection=0;
            System.out.println("################################ Colecciones disponibles ###############################"); 
            for(int i=0;i<viewCollection.size();i++){
                numCollection=i+1;
                System.out.println(numCollection+"  "+ viewCollection.get(i).toString());                                                 
            }
            System.out.println("########################################################################################"); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param filterGenre String que trea el genero con el que sera filtrada la lista general.
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de filtrar las canciones por genero en la lista general.
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void FilterGenre(String filterGenre) {
        try{
            Filtersing.clear();
            for(int i=0;i<sing.size();i++){
                this.filter=sing.get(i).getGenre();
                if(this.filter.equals(filterGenre)){
                   Filtersing.add(sing.get(i));               
                }
            }
            ViewGeneralList(Filtersing); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param filterYear String que trae el valor del año con el que sera filtrada la lista general.
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de filtrar las canciones por año de la lista general.
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void FilterYear(String filterYear){
        try{
            Filtersing.clear();
            for(int i=0;i<sing.size();i++){
                this.filter=sing.get(i).getCreationDate();
                if(this.filter.equals(filterYear)){
                   Filtersing.add(sing.get(i));               
                }
            }
            ViewGeneralList(Filtersing); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }

    /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de ordenar las canciones por fecha.
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void OrderDate() {
        try{
            Collections.sort(sing,(o1,o2)-> o1.getCreationDate().compareTo(o2.getCreationDate()));
            ViewGeneralList(sing);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }

    /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de ordenar la lista general por duración.
     * ]
     * @version: 1.01.001  11/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void OrderDuration() {
        try{
            Collections.sort(sing,(o1,o2)-> o1.getDuration().compareTo(o2.getDuration()));
            ViewGeneralList(sing);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    
}
