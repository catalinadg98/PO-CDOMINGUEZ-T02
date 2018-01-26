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
public class Frescos extends Producto{
    protected String tipo;
    
    public Frescos (String tipo, String caducidad, long lote){
        super (caducidad, lote);
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String toString(){
        return "Frescos{" + "tipo=" + tipo + '}';
    }
}
