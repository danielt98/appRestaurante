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
public class Pedido {
    private int id;
    private String fecha;
    private Estado objestado;
    private String contenido;
    public boolean entegar;

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public Estado getObjestado() {
        return objestado;
    }

    public String getContenido() {
        return contenido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setObjestado(Estado objestado) {
        this.objestado = objestado;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public Pedido(int id,String fecha,String contenido,Estado estado_inicial) {
        this.id=id;
        this.fecha=fecha;
        this.contenido=contenido;
        this.objestado = estado_inicial;
        this.ejecutarAccion();
    }
    
    public void ejecutarAccion(){
        objestado.manejar(this);
    }
    
    public Estado getEstado() {
        return objestado;
    }

    public void setEstado(Estado miEstado) {
        this.objestado = miEstado;
    }
}
