package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Livros> livros = new ArrayList<>();
    public void AdicionarLivro(Livros livros){
        livros.add(livros);
    }
    public void ConsultarLivro() {
        System.out.println("Os livros listados são: ");
        for (Livros livro : livros) {
            System.out.println(livro.titulo);
        }
    }
}
