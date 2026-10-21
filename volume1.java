
class Shape {
    public double getVolume() {
        return 0;
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return 3.14 * radius * radius * height;
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
}

class Cuboid extends Shape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}

class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return (1.0 / 3.0) * 3.14 * radius * radius * height;
    }
}

class volume1 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Cube(4);
        shape[1] = new Cylinder(2, 5);
        shape[2] = new Sphere(4);
        shape[3] = new Cuboid(2, 3, 4);
        shape[4] = new Cone(3, 5);

        System.out.println("Volume of Cube: " + shape[0].getVolume());
        System.out.println("Volume of Cylinder: " + shape[1].getVolume());
        System.out.println("Volume of Sphere: " + shape[2].getVolume());
        System.out.println("Volume of Cuboid: " + shape[3].getVolume());
        System.out.println("Volume of Cone: " + shape[4].getVolume());
    }
}

