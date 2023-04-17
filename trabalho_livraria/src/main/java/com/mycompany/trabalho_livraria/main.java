package com.mycompany.trabalho_livraria;

import com.mycompany.trabalho_livraria.model.Clientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author caina
 */
public class main {

    public static void main(String[] args) {
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        
        
        
//        Realizar a codificação do exercício e enviar os projeto para correção. 
//        Os projetos devem possuir todas as classes com construtores contendo todos 
//        os atributos e um construtor vazio, getters e setters. Na classe principal (Main) 
//        devem ser construídos todos os objetos e seus valores afim de simular uma 
//        venda real no sistema. A venda simulada deve conter 3 livros e 2 Formas de 
//        Pagamento e ao final deve se imprimir todas a venda utilizando o método toString 
//        da classe que representa a venda e todos os dados dos objetos devem ser retornados.


//          Anderson irá abrir uma livraria e precisa de um sistema para gerenciar as vendas dos livros.

//          Ele precisa armazenar os livros e dados deles como editora, autores, ano de lançamento, gêneros, 
//          número de páginas além da quantidade em estoque e preço de venda. 

//          Quando um cliente chega até a livraria, Anderson cadastra ou atualiza os dados do cliente, incluindo dados de endereço          
//          (Rua, número, Bairro, Estado e Pais) e em sequência após o cliente ter realizado sua escolha de 
//          livros a serem comprados ele irá registrar a venda contendo o valor total da venda, os itens e seus
//          respectivos valores como quantidade de venda, valor unitário de desconto, valor total de venda do item 
//          ((Vl. unitário – Vl. Desconto) * Qtd Venda do Item).

//          Ao finalizar a venda o cliente poderá utilizar uma ou mais formas de pagamento e para cada uma delas Anderson 
//          precisa saber qual foi o valor pago nesta venda.
//          Após a realização da venda a Quantidade em estoque do Item deve ser decrescida de acordo com a quantidade vendida.
            int liga = 1;
            
            do{
            String opcao;
            int opcaoo;
            
            opcao = JOptionPane.showInputDialog("Selecione uma opção: \n1- Cliente \n2- Cadastrar Livro \n3- Efetuar Venda");
            opcaoo = Integer.parseInt(opcao);
            
            switch (opcaoo){
                case (1):
            String escolha;
            int escolhaa;
             
            escolha = JOptionPane.showInputDialog("Por favor informe a opção que gostaria: \n1- Cadastrar cliente "
                            + "\n2- Atualizar cadastros do cliente");
            escolhaa = Integer.parseInt(escolha);       
                    
                if (escolhaa == 1){
                   Clientes cliente = new Clientes();

                      JOptionPane.showMessageDialog(null,"Opção selecionada CADASTRAR CLIENTE");
                      String nome = JOptionPane.showInputDialog("Por favor informe o nome do cliente: ");
                      String cpf  = JOptionPane.showInputDialog("Informe o Cpf: ");
                      String nrtelefone = JOptionPane.showInputDialog("Informe o número de telefone: ");
                      String dtnascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
                      String rua = JOptionPane.showInputDialog("Informe a sua rua: ");
                      String numero = JOptionPane.showInputDialog("Informe o numero da sua casa: ");
                      int numeroInt = Integer.parseInt(numero);
                      String bairro = JOptionPane.showInputDialog("Informe o seu bairro: ");
                      String estado = JOptionPane.showInputDialog("Informe o seu estado: ");
                      String pais = JOptionPane.showInputDialog("Informe o seu pais: ");
                      

                      cliente.setNome(nome);
                      cliente.setCpf(cpf);
                      cliente.setDtNascimento(dtnascimento);
                      cliente.setNrTelefone(nrtelefone);
                      cliente.setRua(rua);
                      cliente.setNumero(numeroInt);
                      cliente.setBairro(bairro);
                      cliente.setUf(estado);
                      listaClientes.add(cliente); 
                      
                      break;
                }else if (escolhaa == 2){
                 JOptionPane.showMessageDialog(null,"Opção selecionada ATUALIZAR CADASTROS DO CLIENTE");
                 String cpf = JOptionPane.showInputDialog("Informe o CPF do cliente que gostaria de atualizar: ");
                 
                 // Procurar na lista de clientes existentes um cliente com o CPF fornecido pelo usuário
                
                 boolean encontraCliente = false;
                 for(Clientes cliente : listaClientes){
                     if(cliente.getCpf().equals(cpf)){
                         encontraCliente = true;
                        
                         int atualiza = 0; 
                       
                         
                         do{
                        String seleciona;
                        int selecionaa;
                        
                        seleciona = JOptionPane.showInputDialog("Gostaria de alterar qual informação? "
                                                    + "\n1- Nome"
                                                    + "\n2- Nº Telefone"
                                                    + "\n3- Dt. Nascimento");
                        selecionaa = Integer.parseInt(seleciona);
                      
                        switch(selecionaa){
                            case(1):
                            String nome = JOptionPane.showInputDialog(null,"Por favor informe o novo nome do cliente: "); 
                            cliente.setNome(nome);
                            break;
                            case(2):   
                            String nrtelefone = JOptionPane.showInputDialog("Informe o novo número de telefone: ");
                            cliente.setNrTelefone(nrtelefone);
                            break;
                            case(3):
                            String dtnascimento = JOptionPane.showInputDialog("Informe a nova data de nascimento: ");    
                            break;
                      

                      
                      
                      
                     
                        } 
                     atualiza = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de realizar outra operação de cadastro? "      
                                                                + "\n0- Não"+ "\n1- Sim"));
                     }while(atualiza !=1);
                }
                 
                  
                 
                }
                    
                            
                }
          }
                System.out.println(listaClientes);
          liga=Integer.parseInt(JOptionPane.showInputDialog("Gostaria de realizar outra operação? "
                                                                + "\n1- Sim"
                                                                + "\n0- Não"));
        }while(liga != 0); 
    }
}
            
          
        
        
        
        

