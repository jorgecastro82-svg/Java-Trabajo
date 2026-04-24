public class Cofre implements DropLoot,Danable extends EntidadEstatica{
    Cofre(int v,int vm,String n){
        vida=v;
        vidamax=vm;
        nombre=n;
    }
    dispInfo(){

    }
    disp_hp(){
        System.out.prinln("hp"+vida)
    }
}