import controle.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Acesso acesso = new Acesso();
        acesso.setId(1);
        acesso.setNome("Eliazar"); 

        System.out.println("Id:"+ acesso.getId() +"\nNome: "+ acesso.getNome());

        Conta conta = new Conta();
        conta.numero = 1;
        conta.depositar(100);
        conta.depositar(100);
        conta.depositar(100);
        conta.depositar(100);
        conta.depositar(100);
        conta.sacar(150);
        conta.imprimir();

        Conta conta2 = new Conta();
        conta2.numero = 2;
        conta2.depositar(100);
        conta2.depositar(100);
        conta2.depositar(100);
        conta2.depositar(100);
        conta2.depositar(100);
        conta2.depositar(100);

        conta2.sacar(25);
        conta2.sacar(600);
        conta2.imprimir();

    }
}
