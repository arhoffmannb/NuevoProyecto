import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Humano extends Objeto{
    BufferedImage jugador;
    public int direccionX = 0;

    public Humano(Movimiento m, int y, int x){
        movimiento = m;
        posicionY = y;
        posicionX = x;


    }

    public void Update(){
        posicionX += direccionX;


    }

    public void Draw(Graphics g){


        if((posicionX==30)||(posicionX==670)){
            try{
                jugador = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/JugadorTierra.jpg"));
            } catch(IOException ie){
                System.out.print("No Jugador");
            }
        } else{
            try{
                jugador = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/JugadorCarretera.jpg"));
            } catch(IOException ie){
                System.out.print("No Jugador");
            }
        }


        g.drawImage(jugador,posicionX,370,null);



    }


    public void keyPressed(KeyEvent flecha){
        if(flecha.getKeyCode()==39){
            if(posicionX==670){
                direccionX = 0;
            }else{
                direccionX = 160;
            }


        } else if(flecha.getKeyCode()==37){
            if(posicionX==30){
                direccionX = 0;
            }else{
                direccionY = - 160;
            }
        }

    }


    public void keyReleased(KeyEvent flecha){

    }


    public void keyTyped(KeyEvent flecha){

    }



}