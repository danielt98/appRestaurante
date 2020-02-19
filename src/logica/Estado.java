/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Personal
 */
public abstract class Estado {
  
    public abstract void manejar(Pedido ped);
    
}
/*
public class Estado {
    private Pedido context;
    public Estado(Pedido pedido) {
    setContext(pedido);
    }
    public Pedido getContext() {
        return context;
    }
    public void setContext(Pedido pedido) {
        context = pedido;
    }
    public Estado(Estado source) {
        setContext(source.getContext());
    }
    public Estado pedidoEstado() {
        return null;
    }
    public static Estado InitialState(Pedido pedido) {
        return new Reservado(pedido);
    }
}*/
