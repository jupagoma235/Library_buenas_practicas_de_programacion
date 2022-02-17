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
 * @version: 1.01.001  11/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Collection implements ICollection{
    
    private String collectionName;
    private ArrayList<Sing> Sings= new ArrayList();

    public Collection(String collectionName) {
        this.collectionName = collectionName;
    }
         
    @Override
    public void AddSing(Sing singList){
        this.Sings.add(singList);
    }

    @Override
    public void ViewSings(){
        System.out.println("#####################################  Colección :"+getCollectionName()+"######################################"); 
        for(int i=0;i<Sings.size();i++){System.out.println(Sings.get(i));}  
        System.out.println("########################################################################################"); 
    }
    
    @Override
    public String getCollectionName() {
        return collectionName;
    }

    @Override
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
    
    @Override
    public String toString(){
        return "Nombre de la colección  : "+collectionName;
    }
}
