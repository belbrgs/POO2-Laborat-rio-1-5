package game_poo2;

public class AtaqueForte implements Ataque {

    @Override
    public int getForca() {
        return 3;
    }

   public void atacar(){
       System.out.println("Ataque forte");
   } 
}

