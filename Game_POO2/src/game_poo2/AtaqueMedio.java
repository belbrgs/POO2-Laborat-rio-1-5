package game_poo2;

public class AtaqueMedio implements Ataque {

    @Override
    public int getForca() {
        return 2;
    }

    public void atacar() {
        System.out.println("Ataque médio");
    }

}
