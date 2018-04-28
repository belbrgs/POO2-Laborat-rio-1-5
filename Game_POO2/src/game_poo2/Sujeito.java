package game_poo2;

public interface Sujeito {
    public void addObservador(Observador o);
    public void removerObservador(Observador o);
    public void notificaObservador();
}
