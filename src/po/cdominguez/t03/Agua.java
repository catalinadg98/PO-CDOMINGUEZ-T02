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
public class Agua extends Congelados{
    protected String agua;

    public Agua(String agua, String temperaturaCongelacion, String caducidad, long lote) {
        super(temperaturaCongelacion, caducidad, lote);
        this.agua = agua;
    }
    
    public String getAgua(){
        return agua;
    }
    
    public void setAgua(String agua){
        this.agua=agua;
    }
    
    public String toString(){
        return "Agua{" + "agua=" + agua + '}';
    }
}
