/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import logica.Usuario;

/**
 *
 * @author JuanCamilo
 */
public interface IServiciosUsuario {
    
    public Usuario consultarUsuario(String usuario,String password); 
}
