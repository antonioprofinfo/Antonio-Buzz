package Array;

import java.util.ArrayList;

public class App  {
        public static void main(String[] args) {
        int idA = 1;
        int idB = 2;
        int idC = 3;
        int idD = 4;

        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(idA);
        ids.add(idB);
        ids.add(idC);
        ids.add(idD);

        System.out.println(ids);

        for(int id:ids){
            System.out.println("Id"+id);
        }

        for(int i = 0; i<ids.size(); i++){
            ids.set(2, 10);        
            System.out.println(ids.get(i));
        }

        ids.forEach(idf->{
            System.out.println("id" + idf);
        });

        PegarLista listaA = new PegarLista("Eliezar", "TI2");
        //Listar listaB = new Listar(2, "Antonio", "Culinária", 100);
        //Listar listaC = new Listar(1, "Wendel", "Programação WEB", 150);
        //Listar listaD = new Listar("Wendel", "Programação WEB");
        
        ArrayList<Listar> listar = new ArrayList<>();
        listar.add(listaA);
        //listar.add(listaB);
        //listar.add(listaC);
        //listar.add(listaD);

        //System.out.println(listar);
        
        listar.forEach(listaf->{
            System.out.println(
                "Id:"+ listaf.id+
                "\nNome: " + listaf.nome+
                "\nCurso: " + listaf.curso+
                "\nmensalidade: " + listaf.mesalidade);
        });





        
        
        

    }
}
