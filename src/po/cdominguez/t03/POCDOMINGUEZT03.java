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
public class POCDOMINGUEZT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nitrogeno Nieve = new Nitrogeno ("Congelado con nitrógeno", "-20ºC", "20 de Diciembre de 2018", 69234);
        Agua Pollo = new Agua ("Congelado con agua", "-10ºC", "5 de Febrero de 2018", 62946);
        Aire Pizza = new Aire ("Congelado con aire", "-15ºC", "10 de Marzo de 2018", 37462);
        Refrigerados Leche = new Refrigerados ("2ºC", "23 de Marzo de 2018", 64538);
        Frescos Manzana = new Frescos ("Fruta", "12 de Febrero de 2018", 34729);
        
        Nieve.toString();
        Pollo.toString();
        Pizza.toString();
        Leche.toString();
        Manzana.toString();
    }
    
}
