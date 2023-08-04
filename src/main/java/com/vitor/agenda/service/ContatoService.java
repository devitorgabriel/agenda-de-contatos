package com.vitor.agenda.service;

import com.vitor.agenda.model.Contato;
import com.vitor.agenda.view.ContatoMenu;

import java.util.ArrayList;
import java.util.List;

public class ContatoService{

    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato( ){
        Contato paraAdicionar = ContatoMenu.novo();

        for (var contato: contatos) {
            boolean temNomeIgual = contato.getNome().equalsIgnoreCase(paraAdicionar.getNome());
            boolean temSobreNomeIgual = contato.getSobreNome().equalsIgnoreCase(paraAdicionar.getSobreNome());

            if(temNomeIgual && temSobreNomeIgual) {

                System.out.println("Contato já existente.");
                return;
            }
        }

        contatos.add(paraAdicionar);
    }



}
