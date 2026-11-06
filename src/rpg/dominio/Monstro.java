package rpg.dominio;

public class Monstro {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int ouroRecompensa = 10;
    public int experienciaRecompensa = 100;
    public int danoMonstroAtaque;

    public boolean isVivo(){
        return vida > 0;
    }

    public int calcularDanoMonstro(int defesaInimigoHeroi){
        danoMonstroAtaque = ataque - defesaInimigoHeroi;
        if(danoMonstroAtaque < 1){
            return danoMonstroAtaque = 1;
        }
        return danoMonstroAtaque;
    }
}
