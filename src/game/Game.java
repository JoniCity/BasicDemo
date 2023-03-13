package game;

import city.cs.engine.DebugViewer;

import javax.swing.JFrame;

/**
 * Your main game entry point
 */
public class Game {


    /** Initialise a new Game. */
    public Game() {
        //1. make an empty game world
        GameWorld world = new GameWorld();

        //2. make a view to look into the game world
        GameView view = new GameView(world,800,500, world.getStudent());
        StudentController sc = new StudentController(world.getStudent());
        view.addKeyListener(sc);

        GiveFocus gf = new GiveFocus(view);
        view.addMouseListener(gf);

        //3. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
         JFrame debugView = new DebugViewer(world, 800, 500);

        // start our game world simulation!
        world.start();

    }

    /** Run the game. */
    public static void main(String[] args) {

        new Game();
    }
}
