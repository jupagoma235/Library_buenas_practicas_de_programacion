/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

import java.util.ArrayList;

/**
 * [Detalle del objeto de la clase.
 * Se cre la clase con la finalidad de crear las listas con las canciones seleccionadas
 * ]
 * @version: 1.01.001  15/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Collection implements ICollection{
    /**
     * Variable que carga el nombre de la lista o coleccion al objeto.
     */
    private String collectionName;
    /**
     *Arreglo de tipo Sing que carga las canciones a la lista. 
     */
    private ArrayList<Sing> Sings= new ArrayList();
    /**
     * 
     * @param collectionName Recibe el nombre de la colección o lista.
     *   
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo que construye el objeto colección
     * ]
     * @version: 1.01.001  15/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */     
    public Collection(String collectionName) {
        this.collectionName = collectionName;
    }
    /**
     * 
     * @param singList variable de tipo Sing que trae la canción que se desea agregar a la colección.
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo que agrega canciones a la colección seleccionada.
     * ]
     * @version: 1.01.001  15/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */          
    @Override
    public void AddSing(Sing singList){
        this.Sings.add(singList);
    }
    /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo imprime las canciones de una colección.
     * ]
     * @version: 1.01.001  15/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */     
    @Override
    public void ViewSings(){
        System.out.println("#####################################  Colección :"+getCollectionName()+"######################################"); 
        for(int i=0;i<Sings.size();i++){System.out.println(Sings.get(i));}  
        System.out.println("########################################################################################"); 
    }
    /**
     * 
     * @return  El nombre de la colección consultada.
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo para consultar el nombre de la colección.
     * ]
     * @version: 1.01.001  15/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */     
    @Override
    public String getCollectionName() {
        return collectionName;
    }
    /**
     * 
     * @param collectionName  Recibe el nombre que tendra la colección. 
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo cargar el nombre de la colección al objeto.
     * ]
     * @version: 1.01.001  15/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */     
    @Override
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
     /**
     * @return  Devuelve el nombre de la colección que es impreso desde la libreria.
     *      
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo sobreescribe el metodo toString con la finalidad de devolver los valores de la colección.
     * ]
     * @version: 1.01.001  15/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public String toString(){
        return "Nombre de la colección  : "+collectionName;
    }
}
