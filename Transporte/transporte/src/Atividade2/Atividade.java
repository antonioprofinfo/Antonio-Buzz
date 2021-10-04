package Atividade2;

import java.util.Scanner;

public class Atividade{
      public static void main(String[] args) {
        int i;
        int cont_b = 0 ;
        int op;
        int cod_aux;
        float lucro;
        float perc;
        int achou;

        //Montando  o registro
        Brinquedo brinquedos[] = new Brinquedo[40];  
        
        /*Intanciação da classe Scanner
        Utilizada para capturar o que é armazenado no
        teclado e armazenar na variavel.*/        
        Scanner entrada = new Scanner(System.in);


        //Inicio do loop do programa
        do{
            //Bloco que apresenta a tela de principal de interação do cliente
           System.out.println("1 - Cadastrar brinquedo"); 
           System.out.println("2 - Mostrar Lucro"); 
           System.out.println("3 - Abaixo do estoque mínimo"); 
           System.out.println("4 - Finalizar"); 
           System.out.print("Digite sua opcao ");
           //Variável que recebe a opção do usuário
            op = entrada.nextInt(); 
        
        //Recebe a opção digitada e seleciona e aponta para o caso escolhido.
        switch(op){
            case 1 :
                //Verifica se a quantidades máxima de registro foi atingido.
                if(cont_b == 40){
                    System.out.println("Já foram cadastrados os 40 brinquedos");

                }else{

                    System.out.println("Didite o código do Brinquedo: ");
                    cod_aux = entrada.nextInt();
                    
                     //verifica o brinquedo na posição i e incrementa a proxima posição.
                    i=0;                  
                    while((i<cont_b) && (brinquedos[i].cod != cod_aux)){
                        i++;
                    }
                                       
                    if(i < cont_b){
                    System.out.println("Já existe brinquedo com este código");    
                    }else{
                        entrada = new Scanner(System.in);
                        brinquedos[cont_b] = new Brinquedo();
                        brinquedos[cont_b].cod = cod_aux;
                        System.out.println("Descrição");
                        brinquedos[cont_b].descr = entrada.nextLine();
                        System.out.println("Quantidade");
                        brinquedos[cont_b].qtd_est = entrada.nextInt();
                        System.out.println("Estado Min");
                        brinquedos[cont_b].est_min = entrada.nextInt();
                        System.out.println("preço de compra");
                        brinquedos[cont_b].p_compra = entrada.nextFloat();
                        System.out.println("Preço de venda111");
                        brinquedos[cont_b].p_venda = entrada.nextFloat();
                        cont_b++;
                        System.out.println("Brinquedo Cadastrado com sucesso");
                        
                   }
            }

            break;
            case 2 :
                System.out.println("Digite o código do brinquedo: ");
                cod_aux = entrada.nextInt();
                
                i=0;
                while((i<cont_b)&&(brinquedos[i].cod != cod_aux))
                i++;

                if (i<cont_b){
                    lucro = brinquedos[i].p_venda - brinquedos[i].p_compra;
                    perc = lucro / brinquedos[i].p_compra * 100;
                    System.out.println("Preco de compra : " + brinquedos[i].p_compra);
                    System.out.println("Preco de venda : " + brinquedos[i].p_venda);
                    System.out.println("O lucro obtido com a venda : " + lucro);
                    System.out.println("Este valor corresponde a :" + perc + "%");
                }else{
                    System.out.println("Brinquedo não cadastrado");
                }
            break;
            case 3 :
                achou = 0;
                for(i = 0; i<cont_b; i++){
                    if(brinquedos[i].qtd_est<brinquedos[i].est_min){
                        achou = 1;
                        System.out.println("Código: " + brinquedos[i].cod);
                        System.out.println("Descrição: " + brinquedos[i].descr);
                        System.out.println("Quantidade Estoque: " + brinquedos[i].qtd_est);
                        System.out.println("Estoque Mínimo: " + brinquedos[i].est_min);
                        System.out.println("++++++++++++++++++++++++++++++++");
                    }
                }
                if(achou == 0){
                    System.out.println("Nenhum brinquedo esta com estoque baixo");
                }

            break;
            case 4 :
                System.out.println("Digite 1 para sair e 2 para cancelar");
                int sair = entrada.nextInt();
                
                if(sair == 1){
                    break;
                }else{
                    op=0;
                } 
        }
  
    }while(op!=4);   
    entrada.close();
    
    }

    //Classe da variáveis do Registro
    public static class Brinquedo{
        int cod;
        int qtd_est;
        int est_min;
        float p_compra;
        float p_venda;
        String descr;
    }

    

}