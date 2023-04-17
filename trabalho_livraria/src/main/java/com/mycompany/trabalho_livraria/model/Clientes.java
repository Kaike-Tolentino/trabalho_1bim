package com.mycompany.trabalho_livraria.model;

/**
 *
 * @author caina
 */
public class Clientes extends Endereco{
    
    private String nome;
    private String cpf;
    private String dtNascimento;
    private String nrTelefone;
    
    
   
    public Clientes(){
    }
    
    public Clientes (String nome, String cpf, String dtNascimento,
            String nrTelefone, String rua, int numero, String bairro,
            String uf,String pais){
       
       super(rua, numero, bairro, uf, pais);
       this.nome = nome;
       this.cpf = cpf;
       this.dtNascimento = dtNascimento;
       this.nrTelefone = nrTelefone;
       
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }
 
   

    @Override
    public String toString() {
        return "Clientes{" + "nome=" + nome + ", cpf=" + cpf + ", dtNascimento="
                + dtNascimento + ", nrTelefone=" + nrTelefone + '}';
    }
    
}
