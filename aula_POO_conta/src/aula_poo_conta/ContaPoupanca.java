/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_poo_conta;

/**
 *
 * @author gabriel
 */
public class ContaPoupanca extends Conta{
    float tr;
    
    ContaPoupanca(float s, int n){
        super(s, n);
    }
    
    void reajusteInflacao(){
        saldo = saldo*(1+(tr/100+0.005F));
    }
    
    @Override
    void atualizaSaldo(){ // TR+5%
        //descontar 14,9% do saldo
        System.out.println("Atualiza conta Poupança");
       reajusteInflacao();       
    }
    
    void setTr(float v){
        tr=v;
    }
}
