import javax.swing.*;
import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] argumentos){
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,500);

        Movimiento movimiento = new Movimiento();
        Jugador jugador = new Jugador();
        jFrame.add(movimiento);
        jFrame.setVisible(true);
        jFrame.add(jugador);
        jFrame.addKeyListener(jugador);
        Thread tZombies = new Thread(movimiento, "Zombies");

        tZombies.start();
    }

}
