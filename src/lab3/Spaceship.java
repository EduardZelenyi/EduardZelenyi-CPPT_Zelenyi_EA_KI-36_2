package lab3;
import java.io.*;


public class Spaceship {
    private static int spaceshipCount;

    private Movement movementDevice;
    private RelativePosition pos;
    private Start  start;
    private PrintWriter fout;
    private int fuel;

    public Spaceship() throws FileNotFoundException
    {
        start = new Start();
        movementDevice = new Movement();
        pos = new RelativePosition();
        fout = new PrintWriter(new File("Lab3.txt"));
    }

    public Spaceship(int res) throws FileNotFoundException
    {
        spaceshipCount++;
        this.fuel = res;
    }
    public static int getSpaceshipCountCount() {
        return spaceshipCount;
    }




    public void clickStart()
    {
        start.startButton();

        fout.print("Engine is on.\n");
        fout.print("Space ship tank is: " +
                start.getShipFuel() + " fuel \n");
        fout.flush();
    }

    public int getStartShipFuel()
    {
        return start.getShipFuel();
    }



    public void MoveUp()
    {
        movementDevice.setUpMovement();

        fout.print("Spaceship -> moved up\n");
        fout.flush();
    }

    public void MoveDown()
    {
        movementDevice.setDownMovement();

        fout.print("Spaceship -> moved down\n");
        fout.flush();
    }
    public void MoveRight()
    {
        movementDevice.setUpMovement();

        fout.print("Spaceship -> moved right\n");
        fout.flush();
    }

    public void checkifEmpty (Spaceship ship) {
        if (ship==null) {
            System.out.println("empty");
        }
        else {System.out.println(ship);}
    }

    public void MoveLeft()
    {
        movementDevice.setDownMovement();

        fout.print("Spaceship -> moved left\n");
        fout.flush();
    }
    public void resetMovement()
    {
        movementDevice.resetMovement();

        fout.print("Spaceship is stable \n");
        fout.flush();
    }

    public Movement.Movements getMovement()
    {
        return movementDevice.getMovement();
    }

    public void dispose()
    {
        fout.close();
    }


    public void setShipPosition(int xPos, int yPos)
    {
        pos.setXPosition(xPos);
        pos.setYPosition(yPos);
    }

    public int getShipXPosition()
    {
        return pos.getXPosition();
    }

    public int getShipYPosition()
    {
        return pos.getYPosition();
    }
}

class Fire{
    private int ammo;
    public Fire()
    {
        ammo= 1000;
    }
    public void startButton()
    {
        ammo = ammo - 30;
    }

    public int getShipAmmo()
    {
        return ammo;
    }

    public Fire(int fill)
    {
        ammo = fill;
    }


}





class Movement{

    enum Movements {STABLE, RIGHT, LEFT,DOWN,UP};


    private Movements movement;


    public Movement()
    {
        movement = Movements.STABLE;
    }

    public void setStableMovement()
    {
        movement = Movements.STABLE;
    }
    public void setUpMovement()
    {
        movement = Movements.UP;
    }

    public void setDownMovement()
    {
        movement = Movements.DOWN;
    }
    public void setRightMovement()
    {
        movement = Movements.RIGHT;
    }
    public void setLeftMovement()
    {
        movement = Movements.LEFT;
    }

    public void resetMovement()
    {
        setStableMovement();
    }

    public Movements getMovement()
    {
        return movement;
    }
}

class Start{
    private int fuel;

    public Start()
    {
        fuel= 500;
    }


    public Start(int fill)
    {
        fuel = fill;
    }

    public void startButton()
    {
        fuel = fuel - 50;
    }
    public int getShipFuel()
    {
        return fuel;
    }
}
class RelativePosition{

    private int x, y;

    public RelativePosition()
    {
        x = 0;
        y = 0;
    }

    public RelativePosition(int xPos, int yPos)
    {
        x = xPos;
        y = yPos;
    }

    public int getXPosition()
    {
        return x;
    }

    public int getYPosition()
    {
        return y;
    }

    public void getPosition(RelativePosition obj)
    {
        obj.x = x;
        obj.y = y;
    }

    public void setXPosition(int xPos)
    {
        x = xPos;
    }

    public void setYPosition(int yPos)
    {
        y = yPos;
    }

}