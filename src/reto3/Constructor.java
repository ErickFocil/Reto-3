package reto3;

public class Constructor {
    private int puntaje;
    private String nombre_personaje = "Constructor";

    public Constructor(int puntaje) {
        this.puntaje = puntaje;
    }

    public Constructor() {
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