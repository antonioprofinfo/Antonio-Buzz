public class Automovel extends Terrestre {
    String cor;
    int nPortas;
    String placa;

    public Automovel(int capacidade, int rodas, String cor, int nPortas, String placa) {
        super(capacidade, rodas);
        this.cor=cor;
        this.nPortas = nPortas;
        this.placa = placa;
        
    }

    public Automovel(){
        super();
    }
    
}
