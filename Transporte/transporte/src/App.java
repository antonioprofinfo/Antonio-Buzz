public class App {
    public static void main(String[] args) throws Exception {
      Automovel automovel = new Automovel(1, 4, "Azul", 2, "ABC123");
      System.out.println(automovel.capacidade);

      Transporte transporte = new Transporte();
      System.out.println(transporte.capacidade);

    Terrestre terrestre = new Terrestre();
        System.out.println(terrestre.capacidade);


    }
}
