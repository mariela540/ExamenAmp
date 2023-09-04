/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelo.List;
import Modelo.Pedido;
import java.util.Set;

/**
 *
 * @author Student
 */
public class listPedido implements List<Pedido> {
    private Set<Pedido> listpedido;
    Pedido list;
    
    public listPedido(Set<Pedido> listpedido, Pedido list) {
        this.listpedido = listpedido;
        this.list = list;
    }

    public listPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Set<Pedido> getListpedido() {
        return listpedido;
    }

    public void setListpedido(Set<Pedido> listpedido) {
        this.listpedido = listpedido;
    }

    public Pedido getList() {
        return list;
    }

    public void setList(Pedido list) {
        this.list = list;
    }
    
    @Override
    public void insert(Pedido obj) {

    }

    @Override
    public void update(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pedido search(Object pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Set<Pedido> toSet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
