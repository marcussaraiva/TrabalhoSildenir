package Yago;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

 
public class Imprimir {
 
  public void Impressao() throws IOException {
    int m =0;
    FileWriter arq = new FileWriter("C:\\Users\\yagov\\OneDrive\\Área de Trabalho\\relatorio.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    gravarArq.printf("-----------------------------%s---------------------------",trabalho.curso);
    while(m!=trabalho.quantCurso){
        
        gravarArq.printf("-----------------------------%s---------------------------",Notas.materia[m].nome);
        gravarArq.printf("Nome  |  Nota A  |  Nota B  |  Recuperacao  |  Status",Notas.materia[m].nome);
        for(int i=0;i<trabalho.getQuantAlunos();i++){
            gravarArq.printf("%s  |  %s  |  %s  |  %s  |  %s\n",Notas.materia[m].alunos[i],Double.toString(Notas.materia[m].notasA[i]),Double.toString(Notas.materia[m].notasB[i]),Double.toString(Notas.materia[m].notasR[i]),Notas.materia[i].status[i]);
        }
        m++;
    }
  }
 
}