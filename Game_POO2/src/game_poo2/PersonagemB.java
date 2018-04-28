package game_poo2;


public class PersonagemB extends Personagem {

    public PersonagemB() {
        setEstrategias(new PuloAlto(), new MovimentoRapido(), new AtaqueMedio());
    }
}
