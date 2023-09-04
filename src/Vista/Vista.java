/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Set;

/**
 *
 * @author Student
 */
public interface Vista<Type> {
    public void displayErrorMessage(String msj);
    void displayAll(Set<Type> msj);
    public boolean displayConfirmMessage();
    
   
}
