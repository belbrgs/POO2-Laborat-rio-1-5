package game_poo2;

public class PoderFogo extends Poder {
    
    public PoderFogo(Ataque ataqueComPoder) {
        super(ataqueComPoder);
    }
    
    @Override
    public void atacar(){
        ataqueComPoder.atacar();
        System.out.println(" com poder de fogo.");
    }
    
    @Override
    public int getForca(){
        return ataqueComPoder.getForca() + 3;
    }
}
