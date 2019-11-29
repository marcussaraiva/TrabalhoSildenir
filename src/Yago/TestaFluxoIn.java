package Yago;

import java.io.*;

import java.util.Scanner;



 

public class TestaFluxoIn {
    static int m=0;
 

        // grava um arquivo texto

        public void gravarArquivo() {

        try {

                // cria a variavel baseando-se no BufferedWriter

                BufferedWriter arquivo = new BufferedWriter(new FileWriter("C:\\Users\\yagov\\OneDrive\\Área de Trabalho\\Relatorio.txt", true));

 

                        // grava algumas bobagens

                arquivo.write("CURSO: "+trabalho.curso);
                arquivo.write("\n");
                arquivo.write("Nome  |  Nota A  |  Nota B  |  Recuperacao  |  Status");
                while(m!=trabalho.quantCurso){
                arquivo.write(Notas.materia[m].nome);
              
                
                arquivo.write("\n");
                for(int i=0;i<trabalho.getQuantAlunos();i++){
                    arquivo.write(Notas.materia[m].alunos[i]+"  |  "+Notas.materia[m].notasA[i]+"  |  "+Notas.materia[m].notasB[i]+"  |  "+Notas.materia[m].notasR[i]+"  |  "+Notas.materia[i].status[i]+"\n");
                    
                }
                m++;

                }

 

                // fecha o arquivo

                arquivo.close();

 

        } catch (IOException e) {

            e.printStackTrace();

        }

        }

 

        // le o dados do arquivo

        static void lerArquivo() {

                try {

                        // abre o arquivo

                Scanner arquivo = new Scanner(new File("C:\\Users\\yagov\\OneDrive\\Área de Trabalho\\Relatorio.txt"));

 

                // percorre o mesmo

                while (arquivo.hasNextLine()) {

                        System.out.println(arquivo.nextLine());

                }

 

                // fecha

                arquivo.close();

 

        } catch (FileNotFoundException e) {

                e.printStackTrace();

        }

        }

}