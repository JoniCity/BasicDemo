package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StudentController implements KeyListener {

    Student student;

    public StudentController(Student student){
        this.student = student;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed" + e.getKeyChar() );


        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_1) {
            student.startWalking(-5);
        } else if (code == KeyEvent.VK_2) {
            student.startWalking(5);
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_1) {
            student.stopWalking();
        } else if (code == KeyEvent.VK_2) {
            student.stopWalking();
        }
    }
}
