package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.DynamicBody;

public class ShootingImpact implements CollisionListener {

    @Override
    public void collide(CollisionEvent e) {
        // get the two colliding objects
        DynamicBody bullet = null;


        if (e.getOtherBody() instanceof Enemy1 || e.getOtherBody() instanceof Enemy2) {
            e.getOtherBody().destroy();
            e.getReportingBody().destroy();
        } else {
            e.getReportingBody().destroy();
        }

        // if both objects are not null, destroy the bullet and enemy
//        if (bullet != null && enemy1 != null) {
//            bullet.destroy();
//            enemy1.decreaseHealth(-4);
//        }
    }
}
