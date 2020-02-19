/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.GestorPedido;
import logica.GestorUsuarios;
import logica.Plato;

/**
 *
 * @author Personal
 */
public class GUIMenuController implements ActionListener{
     private GUIMenu vista ;
    private GestorPedido modelo;
    
    public GUIMenuController(GUIMenu vista, GestorPedido modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getReservar().addActionListener(this);
    }
    public void iniciar(){
        vista.setTitle("Menu restaurante");
        vista.setLocationRelativeTo(null);
        vista.setResizable(true);
        vista.setVisible(true);
        ArrayList<String> menu= modelo.llenarMenu();
        vista.setMenu(menu);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String jugo=vista.getJugo().getSelectedItem().toString();
        String sopa=vista.getSopa().getSelectedItem().toString();
        String arroz=vista.getArroz().getSelectedItem().toString();
        String principio=vista.getPrincipio().getSelectedItem().toString();
        String extra=vista.getOtros().getSelectedItem().toString();
            modelo.agregarPedido(new Plato(jugo,sopa,arroz,principio,extra));
    }
        
}
