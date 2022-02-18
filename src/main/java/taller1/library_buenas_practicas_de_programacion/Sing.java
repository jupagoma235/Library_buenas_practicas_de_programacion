/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

/**
 * [Detalle del objeto de la clase.
 * Se cre la clase con la finalidad de crear el objeto canción que sera llamado desde Library y Collection
 * ]
 * @version: 1.01.001  14/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Sing implements ISing{
    /**
     * Corresponde al identificador de la canción.
     */
    private String id;
    /**
     * Corresponde al año de la canción.
     */
    private String creationDate;
    /**
     * Corresponde a la duración en segundos de la canción.
     */
    private String duration;
    /**
     * Corresponde al genero de la canción.
     */
    private String genre;
    /**
     * Corresponde a la información del album o caratula.
     */
    private String carename;
    /**
     * Corresponde a la descripción de la canción.
     */
    private String description;

    /**
     * 
     * @param id  String que recibe el identificador de la canción.
     * @param creationDate  String que recibe el año de la canción.
     * @param duration  String que recibe la duración de la canción en segundos.
     * @param genre String que recibe el genero de la canción.
     * @param carename  String que recibe el nombre del album o la caratula.
     * @param description  String que recibe la descripción.
     *      
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo la finalidad de construir el objeto con todos sus atributos
     * ]
     * @version: 1.01.001  14/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    public Sing(String id, String creationDate, String duration, String genre, String carename, String description) {
        this.id = id;
        this.creationDate = creationDate;
        this.duration = duration;
        this.genre = genre;
        this.carename = carename;
        this.description = description;
    }
    /**
     * @return  Devuelve toda la información de la canción que se consulta en el momento.
     *      
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo sobreescribe el metodo toString con la finalidad de devolver los valores de la canción consultada e imprimirlos posteriormente.
     * ]
     * @version: 1.01.001  14/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
     
    @Override
    public String toString(){    
        return "| "+this.id+"|  Año: "+this.creationDate+" | "+this.duration+"segundos | "+this.genre+" | "+this.carename+" | "+this.description;
    }
    /**
     * @return  Retorna el genero de la canción.
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo para consultar el genero de una canción que sea seleccionada desde libreria.
     * ]
     * @version: 1.01.001  14/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public String getGenre() {
        return genre;
    }
     /**
     * @return  Retorna el año de la canción.
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo para consultar el año de una canción que sea seleccionada desde libreria.
     * ]
     * @version: 1.01.001  14/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public String getCreationDate() {
        return creationDate;
    }
    /**
     * @return  Retorna la duración de la canción.
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo para consultar la duración de una canción que sea seleccionada desde libreria.
     * ]
     * @version: 1.01.001  14/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public String getDuration() {
        return duration;
    }     
    
}
