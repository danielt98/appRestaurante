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
public class NoRecogido extends Estado {

    @Override
    public void manejar(Pedido ped) {
        System.out.println("Pedido no recogido");
    }
    
}
