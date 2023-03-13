package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class GameWorld extends World {

    Student student;
    Enemy1 enemy1;
    Enemy2 enemy2;


    public GameWorld(){

        student = new Student(this);

//        student.setCredits(15);
        student.setName("student");
        enemy1 = new Enemy1(this);
        enemy2 = new Enemy2(this);
        GenericCollisionListener gcl = new GenericCollisionListener(this.getStudent());
        student.addCollisionListener(gcl);

        //make the ground
        Shape shape = new BoxShape(20, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));
        ground.setName("ground");

        // make a platform
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8, 5.5f));
        platform1.setName("platform1");

        // add vertical platforms on the left and right sides
        Shape verticalPlatformShape = new BoxShape(0.5f, 20f);

        // left platform
        StaticBody leftPlatform = new StaticBody(this, verticalPlatformShape);
        leftPlatform.setPosition(new Vec2(-20f, 2.5f));
        leftPlatform.setName("leftPlatform");
        leftPlatform.setFillColor(new Color(0, 0, 0, 0)); // set fill color to transparent
        leftPlatform.setLineColor(new Color(0, 0, 0, 0)); // set line color to transparent


        // right platform
        StaticBody rightPlatform = new StaticBody(this, verticalPlatformShape);
        rightPlatform.setName("rightPlatform");
        StaticBody rightPlatform1 = new StaticBody(this, platformShape);
        rightPlatform.setPosition(new Vec2(20, -5));
        rightPlatform.setFillColor(new Color(0, 0, 0, 0)); // set fill color to transparent
        rightPlatform.setLineColor(new Color(0, 0, 0, 0)); // set line color to transparent

    }

    public Student getStudent(){
        return student;
    }
}
