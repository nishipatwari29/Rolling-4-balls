import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    int speedOne=0,speedTwo=0,speedThree=0,speedFour=0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        drawCircleOne();
        drawCircleTwo();
        drawCircleThree();
        drawCircleFour();
    }
    private void drawCircleOne() {
        ellipse(speedOne,(HEIGHT*1)/5, DIAMETER,DIAMETER);
        speedOne++;
    }
    private void drawCircleTwo() {
        ellipse(speedTwo,(HEIGHT*2)/5, DIAMETER,DIAMETER);
        speedTwo+=2;
    }
    private void drawCircleThree() {
        ellipse(speedThree,(HEIGHT*3)/5, DIAMETER,DIAMETER);
        speedThree+=3;
    }
    private void drawCircleFour() {
        ellipse(speedFour,(HEIGHT*4)/5, DIAMETER,DIAMETER);
        speedFour+=4;
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);

    }
}
