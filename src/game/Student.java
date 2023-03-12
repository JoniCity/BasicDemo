package game;

import city.cs.engine.*;

public class Student extends DynamicBody {

    private final static Shape studentShape = new BoxShape(1,2);

    private final static BodyImage image = (new BodyImage("data/student.png", 4));

    public Student(World world){

        super(world,studentShape);
        this.addImage(image);
    }
}
