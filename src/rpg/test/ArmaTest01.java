package rpg.test;
import rpg.dominio.Arma;

public class ArmaTest01 {
    public static void main(String[] args) {
        Arma espadaDeMadeira = new Arma();
        Arma espadaDeFerro = new Arma();

        espadaDeMadeira.nome = "Espade de Madeira";
        espadaDeMadeira.bonusAtaque = 2;
        espadaDeMadeira.preco = 50;

        espadaDeFerro.nome = "Espada de Ferro";
        espadaDeFerro.bonusAtaque = 8;
        espadaDeFerro.preco = 150;

        System.out.printf("""
                Arma: %s
                
                [Bonus de Ataque]: + %d
                [Preço]: %d moedas de ouro
                """, espadaDeMadeira.nome, espadaDeMadeira.bonusAtaque, espadaDeMadeira.preco);

        System.out.println("----------------------");

        System.out.printf("""
                Arma: %s
                
                [Bonus de Ataque]: + %d
                [Preço]: %d moedas de ouro
                """, espadaDeFerro.nome, espadaDeFerro.bonusAtaque, espadaDeFerro.preco);
    }
}
