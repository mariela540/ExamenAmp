/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.Set;

/**
 *
 * @author Student
 */
public interface Controlador<Type> {
    void insertar(Type obj);
    void update(Type obj);
    void delete(Type obj);
    Type read(Object pedido);
    Set<Type> readAll();
}
