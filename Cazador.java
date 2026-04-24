public class Cazador extends Combatiente{
    Cazador(String n,double x,double y){
        nombre=n;
        cordX=x;
        cordY=y;
    }

    public String agarrar(Holdable h){
        return h.get_name();
        return null;
    }
}