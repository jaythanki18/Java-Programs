public class Circle{
    double radius;
    public Circle()
    {
         radius=1;
    }
    public Circle(double radius){
        this.radius=radius;
        System.out.println("Radius is : "+radius);
    }
    public double getArea(double r){
        double area=(3.14)*r*r;
        return area;
    }
    public double getPerimeter(double r){
        double perimeter = 2*(3.14)*r*r;
        return perimeter;
    }

}
