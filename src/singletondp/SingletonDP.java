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

//exemplo de singleton preguiçoso
public class SingletonDP {

   private static SingletonDP instancia;//instnacia dele mesmo
   
   private SingletonDP(){//construtor privado dele mesmo 
       super(); //chamar o método pai é opcional
   }
   
   public static SingletonDP getInstancia(){
       if(instancia==null){//se não houver instancia é pq nunca foi usado
           instancia = new SingletonDP();
       }
       return instancia;
   }
}
