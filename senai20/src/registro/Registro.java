package registro;

import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        //Brinquedo brinquedos[] = new Brinquedo[40];
        Scanner entrada = new Scanner(System.in);
        int op;
        /*brinquedos[1].cod = 1;
        brinquedos[1].qtd_est = 1;
        brinquedos[1].p_compra = 100;
        brinquedos[1].p_venda = 120;
        brinquedos[1].desc = "Azul";*/
        do{
            System.out.println("1 - Cadastrar Brinquedo");
            System.out.println("2 - Mostrar Lucro");
            System.out.println("3 - Mostrar produto estoque baixo");
            System.out.println("4 - Finalizar");
            System.out.println("Digite a opção");
            op = entrada.nextInt();

            switch(op){
                case 1:

                break;

                case 2:

                break;

                case 3:
                
                break;
            }


        }while(op != 4);                
        entrada.close();
    }

    public static class Brinquedo{
        int cod;
        int qtd_est;
        int est_min;
        float p_compra;
        float p_venda;
        String  desc; 
    }
    
}
