package Projeto.controlador;

import Projeto.classes.Curso;

public class CursoControlador {
    
    public boolean cadastrarCurso(String nome, int duracao, String tipo){
        
        if(nome!=null && nome.length()>0 && duracao>0 && tipo!=null && tipo.length()>0){
            
            Curso curso = new Curso(nome, duracao, tipo);
            
            curso.cadastrarCurso(curso);
            
            return true;
        } else {
            return false;
        }
    }
}
