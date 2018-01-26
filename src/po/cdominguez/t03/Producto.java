/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po.cdominguez.t03;

/**
 *
 * @author cat_dominguez
 */
public abstract class Producto {
    //Atributos
    protected String caducidad;
    protected long lote;
    
    //Métodos
    public Producto(){
        caducidad="";
        lote=0;
    }
    
    public Producto(String caducidad, long lote){
        this.caducidad = caducidad;
        this.lote = lote;
    }
    
    public String getCaducidad(){
        return caducidad;
    }
    
    public void setCaducidad(String caducidad){
        this.caducidad=caducidad;
    }
    
    public long getLote(){
        return lote;
    }
    
    public void setLote(long lote){
        this.lote=lote;
    }
    
    public String toString(){
        return "Producto{" + "caducidad=" + caducidad + "lote=" + lote +'}';
    }
}
