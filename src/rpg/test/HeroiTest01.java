package rpg.test;
import rpg.dominio.Heroi;
import rpg.dominio.Inventario;

public class HeroiTest01 {
    public static void main(String[] args) {
        Heroi andressa = new Heroi();
        Heroi ruan = new Heroi();
        Inventario inventario = new Inventario ();

        andressa.nome = "Andressa";
        andressa.vida = 100;
        andressa.ataque = 18;
        andressa.defesa = 5;
        andressa.inventario.armaEquipada.nome = "Espada de Ouro";
        andressa.inventario.armaEquipada.bonusAtaque = 7;

        ruan.nome = "Ruan";
        ruan.vida = 80;
        ruan.ataque = 20;
        ruan.defesa = 3;

        int andressaAtaqueTotal = andressa.calcularAtaqueTotal();
        int ruanAtaqueTotal = ruan.calcularAtaqueTotal();

        System.out.printf("""
                Heroína %s
                
                [Vida]: %d
                [Ataque Base]: %d
                [Defesa]: %d
                [Bonus de ataque]: %d
                [Ataque Total]:
                """, andressa.nome, andressa.vida, andressa.ataque, andressa.inventario.armaEquipada.bonusAtaque, andressaAtaqueTotal);
        System.out.println("-----------------------");
        System.out.printf("""
                Herói %s
                
                [Vida]: %d
                [Ataque Base]: %d
                [Defesa]: %d
                [Bonus de ataque]: %d
                [Ataque Total]:
                """, ruan.nome, ruan.vida, ruan.ataque, ruan.defesa, ruan.inventario.armaEquipada.bonusAtaque, ruanAtaqueTotal);
    }
}
