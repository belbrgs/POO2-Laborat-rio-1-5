package game_poo2;

public class AtaqueFraco implements Ataque {

    @Override
    public int getForca() {
        return 1;
    }

    public void atacar() {
        System.out.println("Ataque fraco");
    }

}
