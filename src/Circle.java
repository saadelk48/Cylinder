
public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this(1.0,"red");
    }
    public Circle(double r) {
        this(r,"red");
    }
    public Circle(double r,String color)
    {
        radius=r;
        this.color=color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color ;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public void setColor(String Color){
        this.color=Color;
    }
    @Override
    public String toString(){
        return "the radius is "+radius+"and color " + color;
    }
}
