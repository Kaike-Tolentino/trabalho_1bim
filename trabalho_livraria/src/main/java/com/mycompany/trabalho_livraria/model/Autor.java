package com.mycompany.trabalho_livraria.model;

import java.util.List;

/**
 *
 * @author caina
 */
public class Autor{
    
    private int idAutor;
    private String nome;
    private String nacionalidade;
    private String dtNascimento;
    private List<Editora> editora;
    
    public Autor() {
    }

    public Autor(int idAutor, String nomeAutor, String nacionalidade,
            String dtNascimento, List<Editora> editora) {
        
        this.idAutor = idAutor;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dtNascimento = dtNascimento;
        this.editora = editora;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nome;
    }

    public void setNomeAutor(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public List<Editora> getEditora() {
        return editora;
    }

    public void setEditora(List<Editora> editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nome=" + nome +
                ", nacionalidade=" + nacionalidade + ", dtNascimento="
                + dtNascimento + ", editora=" + editora + '}';
    }
    

    
    
    
}
