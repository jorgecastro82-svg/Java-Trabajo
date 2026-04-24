public class Portal implements Transportador {
    @Override
    public boolean transportar_a(Desplazable entity) {
        entity.set_x(entity.get_x() + 10);
        entity.set_y(entity.get_y() + 10);
        return true;
    }
}
