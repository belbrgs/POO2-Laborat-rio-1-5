package game_poo2;

public class PersonagemA extends Personagem {
    
    public PersonagemA() {
        setEstrategias(new PuloMedio(), new MovimentoMedio(), new AtaqueForte());
    }
}