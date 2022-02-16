/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller1.library_buenas_practicas_de_programacion;

import java.util.ArrayList;

/**
 *
 * @author jupag
 */
public interface ILibrary {
   public void PrincipalList(); 
   public ArrayList ListSelection(ArrayList listSing);
   public void Sing();
   public void FilterGenre(String filterGenre);
   public void FilterYear(String filterYear);
   public void OrderDate();
   public void OrderDuration();
   public void ViewGeneralList(ArrayList viewList);
}
