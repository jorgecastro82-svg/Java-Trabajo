public class Cofre implements DropLoot,Danable extends EntidadEstatica{
    Cofre(int v,int vm,String n,double x,double y){
        hp=v;
        maxHp=vm;
        nombre=n;
        cordX=x;
        cordY=y;
    }
    public dispInfo(){
        disp_hp();

    }
    public disp_hp(){
        System.out.prinln("hp"+vida);
    }
    public get_damage(int damage_points){
        vida-=damage_points;
        return true
    }
    public is_vivo(){
        return vida>0;
    }
}