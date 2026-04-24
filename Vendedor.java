public class Vendedor extends EntidadMovible implements Parlante{
    Vendedor(){
        nombre=n;
        cordX=x;
        cordY=y;
    }
    public String speak(){
        return "¿Qué te gustaría comprar, aventurero?"
    }
    public void move(double x,double y){
        cordX=x;
        cordY=y;
    }
}