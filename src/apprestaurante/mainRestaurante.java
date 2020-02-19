/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurante;

import logica.GestorUsuarios;
import presentacion.GUIAutenticacion;
import presentacion.GUILoginController;

/**
 *
 * @author Personal
 */
public class mainRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIAutenticacion vista = new GUIAutenticacion();
       GestorUsuarios modelo = new GestorUsuarios();
       
       GUILoginController controlador = new GUILoginController(vista, modelo);
       controlador.iniciar();
    }
    
}
