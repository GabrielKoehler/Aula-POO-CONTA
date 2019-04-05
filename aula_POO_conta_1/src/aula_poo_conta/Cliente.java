package aula_poo_conta;

public class Cliente {

    private String nome;
    private String cpf;
    private int idade;
    private Conta[] contas;
    private int numero_de_contas = 0;

    Cliente(String n, String cpf, int idade) {
        nome = n;
        this.cpf = cpf;
        this.idade = idade;
        contas = new Conta[10];
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumero_de_contas() {
        return numero_de_contas;
    }

    public void setNumero_de_contas(int numero_de_contas) {
        this.numero_de_contas = numero_de_contas;
    }

    void abreConta(Conta conta) {
        contas[numero_de_contas] = conta;
        numero_de_contas++;
    }

    public Conta[] getContas() {
        return contas;
    }
    
}
