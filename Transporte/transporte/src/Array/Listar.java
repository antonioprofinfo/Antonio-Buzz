package Array;

public abstract class Listar {
    int id;
    String nome;
    String curso;
    float mesalidade;


    public Listar(int id, String nome, String curso, float mesalidade) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.mesalidade = mesalidade;
    }

    public Listar(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }


    public void desconto(float valorDesconto){
        this.mesalidade -= 10;
    }
    
    public float desconto(float mensalidade, float valorDesconto){
        this.mesalidade = mensalidade - valorDesconto;
        return this.mesalidade;
    }

    public String toString(){
        return("Id:"+ this.id+
                "\nNome: " + this.nome+
                "\nCurso: " + this.curso+
                "\nmensalidade: " + this.mesalidade);
    }
    

    

}
