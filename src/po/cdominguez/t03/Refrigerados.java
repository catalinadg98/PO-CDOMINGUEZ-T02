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
public class Refrigerados extends Producto {
    protected String temperaturaRecomendada;
    
    public Refrigerados (String temperaturaRecomendada, String caducidad, long lote){
        super(caducidad, lote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    public String getTemperaturaR(){
        return temperaturaRecomendada;
    }
    
    public void setTemperaturaR(String temperaturaRecomendada){
        this.temperaturaRecomendada=temperaturaRecomendada;
    }
    
    public String toString(){
        return "Refrigerados{" + "temperaturaRecomendada=" + temperaturaRecomendada + '}';
    }
}
