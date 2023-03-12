package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {

    Student student;


    public GameWorld(){
    super();
        //make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));
        ground.setName("ground");

        // make a platform
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8, 5.5f));
        platform1.setName("platform1");


        //make a character (with an overlaid image)

        student = new Student(this);
        student.setPosition(new Vec2(4,-5));
        student.setCredits(15);
        student.setName("student");

        GenericCollisionListener gcl = new GenericCollisionListener();
        student.addCollisionListener(gcl);


    }

    public Student getStudent(){
        return student;
    }
}
