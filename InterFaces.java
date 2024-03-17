interface Drawable{
    void draw();
}

interface Colourable{
    void color();
    static void redColor(){
        System.out.println("Default red() method in Colourable class.");
    }
}

interface Sketch extends Drawable{
    void blackAndWhite();
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectange...!");
    }
}

class Cirle implements Sketch, Colourable{
    public void draw(){
        System.out.println("Drawing Cirle...!");
    }
    public void blackAndWhite(){
        System.out.println("Black And White...!");
    }
    public void color(){
        System.out.println("Color: White");
    }
}

public class InterFaces {
    public static void main(String args[]){
        Cirle d = new Cirle();
        d.draw();
        d.blackAndWhite();
        d.color();
        Colourable.redColor();
        Drawable d2 = new Rectangle();
        d2.draw();
    }
}
