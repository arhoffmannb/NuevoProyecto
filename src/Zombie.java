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
        return random.nextInt(2);
    }

    public void Draw(Graphics g){


        if(b == 1){
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Proyecto/Images/Zombie 1/zombie1.gif"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }


        } else {
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Proyecto/Images/Zombie 3/zombie3.gif"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }
        }

        g.drawImage(zombie,posX,posY,null);




    }
}
