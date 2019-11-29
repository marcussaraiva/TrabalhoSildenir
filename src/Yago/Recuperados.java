/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yago;

/**
 *
 * @author yagov
 */
public class Recuperados {
    String nome;
    int posMateria;
    int[] PosRecuperados;
    int quantRec;
    String[] nomes = new String[quantRec];
    
    public void Nomes(int m){
        if(PosRecuperados==null){
            return;
        }
        else{
        String[] alunosRec = new String[PosRecuperados.length];
        
        for(int i=0;i<PosRecuperados.length;i++){
            alunosRec[i] = Notas.materia[m].alunos[PosRecuperados[i]];
        }
            nomes = alunosRec;
        }
    }
}
