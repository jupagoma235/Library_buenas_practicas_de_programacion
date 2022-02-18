/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

/**
 * [Detalle del objeto de la clase.
 * Se cre la interface con los metodos que tendra la clase Sing.
 * ]
 * @version: 1.01.001  14/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public interface ISing {
    /**
     * Declaración de metodo para consultar el genero de la canción.
     * @return Retorna el genero de la canción seleccionada 
     */
    public String getGenre();
    /**
     * Declaración de metodo para consultar el año de la canción.
     * @return Retorna el año de la canción seleccionada
     */
    public String getCreationDate();
    /**
     * Declaración de metodo para consultar la duración de la canción.
     * @return Retorna la duración de la canción en segundos
     */
    public String getDuration();
}
