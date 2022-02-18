/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

/**
 * [Detalle del objeto de la clase.
 * Se cre la interface con los metodos que tendra la clase Collection
 * ]
 * @version: 1.01.001  15/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public interface ICollection {
    /**
     * Declaración de metodo para agregar canciones a la lista.
     * @param singList Recibe el nombre de la lista de canciones.
     */
    public void AddSing(Sing singList);
    /**
     * Declaración de metodo para imprimir las canciones de la lista seleccionada.
     */ 
    public void ViewSings();
    /**
     * Declaración de metodo para consultar el nombre de la colección o lista.
     * @return el nombre de la lista o colección.
     */
    public String getCollectionName();
    /**
     * Declaración de metodo que trae el nombre de la colección y crea el objeto.
     * @param collectionName String que recibe el nombre de la colección.
     */
    public void setCollectionName(String collectionName);
        
}
