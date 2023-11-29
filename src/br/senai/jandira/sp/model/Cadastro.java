package br.senai.jandira.sp.model;

import java.util.Scanner;

public class Cadastro {
    public Object Cadastro;
    Scanner teclado = new Scanner(System.in);
    Livros livros = new Livros();
    Usuarios usuarios = new Usuarios();

    public void  UsuariosCadastro() {
        System.out.println("-------------------- CADASTRO USUÁRIO ---------------------");
        System.out.println("Nome completo: ");
        usuarios.nome = teclado.nextLine();
        System.out.println("Endereço: ");
        usuarios.endereco = teclado.nextLine();
        System.out.println("E-mail: ");
        usuarios.email = teclado.next();
        System.out.println("Telefone: ");
        usuarios.telefone = teclado.next();
        System.out.println("----------------- CADASTRADO COM SUCESSO! -----------------");

    }

    public void CadastrarLivros(Livros livros) {
        System.out.println("--------------------- CADASTRO LIVRO ----------------------");
        System.out.println("Título: ");
        livros.titulo = teclado.nextLine();
        System.out.println("Gênero: ");
        livros.genero = teclado.nextLine();
        System.out.println("Autor: ");
        livros.autor = teclado.nextLine();
        System.out.println("ISBN (código do livro): ");
        livros.ISBN = teclado.nextInt();
        System.out.println("-------------- LIVRO CADASTRADO COM SUCESSO! --------------");

    }

    public void  EmprestimoLivro() {
        if (livros.emprestimo == true) {
            System.out.println(livros.titulo);
        }else {
            System.out.println("Não há nenhum emprestimo!");
        }
    }
}
