package com.vitor.agenda.view;

import com.vitor.agenda.model.Contato;

import java.util.Scanner;

public class ContatoMenu {

    private static Scanner scanner = new Scanner(System.in);
    public static Contato novo() {
        System.out.print("Digite o seu nome: ");
        String nome = (scanner.nextLine());

        System.out.print("Digite o seu sobrenome: ");
        String sobreNome = (scanner.nextLine());

        return new Contato(nome, sobreNome);
    }
}
