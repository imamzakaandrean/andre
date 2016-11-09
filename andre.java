
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg1;

/**
 *
 * @author TOSHIBA
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance
        Bumi bm=new Bumi();
        
        System.out.println(bm.hidup());
        System.out.println(bm.takhidup());
        
    }
    
}
class Bumi {
    public String hidup (){
        return"hewan,tumbuhan,manusia";
        
    }
    public String takhidup (){
        return"laut,daratan";
    }
    
}