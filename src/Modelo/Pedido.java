/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Pedido implements Entity {

    private int contadorPedido = 0;
    private String tipo;
    private String Decripcion;

    public int getContadorPedido() {
        return contadorPedido;
    }

    public void setContadorPedido(int contadorPedido) {
        this.contadorPedido = contadorPedido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDecripcion() {
        return Decripcion;
    }

    public void setDecripcion(String Decripcion) {
        this.Decripcion = Decripcion;
    }

    public Pedido(String tipo) {
        this.tipo = tipo;
    }

    public Pedido(String tipo, String Decripcion) {
        this.tipo = tipo;
        this.Decripcion = Decripcion;
    }

    
    
    @Override
    public boolean isComplete() {
        return tipo != null && Decripcion != null;
    }

    @Override
    public Object[] toArrayObject() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
