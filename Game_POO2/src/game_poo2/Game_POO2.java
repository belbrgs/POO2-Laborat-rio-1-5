package game_poo2;

public class Game_POO2 {

    public static void main(String[] args) throws InterruptedException {
        PersonagemA bob = new PersonagemA();
        bob.setEstrategias(new PuloMedio(), new MovimentoMedio(), new PoderFogo(new AtaqueForte()));
        bob.atacar();
    }
    
}
