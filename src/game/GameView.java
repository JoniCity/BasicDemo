package game;

import city.cs.engine.UserView;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {

    private Student student;

    private final Image background = new ImageIcon("data/university.jpg").getImage();

    public GameView(GameWorld world, int width, int height, Student student){

        super(world,width,height);
        this.student = student;
        System.out.println(student.getHealth());
    }

    @Override
    protected void paintBackground(Graphics2D g){
        g.drawImage(background,0,0,this);
    }
    @Override
    protected void paintForeground(Graphics2D g) {
        int studentHealth = student.getHealth();
        g.drawImage(new ImageIcon("data/health" + studentHealth + ".png").getImage(), 5,5,this);
    }

}
