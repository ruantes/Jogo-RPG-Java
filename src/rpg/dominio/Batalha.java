package rpg.dominio;

public class Batalha {
    public void AtacarComHeroi(Heroi heroi, Monstro monstro) {

        if (!heroi.isVivo() || !monstro.isVivo()) {
            System.out.println("Não é possivel realizar o ataque");
            return;

        }
        heroi.isVivo();
        monstro.isVivo();

        int dano = heroi.calcularDano(monstro.defesa);

        System.out.println();


    }

    public void AtacarComMonstro(Monstro monstro, Heroi heroi) {
        if (!monstro.isVivo() || !heroi.isVivo()) {
            System.out.println("Não é possível atacar");
            return;
        }

        int danoMonstroAtaque = monstro.calcularDanoMonstro(heroi.defesa);
    }
}
