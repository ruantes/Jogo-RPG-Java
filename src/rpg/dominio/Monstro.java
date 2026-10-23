package rpg.dominio;

public class Monstro {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int ouroRecompensa = 10;
    public int experienciaRecompensa = 100;

    public boolean isVivo(){
        return vida > 0;
    }
}
