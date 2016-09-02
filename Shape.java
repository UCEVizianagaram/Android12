abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color = "";
        this.filled = false;
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
   abstract public double getArea();
   abstract public double getPerimeter();
    @Override
   abstract public String toString();
}
class Circle extends Shape{
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        double area = (22/7)*this.radius*this.radius;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * (22/7) * this.radius;
        return perimeter;
    }
    @Override
    public String toString(){
        String string = "Shape = Circle" +  "\n" + "Radius = " + String.valueOf(this.radius) +   "\n" + "Color = " + super.color +  "\n" + "Is filled = " + String.valueOf(super.filled) + "\n";  
        return string;
    }
}
class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        double area = this.length * this.width;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2*(this.length + this.width);
        return perimeter;
    }
    @Override
    public String toString(){
        String string = "Shape = Rectange \n" + "Length = " + String.valueOf(this.length) +  "\n" + "Width = " + String.valueOf(this.width) +  "\n" + "Color = " + super.color +   "\n" + "Is filled = " + String.valueOf(super.filled) + "\n";
        return string;
    }
}
class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.length = side;
        super.width = side;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        String string = "Shape = Square \n" +  "Side = " + String.valueOf(this.width) + "\n" + "Color = " + super.color  + "\n" +  "Is filled = " + String.valueOf(super.filled) + "\n";
        return string;
    }
}