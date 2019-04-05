package aula_poo_conta;

public class Banco {
    
   private Conta [] contas = new Conta[100];
   int i_cliente;
   private Cliente [] clientes = new Cliente[10000];
   int i_conta;
   String nome;
   
   static Banco ref_unica_para_banco;
   
   private Banco(String n){nome = n;};
   
   static Banco instanciaBanco(String nome){
       if(ref_unica_para_banco == null){
           ref_unica_para_banco = new Banco(nome);
       }
       return ref_unica_para_banco;
   };
   
   void cadastraCliente(Cliente c){
       clientes[i_cliente] = c;
       i_cliente++;
   }
   
   void cadastraConta(Conta c){
       contas[i_conta] = c;
       i_conta++;
   }
   
   void imprimeContas(){
        for(Conta c: contas){
            if(c != null){
               c.imprime();
           }
       }
   }
   
   String getNome(){
        return nome;
    };
   
   void atualizaContas(){
        for(Conta c: contas){
            if(c != null) 
                if(c instanceof ContaPoupanca){
                   ContaPoupanca cp = (ContaPoupanca) c; //Cast ou Coerção
                   cp.setTr(1.5F);
                }
                c.atualizaSaldo();
                System.out.println("Saldo: " + c.getSaldo());
            }
   }
   
    
}
