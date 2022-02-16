/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

import java.util.ArrayList;

/**
 *
 * @author jupag
 */
public class Collection {
    
    private String collectionName;
    private ArrayList<Sing> Sings= new ArrayList();

    public Collection(String collectionName) {
        this.collectionName = collectionName;
    }
         
    public void AddSing(Sing singList){
        this.Sings.add(singList);
    }

    public void ViewSings(){
        System.out.println("#####################################  Colección :"+getCollectionName()+"######################################"); 
        for(int i=0;i<Sings.size();i++){System.out.println(Sings.get(i));}  
        System.out.println("########################################################################################"); 
    }
    
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
    
    public String toString(){
        return "Nombre de la colección  : "+collectionName;
    }
}
