package guerreirosz;

public class Humano extends GuerreiroZ{
    public Humano(){
        poderDeLuta = 3000;
    }
    public Humano(String nome, int idade, double poderDeLuta){
        this.poderDeLuta = 3000 + poderDeLuta;
        this.nome = nome;
        this.idade = idade;
    }
}
