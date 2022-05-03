/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

/**
 *
 * @author orland0_s400ca
 */
public class ExerciciosCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Temperatura objTemp= new Temperatura();
        
        objTemp.setQtd(6);
        objTemp.coletar(19d);
        objTemp.coletar(18d);
        objTemp.coletar(23d);
        objTemp.coletar(22d);
        objTemp.coletar(24d);
        objTemp.coletar(26d);
        objTemp.coletar(32d);
        objTemp.coletar(33d);
        objTemp.coletar(19d);
        objTemp.coletar(19d);
        
        Double media = objTemp.calcularMedia();
        System.out.println(media);
        
        for(int i=0; i<6; i++){
            if(media < objTemp.getTemp(i)){
                System.out.println(i + "-" + objTemp.getMes(i));
            }
        }
            
    }
    
}
