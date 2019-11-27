/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yago;

/**
 * 
 *
 * @author yagov
 */
class Materias{
    String nome;
    String[] alunos = Alunos.getAlunos();
    String[] status = new String[trabalho.getQuantAlunos()];
    double[] notasA = new double[trabalho.getQuantAlunos()];
    double[] notasB = new double[trabalho.getQuantAlunos()];
    int[] faltas = new int[trabalho.getQuantAlunos()];
    
    
    public void Avaliar(){
        for(int i=0 ; i<trabalho.getQuantAlunos(); i++){
            double media;
            media = notasA[i]+notasB[i]/2;
            if(media<2){
                status[i] = "REPROVADO";
            }
            else if(media>2&&media<7){
                status[i] = "RECUPERACAO";
            }
            else{
                status[i] = "APROVADO";
            }
        }
        
    }
    
    public int[] Recuperados(){
        int k=0;
        for(int i=0;i<trabalho.getQuantAlunos();i++){
            if(status[i]=="REPROVADO"){
                k++;
            }
        }
        int[] fudidos = new int[k];
        for(int i=0;i<k;i++){
            fudidos[i] = i;
        }
        if(k==0){
            return null;
        }
        else{
            return fudidos;
        }
    }
    
}
