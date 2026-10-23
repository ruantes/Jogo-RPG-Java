package rpg.test;
import rpg.dominio.Inventario;
import rpg.dominio.Heroi;
import rpg.dominio.Arma;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class InventarioTest01 {
    public static void main(String[] args) {
        Heroi camilly = new Heroi();

        camilly.nome = "Camilly";
        camilly.vida = 100;
        camilly.ataque = 15;

        Inventario inventario = new Inventario();
        inventario.quantidadePocoes = 3;

        Arma espada = new Arma();
        espada.nome = "Espada de Ferro";
        espada.bonusAtaque = 8;
        espada.preco = 150;

        inventario.armaEquipada = espada;
        camilly.inventario = inventario;

        System.out.printf("""
                Heroína %s
                
                [Vida]: %d
                [Ataque]: %d
                [Poções]: %d 
                [Arma Equipada]: %s 
                [Bonus de Ataque]: + %d pontos
                [Preço da Arma]: %d moedas de ouro
                """, camilly.nome, camilly.vida, camilly.ataque, camilly.inventario.quantidadePocoes, camilly.inventario.armaEquipada.nome, camilly.inventario.armaEquipada.bonusAtaque, camilly.inventario.armaEquipada.preco);
    }
}
