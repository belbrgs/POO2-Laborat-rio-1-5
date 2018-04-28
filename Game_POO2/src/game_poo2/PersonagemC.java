package game_poo2;


public class PersonagemC extends Personagem {

    public PersonagemC() {
        setEstrategias(new PuloBaixo(), new MovimentoRapido(), new AtaqueForte());
    }
}
