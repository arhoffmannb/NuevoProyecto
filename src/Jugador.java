import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Jugador extends JPanel implements KeyListener{
    int posX = 350;
    BufferedImage jugador;



    public void paint(Graphics g){
        update(g);

    }

    public void update(Graphics g){


        if((posX==30)||(posX==670)){
            try{
                jugador = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/JugadorTierra.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }
        } else{
            try{
                jugador = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/JugadorCarretera.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }
        }



        g.drawImage(jugador,posX,370,null);
        repaint();

    }
    public void draw(){

    }

    @Override
    public void keyPressed(KeyEvent flecha){
        if(flecha.getKeyCode()==39){
            if(posX==670){
                posX = 670;
            }else{
                posX = posX + 160;
            }


        } else if(flecha.getKeyCode()==37){
            if(posX==30){
                posX = 30;
            }else{
                posX = posX - 160;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent flecha){

    }

    @Override
    public void keyTyped(KeyEvent flecha){

    }
}

