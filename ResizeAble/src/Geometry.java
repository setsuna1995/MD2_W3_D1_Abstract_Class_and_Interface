import java.awt.*;

public class Geometry {
    private String color;
    private boolean filled;

    public Geometry() {
    }

    public Geometry(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}