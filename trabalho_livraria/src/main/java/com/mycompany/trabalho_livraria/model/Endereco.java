package com.mycompany.trabalho_livraria.model;

/**
 *
 * @author caina
 */
public class Endereco {
    
    private String rua;
    private int numero;
    private String bairro;
    private String uf;
    private String pais;
    
    //Construtores
    public Endereco(){
        
    }
    
    public Endereco(String rua, int numero, String bairro, String uf,String pais){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.uf = uf;
        this.pais = pais;
    }
    
    //Getters e Setters
    public String getRua(){
        return rua;
    }
    public void setRua (String rua){
        this.rua = rua;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String bairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getUf(){
        return uf;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
    
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    
    //toString
    @Override
    public String toString(){
        return "Endereco{ " + "nrua = " + rua + ", numero = " + numero + ", bairro" +
                bairro + ", uf = " + uf + ", pais = " + pais + "}";
    }

   
    
}
