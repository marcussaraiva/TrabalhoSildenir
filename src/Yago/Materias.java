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
    double[] notasR = new double[trabalho.getQuantAlunos()];
    int[] faltas = new int[trabalho.getQuantAlunos()];
    int hora = trabalho.getHoras();
    int cota = (int) (hora * 0.25);
    int quantRecuperacao=0;
    public void Avaliar(){
        for(int i=0 ; i<trabalho.getQuantAlunos(); i++){
            double media;
            media = (notasA[i]+notasB[i])/2;
            if(faltas[i]>cota){
                status[i] = "REPROVADO POR FALTA";
            }else if(media<2){
                status[i] = "REPROVADO";
            }
            else if(media<7){
                status[i] = "RECUPERACAO";
            }
            else if(media>=7) {
                status[i] = "APROVADO";
            }
            System.out.println(status[i]);
        }
        
    }
    
    public void Contar(){
        for(int i=0;i<trabalho.getQuantAlunos();i++){
            if(status[i]=="RECUPERACAO"){
                quantRecuperacao++;
            }
        }
    }
    
    public int[] Recupera(){
        int[] recuperados = new int[quantRecuperacao];
        for(int i=0;i<trabalho.getQuantAlunos();i++){
            if(status[i]=="RECUPERACAO"){
                recuperados[i] = i;
                
                
            }
        }
        return recuperados;
    }  
    
}
