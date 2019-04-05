package aula_poo_conta;

public class ContaCorrente extends Conta{
    ContaCorrente(float s, int n){
        super(s, n);//exec class constructor
    }
    
    void atualizaSaldo(){
        //descontar 14,9% do saldo
        System.out.println("Atualiza conta corrente");
        if(saldo < 0){
            saldo = saldo - saldo * 0.851F; // F de float
        }
    }
}
