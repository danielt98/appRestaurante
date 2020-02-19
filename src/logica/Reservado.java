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
public class Reservado extends Estado {
    private boolean estarde=false;
    @Override
    public void manejar(Pedido ped) {
        System.out.println("Pedido Reservado");
        if(ped.entegar){
            ped.setEstado(new Entregado());
            ped.ejecutarAccion();
        }else if(estarde){
            ped.setEstado(new NoRecogido());
            ped.ejecutarAccion();
        }
    }
}
