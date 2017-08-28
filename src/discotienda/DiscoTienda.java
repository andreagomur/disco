package discoTienda;

import disco6tienta.Disco;


public class DiscoTienda {

    private String nombre;
    private int nit;
    private Disco [] discos;
    private int cantidadDisco;
    
    public DiscoTienda (String nombre, int nit){
        this.nombre = nombre;
        this.nit = nit;
        this.discos = new Disco [20];
        this.cantidadDisco = 0;
    }
    
    public boolean agregarDisco (String nombre, String artista){
        Disco disco = new Disco (nombre,artista);
        if (this.cantidadDisco < 20){
            this.disco [this.cantidadDisco] = disco;
            this.cantidadDisco++;
            return true;
        }else {
            return false;
        }
    }
    
    public Cancion darInformacionCancion (String nombreDisco, String nombre){
            Cancion cancion = null;
            for ( int i = 0 ; i < this.cantidadDisco; i++){
                if (this.discos[i].getNombre().equials(nombreDisco)){
                    cancion = this.discos [i].darInformacionCancion (nombreCancion);
                    break;
                }
            }
            return cancion;
                    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}