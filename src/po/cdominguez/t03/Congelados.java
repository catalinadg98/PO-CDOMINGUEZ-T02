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
public class Congelados extends Producto {
    protected String temperaturaCongelacion;
    
    public Congelados (String temperaturaCongelacion, String caducidad, long lote){
        super(caducidad, lote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
    
    public String getTemperaturaC(){
        return temperaturaCongelacion;
    }
    
    public void setTemperaturaC(String temperaturaCongelacion){
        this.temperaturaCongelacion=temperaturaCongelacion;
    }
    
    public String toString(){
        return "Congelados{" + "temperaturaCongelacion=" + temperaturaCongelacion + '}';
    }
}
