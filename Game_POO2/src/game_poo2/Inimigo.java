package game_poo2;

public class Inimigo implements Observador {
    private Ataque ataque;
    private Movimento movimento;
    
    int posicaoX;
    int posicaoY;
    
    public Inimigo(int x, int y) {
        this.posicaoX = x;
        this.posicaoY = y;
    }
    
    public void atacar(){
        ataque.atacar();
    }
    
    public void movimentar(){
        movimento.movimentar();
    }
    
    @Override
    public void update(Sujeito s) {
        Personagem personagem = (Personagem)s;
        
        //Se inimigo estiver perto o suficiente do personagem para atacá-lo
        if ( ( (this.posicaoX - personagem.getX()) == 0) && ( (this.posicaoY - personagem.getY()) == 0) ){
            System.out.println("Inimigo atacou.");
            this.atacar();
        }
        //Se inimigo precisar ir atrás do personagem
        else {
           //Se precisar andar para frente 
           if (personagem.getX() > this.posicaoX) 
               this.posicaoX = this.posicaoX+1;
           else 
               this.posicaoX = this.posicaoX-1;
           //Se precisar andar para trás
           if (personagem.getY() > this.posicaoY) 
               this.posicaoY = this.posicaoY+1;
           else 
               this.posicaoY = this.posicaoY-1;
     
        }    
    }
}
