import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.image.*;
import java.io.*;


public class Movimiento extends JPanel implements Runnable {

    public BufferedImage fondo;
    public Zombie zombie1, zombie2, zombie3;
    public Humano humano;



    public Movimiento(){

        zombie1 = new Zombie(this,0,190,23);
        zombie2 = new Zombie(this,0,350,20);
        zombie3 = new Zombie(this,0,510,25);
        humano = new Humano(this,350,370);



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
        humano.Draw(g);
        repaint();



    }

    public int Condicion(){
        int posicion = zombie1.getPosicion();
        int condicion = 0;


        if(posicion == 500){
            condicion = 0;

        } else{
            condicion = 1;
        }

        return condicion;

    }

    public void run(){




        while(true){
            zombie1.Update();
            zombie2.Update();
            zombie3.Update();
            humano.Update();


            try{
                Thread.sleep(90);
            }catch (InterruptedException ie){
                System.out.print("Hola");
            }



        }


    }



}
