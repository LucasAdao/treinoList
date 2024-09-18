package guerreirosz;

public class Namekozejin extends GuerreiroZ{
    public Namekozejin(){
        poderDeLuta = 5000;
    }
    public Namekozejin(String nome, int idade, double poderDeLuta){
        this.poderDeLuta = 5000 + poderDeLuta;
        this.nome = nome;
        this.idade = idade;
    }
}
