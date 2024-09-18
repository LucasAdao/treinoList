package guerreirosz;

public class Sayajin extends GuerreiroZ{
    public Sayajin(){
        poderDeLuta = 8000;
    }
    public Sayajin(String nome, int idade, double poderDeLuta){
        this.poderDeLuta = 8000 + poderDeLuta;
        this.nome = nome;
        this.idade = idade;
    }
}
