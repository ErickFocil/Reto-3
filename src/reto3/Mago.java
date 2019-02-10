package reto3;

public class Mago {
    private int puntaje;
    private String nombre_personaje = "Mago";

    public Mago(int puntaje) {
        this.puntaje = puntaje;
    }

    public Mago() {
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre_personaje() {
        return nombre_personaje;
    }
    
    
}