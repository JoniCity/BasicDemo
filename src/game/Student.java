package game;

import city.cs.engine.*;

public class Student extends Walker {

    private final static Shape studentShape = new BoxShape(1,2);

    private final static BodyImage image = (new BodyImage("data/student.png", 4));

    int credits;
    public Student(World world){

        super(world,studentShape);
        this.addImage(image);
        credits=0;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void stopWalking(int i) {
    }
}
