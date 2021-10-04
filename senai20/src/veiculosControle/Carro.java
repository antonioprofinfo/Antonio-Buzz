package veiculosControle;

public class Carro extends veiculo {

    public Carro(String marca, String modelo, String cor, String tipo, int velocidade) {
        super(marca, modelo, cor, tipo, velocidade);
        
    }

    public Carro(){
        super();
    }

    public int Acelerar(int velocidade){
         return super.Acelerar(velocidade);
    }

    public int freiar(int velocidade){
        return super.freiar(velocidade);
    }

    public void ac(int velocidade){
        setVelocidade(velocidade);
    }

    


    
}
