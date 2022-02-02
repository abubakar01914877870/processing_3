import processing.core.PApplet;
import processing.svg.*;

public class test extends PApplet {
    public void settings(){
        //size(900, 900, SVG, "./test.svg");
    }

    public void draw(){
        background(51);
        ellipse(mouseX, mouseY, 20, 20);
        exit();
    }

    public static void main(String... args){
        PApplet.main("test");
    }
}
