import java.awt.*;

public class Objeto {
    public Movimiento movimiento;
    public int posX = 0, posY = 0;
    public float dirY;

    public Objeto(){}

    public Objeto(Movimiento m, int y, int x, float s){
        movimiento = m;
        posY = y;
        posX = x;
        dirY = s;

    }

    public void Update(){

    }

    public void Draw(Graphics g){

    }

}
