package Assignment4Option1;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere - Radius: " + radius +
                "\nSurface Area: " + surfaceArea() +
                "\nVolume: " + volume();
    }
}
