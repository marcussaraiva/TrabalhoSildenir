package Yago;

import java.io.*;

import java.util.Scanner;



 

public class TestaFluxoIn {
    static int m=0;
 

        // grava um arquivo texto

        public void gravarArquivo() {

        try {

                // cria a variavel baseando-se no BufferedWriter

                BufferedWriter arquivo = new BufferedWriter(new FileWriter("C:\\Users\\Serjao\\Desktop\\Relatorio.txt", true));

 

                        // grava algumas bobagens
                arquivo.newLine();            
                arquivo.write("CURSO: "+trabalho.curso);
                arquivo.newLine();
                arquivo.newLine();
                arquivo.write("Nome  |  Nota A  |  Nota B  |  Status");
                while(m!=trabalho.quantCurso){
                    arquivo.newLine();
                    arquivo.newLine();
                    arquivo.write(Notas.materia[m].nome);
              
                
                
                for(int i=0;i<trabalho.getQuantAlunos();i++){
                    arquivo.newLine();
                    arquivo.write(Notas.materia[m].alunos[i]+"  |  "+Notas.materia[m].notasA[i]+"  |  "+Notas.materia[m].notasB[i]+"  |  "+Notas.materia[m].status[i]);
                    
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

                Scanner arquivo = new Scanner(new File("C:\\Users\\Serjao\\Desktop\\Relatorio.txt"));

 

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