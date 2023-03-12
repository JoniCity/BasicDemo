package game;

import city.cs.engine.UserView;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {

    private final Image background = new ImageIcon("data/university.jpg").getImage();

    public GameView(GameWorld world){

        super(world,500,500);
    }

    @Override
    protected void paintBackground(Graphics2D g){
        g.drawImage(background,0,0,this);
    }

}
