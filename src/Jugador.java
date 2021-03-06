import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Jugador extends JPanel implements KeyListener{
    int posicionX = 350;
    BufferedImage jugador, fondo;
    Graphics g;



    public void paint(Graphics g){
        update(g);

    }

    public void update(Graphics g){

        g.drawImage(fondo,0,0,null);


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
        repaint();

    }

    @Override
    public void keyPressed(KeyEvent flecha){
        if(flecha.getKeyCode()==39){
            if(posicionX==670){
                posicionX = 670;
            }else{
                posicionX = posicionX + 160;
            }


        } else if(flecha.getKeyCode()==37){
            if(posicionX==30){
                posicionX = 30;
            }else{
                posicionX = posicionX - 160;
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

