package rpg.test;
import rpg.dominio.Jogo;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;

public class JogoTest01 {
    public static void main(String[] args) {
     Jogo jogo = new Jogo();
     Heroi andressa = new Heroi();
     Monstro demogorgon = new Monstro();

     jogo.titulo = "A Jornada em Eldoria!";

     andressa.nome = "Andressa";
     andressa.vida = 15;

     demogorgon.nome = "Demogorgon";
     demogorgon.vida = 30;

     String heroiEstaVivo = andressa.isVivo() ? "Vivo" : "Morto";
     String monstroEstaVivo = demogorgon.isVivo() ? "Vivo" : "Morto";

        System.out.printf("""
                Bem Vindo ao RPG %s
                Jogador: %s
                [status]: %s
                [vida]: %d
                
                Monstro %s
                [status]: %s
                [vida]: %d
                """, jogo.titulo, andressa.nome, heroiEstaVivo, andressa.vida, demogorgon.nome, monstroEstaVivo, demogorgon.vida);
    }
}
