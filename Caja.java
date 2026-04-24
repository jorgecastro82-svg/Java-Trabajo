public class Caja extends EntidadEstatica implements Desplazable
{
    double x1;
    double y1;
    double x2;
    double y2;
    Caja(double x1, double y1)
    {
       super(x1,y1)
       this.x1=x1;
       this.y1=y1;

    }
  public double getDesplazablex()
   {
     return x2;
   }
  public double getDesplazabley()
   {
     return y2;
   }
}