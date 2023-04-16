
package com.mycompany.trabalho_livraria.model;

 //ATRIBUTOS
   public class Venda {
   
    private int idVenda;
    private int qtd_vendaItem;
    private double vl_totalVenda;
    private double vl_unitario;
    private double vl_desconto;
    private double vl_totalItem;
    private String forma_pgto;
    private double vl_pago;
    private double vl_troco;
    
 //CONSTRUTORES
   public Venda(){
       
   }                     

    public Venda(int idVenda, int qtd_vendaItem, double vl_totalVenda, double vl_unitario, double vl_desconto, double vl_totalItem, String forma_pgto, double vl_pago, double vl_troco) {
        this.idVenda = idVenda;
        this.qtd_vendaItem = qtd_vendaItem;
        this.vl_totalVenda = vl_totalVenda;
        this.vl_unitario = vl_unitario;
        this.vl_desconto = vl_desconto;
        this.vl_totalItem = vl_totalItem;
        this.forma_pgto = forma_pgto;
        this.vl_pago = vl_pago;
        this.vl_troco = vl_troco;
    }

    
   //MÉTODOS
    
    
    
 
   
//GETTER AND SETTERS
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getVl_totalVenda() {
        return vl_totalVenda;
    }

    public void setVl_totalVenda(double vl_totalVenda) {
        this.vl_totalVenda = vl_totalVenda;
    }

    public double getVl_unitario() {
        return vl_unitario;
    }

    public void setVl_unitario(double vl_unitario) {
        this.vl_unitario = vl_unitario;
    }

    public double getVl_desconto() {
        return vl_desconto;
    }

    public void setVl_desconto(double vl_desconto) {
        this.vl_desconto = vl_desconto;
    }

    public double getVl_totalItem() {
        return vl_totalItem;
    }

    public void setVl_totalItem(double vl_totalItem) {
        this.vl_totalItem = vl_totalItem;
    }

    public int getQtd_vendaItem() {
        return qtd_vendaItem;
    }

    public void setQtd_vendaItem(int qtd_vendaItem) {
        this.qtd_vendaItem = qtd_vendaItem;
    }
    
    public String getForma_pgto() {
        return forma_pgto;
    }

    public void setForma_pgto(String forma_pgto) {
        this.forma_pgto = forma_pgto;
    }

    public double getVl_pago() {
        return vl_pago;
    }

    public void setVl_pago(double vl_pago) {
        this.vl_pago = vl_pago;
    }

    public double getVl_troco() {
        return vl_troco;
    }

    public void setVl_troco(double vl_troco) {
        this.vl_troco = vl_troco;
    }

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", qtd_vendaItem=" + qtd_vendaItem + ", vl_totalVenda=" + vl_totalVenda + ", vl_unitario=" + vl_unitario + ", vl_desconto=" + vl_desconto + ", vl_totalItem=" + vl_totalItem + ", forma_pgto=" + forma_pgto + ", vl_pago=" + vl_pago + ", vl_troco=" + vl_troco + '}';
    }
    
}
    
