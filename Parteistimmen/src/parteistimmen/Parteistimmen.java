/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parteistimmen;

/**
 *
 * @author TEAM Dentaltechnik
 */
public class Parteistimmen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stimmen s = new Stimmen();
        //für andere Testfälle bitte Werte in parteistimmen.Stimmen.java ändern
        
        double entwichlung = bestimmeEntwichlung(s.vw,s.aw);
        boolean istZuwachs = istZuwachs(entwichlung);
        String ausgabe = toString(entwichlung, istZuwachs, s.name);
        System.out.println(ausgabe);
        
    }

    public static double bestimmeEntwichlung(double vw, double aw) {
         double entwichlung;
         entwichlung = (aw-vw)/(vw)*100;
        return entwichlung;
    }

    private static boolean istZuwachs(double entwichlung) {
        if(entwichlung >= 0){
            return true;
        }else{
            return false;
        }
    }

    private static String toString(double entwichlung, boolean istZuwachs, String name) {
        String ausgabe;
        String vz;
        if(istZuwachs == true){
            vz = "Zuwachs";
        }else{
            vz = "Verlust";
            entwichlung = entwichlung * (-1);
        }
        ausgabe = "Die Partei " + name + " hat einen " + vz + " von " + entwichlung + "% bekommen";
        return ausgabe;
    }
    
}
