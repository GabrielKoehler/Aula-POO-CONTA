package aula_poo_conta;

public class Aula_POO_conta {

    public static void main(String[] args) {

        Banco itau = Banco.instanciaBanco("Itau");
        
        Conta c1 = new contaInvestimento(-2, 1);
        itau.cadastraConta(c1);
        
        Conta c2 = new contaInvestimento(-1, 2);
        itau.cadastraConta(c2);
        
        Conta c3 = new ContaPoupanca(100, 3);
        itau.cadastraConta(c3);
        
        
        contaInvestimento ci1 = new contaInvestimento(1000, 3);
        itau.cadastraConta(ci1);
        
        itau.atualizaContas();

        
/*
        Cliente jose = new Cliente("Jose", "123.123.123-01", 25);
        Cliente maria = new Cliente("Maria", "124.124.124-02", 22);

        Cliente joaquim = new Cliente("Joaquim", "321.312.321-04", 30);

        c1.adicionaCliente(jose);
        jose.abreConta(c1);

        c1.adicionaCliente(maria);
        maria.abreConta(c1);

        c2.adicionaCliente(joaquim);
        joaquim.abreConta(c2);

        c1.deposita(100);
        c2.deposita(150.50F);

        c1.transfere(c2, 50);

        imprime(c1);
        imprime(c2);
        
        //imprime(jose);
        //imprime(maria);
         
        Banco bradesco = Banco.instanciaBanco("Bradesco");
        bradesco.cadastraCliente(jose);
        bradesco.cadastraCliente(maria);
        bradesco.cadastraCliente(maria);
        
        bradesco.cadastraConta(c1);
        bradesco.cadastraConta(c2);
        
        //Novo Banco
        Banco santander = Banco.instanciaBanco("Santander");
        santander.cadastraConta(c2);
        
        
        bradesco.imprimeContas();
        santander.imprimeContas();
        
        System.out.println(santander.getNome());
        */
    }
    
    static void imprime(Cliente c){
        
    }

    static void imprime(Conta c) {
        System.out.println("**********************");
        System.out.println("saldo da conta " + c.getNr() + ": " + c.getSaldo());
        Cliente[] clientes = c.getClientes();

        //for each
        for (Cliente cli : clientes) {
            if (cli != null) {
                System.out.println(cli.getNome());
                System.out.println(cli.getCpf());
            }
        }

        System.out.println("**********************");
    }     
         
    
    

}
