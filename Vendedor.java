public class Vendedor extends EntidadMovible implements Parlante{
    Vendedor(String n,double x,double y){
        nombre=n;
        cordX=x;
        cordY=y;
    }
    public String speak(){
        return "¿Qué te gustaría comprar, aventurero?";
    }
    public boolean move(double x,double y){
        cordX=x;
        cordY=y;
        return true
    }
}