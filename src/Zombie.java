import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Zombie extends Objeto{

    BufferedImage zombie;
    float b = this.aleatorioSimplificado();



    public Zombie(Movimiento m, int y, int x, float s){
        movimiento = m;
        posY = y;
        posX = x;
        dirY = s;
    }

    public void Update(){
        posY += dirY;
    }


    public int aleatorioSimplificado() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public void Draw(Graphics g){


        if(b == 0){
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombie1.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }


        } else if(b == 1) {
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombie2.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }
        } else if(b == 2) {
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombie3.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }

        }

        g.drawImage(zombie,posX,posY,null);




    }
}
