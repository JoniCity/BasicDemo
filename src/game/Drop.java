package game;

import city.cs.engine.CircleShape;
import city.cs.engine.DynamicBody;
import org.jbox2d.common.Vec2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Drop implements MouseListener {



    GameWorld world;
    public Drop(GameWorld w){
        world = w;
    }

    GameView view;



    public Drop(GameWorld w, GameView v){
        world = w;
        view = v;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked" + " " + e.getY());

        DynamicBody ball = new DynamicBody(world, new CircleShape(1f));
        ball.setPosition(view.viewToWorld(e.getPoint()));

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
