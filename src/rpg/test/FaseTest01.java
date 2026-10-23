package rpg.test;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;
import rpg.dominio.Fase;

public class FaseTest01 {
    public static void main(String[] args) {
        Fase florestaSombria = new Fase();
        Monstro goblin = new Monstro();

        florestaSombria.nome = "Floresta Sombria";
        goblin.nome = "Goblin";

        System.out.printf("""
                Fase %s
                Inimigos: %s
                """, florestaSombria.nome, goblin.nome);
    }
}
