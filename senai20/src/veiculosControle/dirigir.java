package veiculosControle;

public class dirigir {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ac(10);
        carro.ac(10);
        carro.ac(10);
        carro.ac(10);
        carro.ac(10);
        carro.freiar(20);

        

        System.out.println(carro.getVelocidade());
    }

    
    

}
