/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import acceso.IServicioPlatos;
import acceso.ServicioServidorUnicauca;
import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class MenuDelDia {
    private ArrayList<Plato> platos;
    private final IServicioPlatos servicioPlatos;
    public MenuDelDia(){
        servicioPlatos= new ServicioServidorUnicauca();
        platos=servicioPlatos.consultarPlatos();
    }
     public ArrayList<String> getMenu() {
         String arroz="";
         String jugo="";
         String sopa="";
         String principio="";
         String otros="";
         ArrayList<String> menu= new ArrayList();
         ArrayList<String> comida= new ArrayList();
         for (int i = 0; i < platos.size(); i++) {
             if (!seAgrego(this.platos.get(i).getArroz(),comida)) {
                 arroz=arroz+this.platos.get(i).getArroz()+",";
                 comida.add(this.platos.get(i).getArroz());
             }
             if (!seAgrego(this.platos.get(i).getJugo(),comida)) {
                 jugo=jugo+this.platos.get(i).getJugo()+",";
                 comida.add(this.platos.get(i).getJugo());
             }
             if (!seAgrego(this.platos.get(i).getSopa(),comida)) {
                sopa=sopa+this.platos.get(i).getSopa()+",";
                comida.add(this.platos.get(i).getSopa());
             }
             if (!seAgrego(this.platos.get(i).getPrincipio(),comida)) {
                principio=principio+this.platos.get(i).getPrincipio()+",";
                comida.add(this.platos.get(i).getPrincipio());
             }
             if (!seAgrego(this.platos.get(i).getExtra(),comida)) {
                otros=otros+this.platos.get(i).getExtra()+",";
                comida.add(this.platos.get(i).getExtra());
             }
         }
             menu.add(arroz);
             menu.add(jugo);
             menu.add(sopa);
             menu.add(principio);
             menu.add(otros);
        return menu;
    }
     private boolean seAgrego(String producto,ArrayList<String> comida){
         for (int i = 0; i < comida.size(); i++) {
             if (producto==comida.get(i)) {
                 return true;
             }
         }
         return false;
     }
}
