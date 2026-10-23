package rpg.test;
import rpg.dominio.Pocao;

public class PocaoTest01 {
    public static void main(String[] args) {
        Pocao pocaoPequena = new Pocao();
        Pocao pocaoGrande = new Pocao();

        pocaoPequena.nome = "Poção Pequena";
        pocaoPequena.pontosCura = 20;
        pocaoPequena.preco = 20;

        pocaoGrande.nome = "Poção Grande";
        pocaoGrande.pontosCura = 50;
        pocaoGrande.preco = 45;

        System.out.printf("""
                Tipo: %s
                
                [Cura]: %d pontos
                [Preço]: %d moedas de ouro
                """, pocaoPequena.nome, pocaoPequena.pontosCura, pocaoPequena.preco);

        System.out.println("---------------------------------");

        System.out.printf("""
                Tipo: %s
                
                [Cura]: %d pontos
                [Preço]: %d moedas de ouro
                """, pocaoGrande.nome, pocaoGrande.pontosCura, pocaoGrande.preco);
    }
}
