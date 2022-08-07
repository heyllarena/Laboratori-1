import java.util.Random;
public class Perro{
    private String nombre;
    private String raza;
    private Random rand=new Random();
    private double umbral;
    /*
     * METODO CONSTRUCTOR
     */
    public Perro(String nombre,String raza){
        this.nombre=nombre;
        this.raza=raza;
        this.umbral=rand.nextDouble(-5,5)+1;
    }
    //Metodos
        public void psican(Voluntario p){
        String respuesta="";
        this.umbral=(1.0/p.getGalleta())*(rand.nextFloat()-0.5)*10+this.umbral;
        if(p.getGalleta()){
            respuesta=p.darGalleta(this);
        }
        System.out.println("El umbral del perro es: "+this.umbral);
    }
    public String ladrar(){return "woof";}
    public String Morder(){return this.nombre+" Mordió ";}
    public String moverlaCola(){return this.nombre+" movió la cola";}

    /*
     * GETS
     */
    public String getNombre(){return this.nombre;}
    public String getRaza(){return this.raza;}
    public double getUmbral(){return this.umbral;}
    /*
     * SETS
     */
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setRaza(String raza){this.raza=raza;}
    /*
     * METODOS TOSTRING
     */
    public String ToString(){
        String cadena="";
        cadena+="\nNombre: "+this.nombre;
        cadena+="\nRaza: "+this.raza;
        cadena+="\nUmbral: "+this.umbral;
        return cadena;
    }
}