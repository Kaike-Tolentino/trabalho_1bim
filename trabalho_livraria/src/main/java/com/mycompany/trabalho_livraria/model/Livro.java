package com.mycompany.trabalho_livraria.model;

import java.util.List;

public class Livro{
    
    private int idLivro;
    private String nomeLivro;
    private double vlUni;
    private int anoLan;
    private int nrPag;
    private String genero;
    private List<Autor> autor;
    private List<Editora> editora;

    public Livro() {
    }

    public Livro(int idLivro, String nomeLivro, double vlUni, int anoLan,
            int nrPag, String genero, List<Autor> autor,
            List<Editora> editora) {
        
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.vlUni = vlUni;
        this.anoLan = anoLan;
        this.nrPag = nrPag;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public double getVlUni() {
        return vlUni;
    }

    public void setVlUni(double vlUni) {
        this.vlUni = vlUni;
    }

    public int getAnoLan() {
        return anoLan;
    }

    public void setAnoLan(int anoLan) {
        this.anoLan = anoLan;
    }

    public int getNrPag() {
        return nrPag;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public List<Editora> getEditora() {
        return editora;
    }

    public void setEditora(List<Editora> editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" + "idLivro=" + idLivro + ", nomeLivro=" + nomeLivro +
                ", vlUni=" + vlUni + ", anoLan=" + anoLan + ", nrPag=" + nrPag +
                ", genero=" + genero + ", autor=" + autor + ", editora="
                + editora + '}';
    }
    
    

}
