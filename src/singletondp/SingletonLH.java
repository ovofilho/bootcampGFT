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

//implementação de singleton lazy holder, detentora da instância
public class SingletonLH {
    
    public static class SingHolder{
        public static SingletonLH istancia = new SingletonLH();
    }
    
    private SingletonLH(){
        super();
    }
    
    public static SingletonLH getInstancia(){
        return SingHolder.istancia;
    }
    
}
