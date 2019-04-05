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
    ContaPoupanca(float s, int n){
        super(s, n);
    }
    
    void reajusteInflação(float tr){
        saldo = saldo * (1+tr/100);
    }
    
    void atualizaSaldo(){
        //descontar 14,9% do saldo
        System.out.println("Atualiza conta corrente");
        if(saldo < 0){
            saldo = saldo - saldo * 0.851F; // F de float
        }
    }
}
