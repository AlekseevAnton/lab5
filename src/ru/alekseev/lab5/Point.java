package ru.alekseev.lab5;

public class Point implements Symmetry,Translation{
    private double x;
    private double y;
    private String name;
    private int id;
    protected int countSupportPoint=0;
     static int nextId=1;
    { id = nextId++; }
    private boolean sortUp=false;
    private int sortMode=0;
    public Point(double x, double y){
       this.x=x;
       this.y=y;
       this.name="Точка";
    }
    public void doSymmetry(){
        x*=-1;
        y*=-1;
    }
    @Override
    public void doTranslation(NewPoint np){
      x=np.getX();
      y=np.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
     public String getName(){
          return name;
      }
    
      public void setName(String name){
          this.name=name;
      }
      public void setSortMode(int m){
          sortMode=m;
      }
      public void setSortUp(boolean b){
          sortUp=b;
      }
      public int getId(){
          return id;
      }
    
    public String toString(){
        return "id="+getId()+"  "+getName()+" Координаты:"+"("+x+";"+y+")";
    }
    
}
