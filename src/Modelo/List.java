/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Set;

/**
 *
 * @author Student
 */
public interface List<Type> {
    void insert (Type obj);
    void update (Type obj);
    boolean delete(Type obj);
    Type search(Object pedido);
    Set<Type> toSet();
}
