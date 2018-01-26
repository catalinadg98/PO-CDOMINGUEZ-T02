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
public class Nitrogeno extends Congelados{
    protected String nitrogeno;
    
    public Nitrogeno(String nitrogeno, String temperaturaCongelacion, String caducidad, long lote) {
        super(temperaturaCongelacion, caducidad, lote);
        this.nitrogeno = nitrogeno;
    }
    
    public String getNitrogeno(){
        return nitrogeno;
    }
    
    public void setNitrogeno(String nitrogeno){
        this.nitrogeno=nitrogeno;
    }
    
    public String toString(){
        return "Nitrogeno{" + "nitrogeno=" + nitrogeno + '}';
    }
}
