public class Circle extends Geometry{
    double radius = 1.0;

public Circle(){
    }
public Circle(double radius) {
    this.radius = radius;
}
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
    this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return Math.pow(getRadius(),2)*Math.PI;
}
    public double getPerimeter () {
        return 2*getRadius()*Math.PI;
    }

}
