package guerreirosz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Humano hiero = new Humano();
        hiero.setPoderDeLuta(4000);
        hiero.setNome("Hiero");
        System.out.println("Hiero: " + hiero.getPoderDeLuta());

        Sayajin goku = new Sayajin();
        goku.setPoderDeLuta(4000);
        goku.setNome("Goku");
        System.out.println("Goku: " + goku.getPoderDeLuta());

        var picollo = new Namekozejin();
        picollo.setPoderDeLuta(4000);
        picollo.setNome("Picollo");
        System.out.println("Picollo: " + picollo.getPoderDeLuta());

        List<GuerreiroZ> listaGuerreiroZ = new ArrayList<>();
        listaGuerreiroZ.add(goku);
        listaGuerreiroZ.add(picollo);
        listaGuerreiroZ.add(hiero);
        listaGuerreiroZ.sort(Comparator.comparing(GuerreiroZ::getPoderDeLuta).reversed());
        System.out.println(listaGuerreiroZ);
    }
}
