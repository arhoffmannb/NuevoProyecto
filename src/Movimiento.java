import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import java.util.Random;


public class Movimiento extends JPanel implements Runnable{

    public BufferedImage fondo;
    public Zombie zombie1, zombie2, zombie3;
    float  velocidad1 = this.Velocidad1();
    float velocidad2 = this.Velocidad2();
    float velocidad3 = this.Velocidad3();



    public Movimiento(){

        zombie1 = new Zombie(this,0,190,velocidad1);
        zombie2 = new Zombie(this,0,350,velocidad2);
        zombie3 = new Zombie(this,0,510,velocidad3);

    }

    float Velocidad1(){

        float velocidad = 0;

        Random random = new Random();
        velocidad = random.nextInt(3);


        if(velocidad==0){

            velocidad = 15;

        }else if(velocidad == 2){
            velocidad = 20;

        } else {
            velocidad = 25;

        }

        return velocidad;
    }

    float Velocidad2(){

        float velocidad = 0;

        Random random = new Random();
        velocidad = random.nextInt(3);


        if(velocidad==0){

            velocidad = 15;

        }else if(velocidad == 2){
            velocidad = 20;

        } else {
            velocidad = 25;

        }

        return velocidad;
    }

    float Velocidad3(){

        float velocidad = 0;

        Random random = new Random();
        velocidad = random.nextInt(3);


        if(velocidad==0){

            velocidad = 15;

        }else if(velocidad == 2){
            velocidad = 20;

        } else {
            velocidad = 25;

        }

        return velocidad;
    }



    public void paint(Graphics g){
        update(g);
    }

    public void update(Graphics g){

        try{
            fondo = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/Fondo.jpg"));
        } catch(IOException ie){
            System.out.print("No fondo");
        }

        g.drawImage(fondo,0,0,null);
        zombie1.Draw(g);
        zombie2.Draw(g);
        zombie3.Draw(g);
        repaint();
    }

    public void run(){

        while(true){
            zombie1.Update();
            zombie2.Update();
            zombie3.Update();



            try{
                Thread.sleep(80);
            }catch (InterruptedException ie){
                System.out.print("Hola");
            }

        }
    }
}
