package lab3;
import static java.lang.System.out;
import java.io.*;

public class SpaceshipDriver {
    public static void main(String[] args) throws FileNotFoundException
    {
        Movement.Movements dir = null;
        Spaceship ship = new Spaceship();

        ship.clickStart();;
        out.print(ship.getStartShipFuel() + "\n");

        ship .setShipPosition(2, 1);


        ship.MoveDown();

        dir = ship.getMovement();
        if (dir == Movement.Movements.UP)
            out.print ("Up" + "\n");
        else if (dir == Movement.Movements.DOWN)
            out.print ("Down" + "\n");
        else if (dir == Movement.Movements.RIGHT)
            out.print ("Right" + "\n");
        else if (dir == Movement.Movements.LEFT)
            out.print ("Left" + "\n");
        else
            out.print ("Stable" + "\n");

        ship.dispose();
    }
}