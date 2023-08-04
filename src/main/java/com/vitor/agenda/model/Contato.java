package com.vitor.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    private String nome;
    private String sobreNome;
    private List<Endereco> enderecos = new ArrayList<>();
    private List<Telefone> telefones = new ArrayList<>();


    public Contato(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }


    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void addEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }

    public void removeEndereco(Endereco endereco){
        this.enderecos.remove(endereco);
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }
    public boolean removeTelefone(Telefone telefone) {
        return this.telefones.remove(telefone);
    }
}
