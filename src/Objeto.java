import java.awt.*;

public class Objeto {
    public Movimiento movimiento;
    public int posicionX = 0, posicionY = 0, direccionX = 0;
    public float direccionY;

    public Objeto(){}

    public Objeto(Movimiento m, int y, int x, float s){
        movimiento = m;
        posicionY = y;
        posicionX = x;
        direccionY = s;

    }

    public void Update(){

    }

    public void Draw(Graphics g){

    }

}
