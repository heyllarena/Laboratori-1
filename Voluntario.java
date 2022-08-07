
import java.util.Random;

public class Voluntario {
    // atributos public
    private String nombre;
    private String edad;
    private boolean galleta;


    public Voluntario(String nombre, String edad, boolean galleta){
        this.nombre=nombre;
        this.edad=edad;
        Random c=new Random();
        this.galleta=galleta;
    }
    /*
     * dar galleta
     */
    public String darGalleta(Perro p){
        String c="";
        if(galleta){
            c=this.nombre+" le dio una gallera a "+p.getNombre();
        }
        return c;
    }

    /*
     * GETS
     */
    public String getNombre(){return this.nombre;}
    public String getEdad(){return this.edad;}
    public boolean getGalleta(){return this.galleta;}
    /*
     * SETS
     */
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setEdad(String edad){this.edad=edad;}
    public void setGalletas(Boolean galleta){this.galleta=galleta;}
    /*
     * METODO TOSTRING
     */
    public String ToString(){
        String cadena="";
        cadena+="\nNombre "+this.nombre;
        cadena+="\nEdad "+this.edad;
        String cadenaGalletas="";
        if(this.galleta==true){cadenaGalletas="Si galletas";}else{cadenaGalletas="No galletas";}
        cadena+="\nGalletas :"+cadenaGalletas;
        return cadena;
    }
    

     public boolean equals(Voluntarios pers){
        return (this.nombre.equals(pers.getNombre()));
     }
}