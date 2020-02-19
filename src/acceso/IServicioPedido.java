/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import logica.Pedido;
import logica.Plato;
import logica.Usuario;

/**
 *
 * @author Personal
 */
public interface IServicioPedido {
    public void agregarPedido(Plato prmPlato);
    public void eliminarPedido(Plato prmPlato);
}
