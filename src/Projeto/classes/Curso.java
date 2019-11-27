package Projeto.classes;

import java.util.ArrayList;

 
public class Curso {
//  AREA PARA DECLARAÇAO DOS ATRIBUTOS
    
    private String nome;
    private int duracao;
    private String tipo;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso(String nome, int duracao, String tipo) {
        this.nome = nome;
        this.duracao = duracao;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void cadastrarCurso(Curso curso){
        
    }
    
    
    
}
