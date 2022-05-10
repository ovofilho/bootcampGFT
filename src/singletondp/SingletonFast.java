/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */
package singletondp;

/**
 *
 * @author Aluno
 */
//singleton fast. A diferença é instanciar na declaração da instancia
public class SingletonFast {
  
   private static SingletonFast instancia = new SingletonFast();//instnacia dele mesmo
   
   private SingletonFast(){//construtor privado dele mesmo 
       super(); //chamar o método pai é opcional
   }
   
   public static SingletonFast getInstancia(){
      
       return instancia;
   }


    
}
