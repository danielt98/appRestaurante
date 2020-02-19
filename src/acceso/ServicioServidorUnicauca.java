/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Pedido;
import logica.Plato;
import logica.Reservado;
import logica.Usuario;

/**
 *
 * @author JuanCamilo
 */
public class ServicioServidorUnicauca implements IServiciosUsuario,IServicioPedido,IServicioPlatos{
     private ArrayList<Usuario> usuarios;
     private ArrayList<Pedido> pedidos;
     private ArrayList<Plato> platos;

     public ServicioServidorUnicauca(){
         this.inicializarDatos();
     }
    @Override
    public Usuario consultarUsuario(String usuario, String password) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUser().equals(usuario) && usuarios.get(i).getPassword().equals(password)) {
                return usuarios.get(i);
            }
        }
        return null;
    }
    private void inicializarDatos() {
        usuarios = new ArrayList();
        usuarios.add(new Usuario("980001","Federico","Mendez","1981/02/24","fedmendez","123","M","Tiene Tiquetera"));
        usuarios.add(new Usuario("980002","Juan David","Ordoñez","1971/02/24","juaordoñez","123","M","No Tiquetera"));
        usuarios.add(new Usuario("980003","Melissa","Sotelo","1961/03/24","mesotelo","123","F","Tiene Tiquetera"));
        usuarios.add(new Usuario("980004","Duque","Uribe","1971/04/24","duuribe","123","M","No Tiquetera"));
        usuarios.add(new Usuario("980005","Camilo","Ortiz","1989/04/26","camortiz","123","M","Tiene Tiquetera"));
        usuarios.add(new Usuario("980006","Aida","Merlano","1961/02/25","aimerlano","123","F","No Tiquetera"));
        usuarios.add(new Usuario("980007","Natalia","Fernadez","1981/02/24","natfernandez","123","F","Tiene Tiquetera"));
        usuarios.add(new Usuario("980008","Omero","Sanchez","1991/07/24","omesanchez","123","M","No Tiquetera"));
        
        pedidos = new ArrayList();
        
        platos = new ArrayList();
        platos.add(new Plato("Lulo","Consomé","Blanco","Frijol","Pollo frito"));
        platos.add(new Plato("Mora","Consomé","Blanco","Lentejas","Carne sudada"));
        platos.add(new Plato("Tomate","Sopa de pasta","Arroz con pollo","Nada","Platanos"));
        platos.add(new Plato("Limonada","Sancocho de gallina","Blanco","Ensalada","Gallina"));
        
    }

    @Override
    public void agregarPedido(Plato prmPlato) {
        int id = (int)(Math.random()*10+1);
        String contenido="Jugo: "+prmPlato.getJugo()+"\n"+
                          "Sopa: "+ prmPlato.getSopa()+"\n"+
                          "Arroz: "+prmPlato.getArroz()+"\n"+
                          "Principio: "+prmPlato.getPrincipio()+"\n"+
                          "Extra: "+prmPlato.getExtra();
        pedidos.add(new Pedido(id,"",contenido, new Reservado()));
    }

    @Override
    public void eliminarPedido(Plato prmPlato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList consultarPlatos() {
        return platos;
    }
    
    
    
}
