/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author orland0_s400ca
 */
public class Temperatura {
    
    private List<Double> temp = new ArrayList<Double>();
    
    private List<String> meses = new ArrayList<>();
    private int qtd;
    
    public Temperatura(){
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");
    }
    public String getMes(int i){
        return meses.get(i);
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
    
    public int getQtd(){
        return qtd;
    }
    
    public Double getTemp(int mes){
        return temp.get(mes);
    }
    public void coletar(Double temp){
        if(this.temp.size() <qtd){
            this.temp.add(temp);
            System.out.println("Temperatura registrada!");
        }
        else
            System.out.println("Quantidade de meses já alcançada");  
    }
    
    public Double calcularMedia(){
        double media= 0d;
        for(Double valor :temp) media += valor;
        
        media = media/temp.size();
        return media;
    }
    
}
