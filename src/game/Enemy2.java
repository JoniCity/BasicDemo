package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Enemy2 extends Walker implements StepListener{
//    private int health;
    private float left, right;
    private final int range = 4;
    private final int walkingSpeed = 4;

    public Enemy2(GameWorld world) {
        super(world,new PolygonShape(0.25f,0.81f, -0.86f,-0.78f, -0.74f,-1.94f, 0.59f,-1.94f, 1.12f,0.46f));
        setPosition(new Vec2(8,-10));
        BodyImage image = new BodyImage("data/enemy2.png", 4.0f);
        addImage(image);
        startWalking(walkingSpeed);

    }

    @Override
    public void setPosition(Vec2 position) {
        System.out.println(position);
        super.setPosition(position);
        left = position.x-range;
        right = position.x+range;

    }
    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x > right) {
            startWalking(-walkingSpeed);
        } if (getPosition().x < left) {

            startWalking(walkingSpeed);
        }
    }
    @Override
    public void postStep(StepEvent stepEvent){

    }

}
