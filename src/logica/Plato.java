/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class Plato {
    private String jugo;
    private String sopa;
    private String arroz;
    private String principio;
    private String extra;
    private ArrayList<Usuario> usuarios;
    
    public Plato(String jugo,String sopa,String arroz,String principio,String extra){
        this.jugo=jugo;
        this.sopa=sopa;
        this.arroz=arroz;
        this.principio=principio;
        this.extra=extra;
    }
    public void setJugo(String jugo) {
        this.jugo = jugo;
    }

    public void setSopa(String sopa) {
        this.sopa = sopa;
    }

    public void setArroz(String arroz) {
        this.arroz = arroz;
    }

    public void setPrincipio(String principio) {
        this.principio = principio;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getJugo() {
        return jugo;
    }

    public String getSopa() {
        return sopa;
    }

    public String getArroz() {
        return arroz;
    }

    public String getPrincipio() {
        return principio;
    }

    public String getExtra() {
        return extra;
    }
}
