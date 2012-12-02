package ru.alekseev.lab5;

public class Triangle extends Point {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public Triangle(double x, double y, double x1, double y1,double x2,double y2){
        super(x,y);
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.setName("Треугольник");
        this.countSupportPoint=2;
        
    }
     public void doTranslation(NewPoint np){
        
        x1+=np.getX()-this.getX();
        y1+=np.getY()-this.getY();
        x2+=np.getX()-this.getX();
        y2+=np.getY()-this.getY();
        this.setX(np.getX());
        this.setY(np.getY());
        
    }
     public void doSymmetry(){
        this.setX(-this.getX());
        this.setY(-this.getY());
        x1*=-1;
        y1*=-1;
        x2*=-1;
        y2*=-1;
    }
    public String toString(){
        return "id="+getId()+"  "+getName()+"("+this.getX()+";"+this.getY()+")"+" ("+x1+";"+y1+")"+" ("+x2+";"+y2+")";
    }
}
