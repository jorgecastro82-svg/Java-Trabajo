public class Portal implements Transportador {
    private int amount_of_displacement;
    @Override
    public boolean transportar_a(Desplazable entity) {
        entity.set_x(entity.get_x() + amount_of_displacement);
        entity.set_y(entity.get_y() + amount_of_displacement);
        return true;
    }

    Portal(int amount_of_displacement){
        this.amount_of_displacement = amount_of_displacement;
    }


}
