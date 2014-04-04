import javax.swing.*;
import java.awt.event.KeyListener;

public class Main {

    public Main(){

    }




    public static void main(String[] argumentos){
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,500);

        Movimiento movimiento = new Movimiento();

        jFrame.add(movimiento);
        jFrame.setVisible(true);




        Thread t1Zombies = new Thread(movimiento, "Zombies 1");
        t1Zombies.start();









    }
    }


