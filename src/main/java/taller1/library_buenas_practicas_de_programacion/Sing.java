/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

/**
 * [Detalle del objeto de la clase.
 * Se cre la clase con la finalidad de crear el objeto canción que sera llamado desde Library y Collection
 * ]
 * @version: 1.01.001  11/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Sing implements ISing{
    private String id;
    private String creationDate;
    private String duration;
    private String genre;
    private String carename;
    private String description;

    public Sing(String id, String creationDate, String duration, String genre, String carename, String description) {
        this.id = id;
        this.creationDate = creationDate;
        this.duration = duration;
        this.genre = genre;
        this.carename = carename;
        this.description = description;
    }
    
    @Override
    public String toString(){    
        return "| "+this.id+"|  Año: "+this.creationDate+" | "+this.duration+"segundos | "+this.genre+" | "+this.carename+" | "+this.description;
    }
    
    @Override
    public String getGenre() {
        return genre;
    }
    
    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getDuration() {
        return duration;
    }     
    
}
