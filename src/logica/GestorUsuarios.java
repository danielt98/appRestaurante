/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import acceso.IServiciosUsuario;
import acceso.ServicioServidorUnicauca;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author JuanCamilo
 */
public class GestorUsuarios{
    
    private final IServiciosUsuario servicioUsuarios;
    
    public GestorUsuarios(){
        servicioUsuarios = new ServicioServidorUnicauca();
    }
    
    
    /**
     * Metodo que devuelve un usuario
     * @param usuario usuario por el cual se desea buscar
     * @param password contraseña de ese usuario
     * @return usuario
     */
    public Usuario consultarUsuario(String usuario,String password){
        Usuario miUsuario = null;
        miUsuario=servicioUsuarios.consultarUsuario(usuario, password);
        return miUsuario;
    }
}
