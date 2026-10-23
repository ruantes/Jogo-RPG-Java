package rpg.dominio;

public class Heroi {
    public String nome;
    public int vida;
    public int vidaMaxima;
    public int ataque;
    public int defesa;
    public int nivel;
    public int experiencia;
    public int ouro;
    public Inventario inventario;
    public Arma bonusAtaque;

    public boolean isVivo(){
        return vida > 0;
    }

    public int calcularAtaqueTotal(){
        if(inventario == null || inventario.armaEquipada == null){
            return ataque;
        }
        return ataque + inventario.armaEquipada.bonusAtaque;
    }
}
