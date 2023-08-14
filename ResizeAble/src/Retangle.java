import ResizeAble.Resize;

public class Retangle extends Geometry implements Resize {
    private double width = 1.0;
    private double length = 1.0;
public Retangle() {}
    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
public double getArea () {
    return getWidth()*getLength()*2;
}
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public double percent() {
        return getArea()*Math.random()*10.0;
    }

}
