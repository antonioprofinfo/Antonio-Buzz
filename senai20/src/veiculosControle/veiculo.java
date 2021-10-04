package veiculosControle;

public abstract class veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private String tipo;
    private int velocidade;


    public veiculo(String marca, String modelo, String cor, String tipo, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }


    public veiculo() {
    }

    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public int getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(int velocidade) {
        this.velocidade += velocidade;
    }

    public int Acelerar(int velocidade) {
        return this.velocidade += velocidade;
    }

    public int freiar(int velocidade) {
        return this.velocidade -= velocidade;
     }

    

    

    



}
