import javax.swing.*;

public class Main {

    public static void main(String[] argumentos){
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,500);

        Movimiento movimiento = new Movimiento();
        jFrame.add(movimiento);
        jFrame.setVisible(true);
        Thread tZombies = new Thread(movimiento, "Zombies");

        tZombies.start();
    }

}
