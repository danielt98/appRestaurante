/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.IServicioPedido;
import acceso.IServicioPlatos;
import acceso.ServicioServidorUnicauca;
import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class GestorPedido {
    
    private final IServicioPedido servicioPedidos;
    private MenuDelDia menu;
    
    public GestorPedido(){
        servicioPedidos = new ServicioServidorUnicauca();
        menu= new MenuDelDia();
    }
    public void agregarPedido(Plato prmPlato){
        servicioPedidos.agregarPedido(prmPlato);
    }
    public ArrayList<String> llenarMenu(){
        
        return menu.getMenu();
    }
}
