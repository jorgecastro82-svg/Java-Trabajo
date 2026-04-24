public class Canica extends EntidadEstatica implements Desplazable {
    
    @Override
    public boolean get_pushed(double x, double y) {
        cordX += x;
        cordY += y;
        return false;
    }

    Canica(double x, double y, String name){
        EntidadEstatica();
    }

}
