package game_poo2;

public class PoderEletrico extends Poder {
    
    public PoderEletrico(Ataque ataqueComPoder) {
        super(ataqueComPoder);
    }
    
    @Override
    public void atacar(){
        ataqueComPoder.atacar();
        System.out.println(" com poder elétrico.");
    }
    
    @Override
    public int getForca(){
        return ataqueComPoder.getForca() + 2;
    }
}
