package rpg.test;
import rpg.dominio.Monstro;

public class MonstroTest01 {
    public static void main(String[] args) {
        Monstro goblin = new Monstro();
        Monstro esqueleto = new Monstro();
        Monstro guardiaoSombrio = new Monstro();

        goblin.nome = "Goblin";
        goblin.vida = 30;
        goblin.ataque = 6;
        goblin.defesa = 1;

        esqueleto.nome = "Esqueleto";
        esqueleto.vida = 45;
        esqueleto.ataque = 9;
        esqueleto.defesa = 2;

        guardiaoSombrio.nome = "Guardião Sombrio";
        guardiaoSombrio.vida = 75;
        guardiaoSombrio.ataque = 12;
        guardiaoSombrio.defesa = 3;

        System.out.printf("""
                Monstro %s
                
                [vida]: %d
                [ataque]: %d
                [defesa]: %d
                """, goblin.nome, goblin.vida, goblin.ataque, goblin.defesa);

        System.out.println("------------");

        System.out.printf("""
                Monstro %s
                
                [vida]: %d
                [ataque]: %d
                [defesa]: %d
                """, esqueleto.nome, esqueleto.vida, esqueleto.ataque, esqueleto.defesa);

        System.out.println("------------");

        System.out.printf("""
                Monstro %s
                
                [vida]: %d
                [ataque]: %d
                [defesa]: %d
                """, guardiaoSombrio.nome, guardiaoSombrio.vida, guardiaoSombrio.ataque, guardiaoSombrio.defesa);
    }
}
