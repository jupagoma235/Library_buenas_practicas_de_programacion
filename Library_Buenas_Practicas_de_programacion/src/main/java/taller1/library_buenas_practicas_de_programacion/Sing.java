/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

/**
 *
 * @author jupag
 */
public class Sing {
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
    
    public String getGenre() {
        return genre;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getDuration() {
        return duration;
    }     
    
}
