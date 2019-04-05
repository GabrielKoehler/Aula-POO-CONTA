package aula_poo_conta;
    
public class contaInvestimento extends Conta{
    public contaInvestimento(float s, int n){
        super(s,n); // exec class constructor
   
    }
    
    void atualizaSaldo(){
        System.out.println("Atualiza conta de investimento");
        saldo = saldo*1.01F;
    }
}
