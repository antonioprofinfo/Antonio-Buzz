public class Conta {
    int numero;
    double saldo;
    double limite;

    void depositar(double saldo){
        this.saldo += saldo;
        System.out.printf("Valor depositado é: %.2f \n", saldo);
        System.out.printf("+++++++++++++++++++++++++++++++++++++\n");
        System.out.printf("Valor depositado é: %.2f \n", this.saldo);
    }

    void sacar(double saldo){
        this.saldo -= saldo;
    }

    void verSaldo(){
        System.out.printf("Saldo da conta corrente: %s é igual a %.2f: \n", numero, this.saldo);
    }
}