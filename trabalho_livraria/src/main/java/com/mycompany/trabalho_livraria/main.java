package com.mycompany.trabalho_livraria;

import javax.swing.JOptionPane;

/**
 *
 * @author caina
 */
public class main {

    public static void main(String[] args) {
     
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

            String opcao;
            int opcaoo;
            
            opcao = JOptionPane.showInputDialog("Selecione uma opção: \n1- Cadastrar Cliente \n2- Cadastrar Livro \n3- Efetuar Venda");
            opcaoo = Integer.parseInt(opcao);
            
            switch (opcaoo){
                case (1):
                    JOptionPane.showMessageDialog(null,"Opção selecionada CADASTRAR CLIENTE");
                    
                    break;
                case (2):
                    JOptionPane.showMessageDialog(null, "Opção selecionada CADASTRAR LIVRO");
                    break;
                case (3):
                    JOptionPane.showMessageDialog(null, "Opção selecionada EFETUAR VENDA");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;
                    
            }   
          
        
        
        
        
    }
}
