public class Cofre implements DropLoot,Danable extends EntidadEstatica{
    Cofre(int v,int vm,String n){
        vida=v;
        vidamax=vm;
        nombre=n;
    }
    public dispInfo(){
        disp_hp();

    }
    public disp_hp(){
        System.out.prinln("hp"+vida);
    }
    public get_damage(int damage_points){
        if()
        vida-=damage_points;
        return true;
    }
    public is_vivo(){
        return vida>0;
    }
}