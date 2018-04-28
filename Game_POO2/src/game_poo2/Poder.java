package game_poo2;

public abstract class Poder implements Ataque {
    
    final Ataque ataqueComPoder;
        
    public Poder(Ataque ataque) {
        ataqueComPoder = ataque;
    }
    
    public void atacar(){
       ataqueComPoder.atacar(); 
    }
    
    @Override
    public int getForca(){
        return ataqueComPoder.getForca();
    }
}
