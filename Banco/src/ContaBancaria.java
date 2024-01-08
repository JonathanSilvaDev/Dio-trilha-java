public class ContaBancaria {
    public String titular;
    public int agencia;
    public int numeroCorrente;
    public double saldo;


    public void ContaBancaria(String titular, int agencia, int numeroCorrente, int saldo){
        this.titular = titular;
        this.agencia = agencia;
        this.numeroCorrente = numeroCorrente;
        this.saldo = saldo;
    }

    public void depositar(int valor){
        saldo+= valor;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getnumeroCorrente() {
        return numeroCorrente;
    }

    public void setnumeroCorrente(int numeroCorrente) {
        this.numeroCorrente = numeroCorrente;
    }

    public int getSaldo() {
        return (int) saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
