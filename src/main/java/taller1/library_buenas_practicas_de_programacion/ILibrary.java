/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

import java.util.ArrayList;

/**
 * [Detalle del objeto de la clase.
 * Se cre la interface con los metodos que tendra la clase Library
 * ]
 * @version: 1.01.001  11/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public interface ILibrary {
   /**
    * Definición de metodo para orquestar el manejo de la lista de canciones principal.
    */ 
   public void PrincipalList(); 
   /**
    * Definición de metodo para capturar la información que tendra la canción.
    */
   public void Sing();
   /**
    * Definicion de metodo para filtrar la lista general por genero.
    * @param filterGenre Recibe el parametro de filtrado enviado para discriminar por genero.
    */
   public void FilterGenre(String filterGenre);
   /**
    * Definicion de metodo para filtrar la lista general por año.
    * @param filterYear Recibe el parametro de filtrado enviado para discriminar por año.
    */
   public void FilterYear(String filterYear);
   /**
    * Metodo para ordenar la lista general por fecha.
    */
   public void OrderDate();
   /**
    * Metodo para ordenar la lista general por duración.
    */
   public void OrderDuration();
   /**
    * Metodo para imprimir la lista general.
    * @param viewList Recibe el array a imprimir.
    */
   public void ViewGeneralList(ArrayList viewList);
   /**
    * Metodo para imprimir la Lista seleccionada.
    * @param viewCollection Recibe el array con las canciones de determinada coleccion.
    */
   public void ViewCollection(ArrayList viewCollection);
}
