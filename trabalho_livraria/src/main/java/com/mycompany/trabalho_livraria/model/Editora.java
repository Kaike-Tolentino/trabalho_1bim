package com.mycompany.trabalho_livraria.model;

/**
 *
 * @author caina
 */
public class Editora extends Endereco {
    
    private int codEditora;
    private String nome;
    private String razaoSocial;
    private String telefone;

    
    public Editora(){
        
    }
    
    public Editora(int codEditora, String nome, String razaoSocial,
            String telefone, String rua, int numero, String bairro, String uf,
            String pais){
        
        super(rua, numero, bairro, uf, pais);
        this.codEditora = codEditora;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
    }
    
    
    public int getCodEditora() {
        return codEditora;
    }

    public void setCodEditora(int codEditora) {
        this.codEditora = codEditora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Editora{" + "codEditora=" + codEditora + ", nome=" + nome +
                ", razaoSocial=" + razaoSocial + ", telefone=" + telefone + '}';
    }
    
    
}
