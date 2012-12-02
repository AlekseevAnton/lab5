package ru.alekseev.lab5;

public class Rectangle extends Point {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    public Rectangle(double x, double y, double x1, double y1,double x2,double y2,double x3, double y3){
        super(x,y);
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
        this.setName("Прямоугольник");
        this.countSupportPoint=3;
    }
     public void doSymmetry(){
        this.setX(-this.getX());
        this.setY(-this.getY());
        x1*=-1;
        y1*=-1;
        x2*=-1;
        y2*=-1;
        x3*=-1;
        y3*=-1;
    }
      public void doTranslation(NewPoint np){
        
        x1+=np.getX()-this.getX();
        y1+=np.getY()-this.getY();
        x2+=np.getX()-this.getX();
        y2+=np.getY()-this.getY();
        x3+=np.getX()-this.getX();
        y3+=np.getY()-this.getY();
        this.setX(np.getX());
        this.setY(np.getY());
        
    }
    public String toString(){
        return "id="+getId()+"  "+getName()+"("+this.getX()+";"+this.getY()+")"+" ("+x1+";"+y1+")"+" ("+x2+";"+y2+")"+" ("+x3+";"+y3+")";
    }
}
