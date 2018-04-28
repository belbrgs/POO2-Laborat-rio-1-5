package game_poo2;
import java.util.ArrayList;

public abstract class Personagem implements Sujeito {
    private Ataque ataque;
    private Movimento movimento;
    private Pulo pulo;
    
    int posicaoX;
    int posicaoY;
    
    public int getX(){
        return posicaoX;
    }
    
    public int getY(){
        return posicaoY;
    }
    
    private int life;
    
    private final ArrayList<Observador> listaObservadores = new ArrayList<>();
    
    public void setEstrategias(Pulo p, Movimento m, Ataque a){
        this.pulo = p;
        this.movimento = m;
        this.ataque = a;
    }
    
    public void atacar(){
        ataque.atacar();
    }
    
    public void movimentar(){
        movimento.movimentar();
    }
    
    public void pular(){
        pulo.pular();
    }
        
    @Override
    public void notificaObservador() {
        listaObservadores.forEach((observador) -> {
            observador.update(this);
        });
    }

    @Override
    public void addObservador(Observador o) {
       listaObservadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        listaObservadores.remove(o);
    }
}
