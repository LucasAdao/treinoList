import model.Animal;
import model.Aviao;
import model.Cachorro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        Cachorro hot =  new Cachorro();
        hot.setNome("Sparta");
        Animal sparta = new Animal();
        hot.setIdade(3);
        //usado para foreach, aqui está obvio que hot é instancia de Animal
        if(hot instanceof Animal) {
            sparta  = (Animal) hot;
        }else{
            System.out.println("Seu objeto não é um animal!");
        }
        System.out.println(sparta.getNome());

    }
}