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
public class Aire extends Congelados{
    protected String aire;

    public Aire(String aire, String temperaturaCongelacion, String caducidad, long lote) {
        super(temperaturaCongelacion, caducidad, lote);
        this.aire = aire;
    }
    
    public String getAire(){
        return aire;
    }
    
    public void setAire(String aire){
        this.aire=aire;
    }
    
    public String toString(){
        return "Aire{" + "aire=" + aire + '}';
    }
}
