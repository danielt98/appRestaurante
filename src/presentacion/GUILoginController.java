/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;


import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.GestorPedido;
import logica.GestorUsuarios;
import logica.Usuario;

/**
 *
 * @author Personal
 */
public class GUILoginController implements ActionListener {

    private GUIAutenticacion vista ;
    private GestorUsuarios modelo;
    
    public GUILoginController(GUIAutenticacion vista, GestorUsuarios modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getIngresar().addActionListener(this);
    }
    public void iniciar(){
        vista.setTitle("INICIAR SESION");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = vista.getUsuer();
        String password = vista.getPassword();
        Usuario user=modelo.consultarUsuario(usuario, password);
        String Tiquetera =user.getTiquetera();
        if( user!= null){
            vista.dispose();
            GUIMenu vistaMenu = new GUIMenu();
            GestorPedido modeloMenu = new GestorPedido();
            GUIMenuController controlador = new GUIMenuController(vistaMenu, modeloMenu);
            controlador.iniciar();
            vistaMenu.setTiquetera(Tiquetera);
        }else{
            JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña son incorrectos");
            //utilidades.mensajeError("Usuario / Contraseña Incorrectos", "Error de Autenticacion");
        }
        
    }

  

    

}

