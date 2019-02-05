package reto3;

public class Guerrero {
    private int puntaje;
    private String nombre_personaje = "Guerrero";

    public Guerrero(int puntaje) {
        this.puntaje = puntaje;
    }

    public Guerrero() {
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}