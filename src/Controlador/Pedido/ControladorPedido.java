/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Pedido;

import Controlador.Controlador;
import Modelo.Pedido;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Student
 */
public class ControladorPedido implements Controlador<Pedido> {

    private Set<Pedido> data;
    Pedido pedido;

    public ControladorPedido(Set<Pedido> data) {
        this.data = new HashSet<>();
    }
    
    @Override
    public void insertar(Pedido obj) {
        if (obj.isComplete()) {
         
        }
    }

    @Override
    public void update(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Pedido obj) {
        if (this.pedido.isComplete()) {
        }
    }

    @Override
    public Pedido read(Object pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Set<Pedido> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
