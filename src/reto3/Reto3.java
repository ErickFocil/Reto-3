package reto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto3 {
    
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int puntaje;
        int [] valores = new int[3];
        int temp;
        int mayor;
        
        Constructor personaje1 = new Constructor();
        Mago personaje2 = new Mago();
        Guerrero personaje3 = new Guerrero();
        System.out.println("Indique puntaje para Constructor");
        puntaje = Integer.parseInt(entrada.readLine());
        personaje1.setPuntaje(puntaje);
        System.out.println("Indique puntaje para Mago");
        puntaje = Integer.parseInt(entrada.readLine());
        personaje2.setPuntaje(puntaje);
        System.out.println("Indique puntaje para Guerrero");
        puntaje = Integer.parseInt(entrada.readLine());
        personaje3.setPuntaje(puntaje);
        
        valores[0] = personaje1.getPuntaje();
        valores[1] = personaje2.getPuntaje();
        valores[2] = personaje3.getPuntaje();
        
        for(int i=0; i < valores.length;i++){
            for(int j = 0; j < valores.length - 1; j++){
                if(valores[j] > valores[j+1]){
                    temp = valores[j+1];
                    valores[j+1] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        
        for(int i=0; i<valores.length;i++){
            System.out.println(valores[i]);
        }
        
        mayor = valores[2];
        System.out.println("Su puntaje mayor es: " + mayor);
    }
    
}