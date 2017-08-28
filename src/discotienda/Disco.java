/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

/**
 *
 * @author Estudiante
 */
public class Disco {
    private String nombre;
    private String artista;
    private Cancion [] canciones;
    private Cancion[] cancion;
    private int numeroCanciones;
        
    public Disco (String nombre, String artista){
        this.nombre = nombre;
        this.artista = artista;
        this.cancion = new Cancion [15];
        this.numeroCanciones = 0;
    }
public boolean agregarCancion(String nombre, double precio, float duracion, float tamanio, float calidad){
    Cancion cancion = new cancion(nombre, precio, duracion, tamanio, calidad);
            if (this.numeroCanciones < 15){
                this.canciones [this.numeroCanciones] = cancion;
                this.numeroCanciones++;
                return true;
            }else{
                return false;
            }
            }

    public Cancion darInformacionCancion (String nombreCancion){
        Cancion cancion = null; 
         for ( int i = 0 ; i < this.numeroCanciones; i++){
                if (this.canciones[i].getNombre().equials(nombreDisco)){
                    cancion = this.canciones [i];
                    break;
                }
    }

    
}
