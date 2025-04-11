class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement calculateArea
    @Override
    double calculateArea() {
        return width * height;
    }
}
