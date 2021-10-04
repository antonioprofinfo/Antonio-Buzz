package controle;

public class Conta {
    public int numero;
    float saldo;
    int n1;
    int n2;


    public void depositar(float valor){
        this.saldo += valor;
        System.out.println("O valor depositado foi "+valor);
    }
   
    public void sacar(float valor){
            if(this.saldo < valor){
                System.out.println("Saldo insificiente");
            }else{
                this.saldo -= valor;
                System.out.println("O valor sacado foi " + valor);
            }       
    }

    public void imprimir(){
        System.out.printf("O numero da conta %s tem o saldo %.2f \n", numero, saldo);
    }

 }
