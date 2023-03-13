package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class GenericCollisionListener implements CollisionListener {
    private Student student;
    public GenericCollisionListener(Student student) {
        this.student = student;
    }
    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof Enemy1 || collisionEvent.getOtherBody() instanceof Enemy2) {
            student.setHealth(student.getHealth()-1);
        }


    }
}
