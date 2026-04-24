public class Cofre implements DropLoot,Danable extends EntidadEstatica{
    Cofre(int v,int vm,String n,double x,double y){
        hp=v;
        maxHp=vm;
        nombre=n;
        cordX=x;
        cordY=y;
    }
    public dispInfo(){
        System.out.println(nombre);
        disp_hp();


    }
    public disp_hp(){
        System.out.prinln("hp "+hp+"/"+maxHp);
    }
    public get_damage(int damage_points){
        vida-=damage_points;
        return true
    }
    public is_vivo(){
        return vida>0;
    }
    public String[] drop(){
        String[] s=new String[2];
        s[0]="Lingote de oro"
        s[1]="Espada magica"
    }
}