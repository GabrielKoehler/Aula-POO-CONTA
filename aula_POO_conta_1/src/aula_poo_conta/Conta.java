package aula_poo_conta;

public abstract class Conta {
    /*
     atributos da classe
     */

    protected float saldo;
    protected int nr;
    protected Cliente[] clientes;
    protected int numero_de_clientes = 0;

    /*
     operações da classe
     */
    public Conta(float s, int n) {
        saldo = s;
        nr = n;
        clientes = new Cliente[10];
    }

    void deposita(float valor) {
        saldo += valor; // saldo = saldo + valor
    }

    void retira(float valor) {
        saldo -= valor;
    }

    void transfere(Conta destino, float valor) {
        destino.saldo += valor;
        saldo -= valor;
    }

    float getSaldo() {
        return saldo;
    }

    void setSaldo(float s) {
        saldo = s;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNumero_de_clientes() {
        return numero_de_clientes;
    }

    public void setNumero_de_clientes(int numero_de_clientes) {
        this.numero_de_clientes = numero_de_clientes;
    }

    void adicionaCliente(Cliente c) {
        clientes[numero_de_clientes] = c;
        numero_de_clientes++;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    void imprime() {
        System.out.println("Saldo da conta " + nr + ": " + saldo);
    }
    
    abstract void atualizaSaldo();
}
