package game_poo2;

public class PoderGelo extends Poder {
    
    public PoderGelo(Ataque ataqueComPoder) {
        super(ataqueComPoder);
    }
    
    @Override
    public void atacar(){
        ataqueComPoder.atacar();
        System.out.println(" com poder de gelo.");
    }
    
    @Override
    public int getForca(){
        return ataqueComPoder.getForca() + 1;
    }
}
