
package lab4;
import java.io.*;

public class SpaceshipDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Conqueror ship = new Conqueror(10, 10, false, 50);
        ship.printInfo();
        ship.aim();
        ship.shoot();
        ship.shoot();
        ship.aim();
        ship.shoot();
        ship.reload();
        ship.aim();
        ship.shoot();
        ship.printInfo();
        ship.Move(3);
        ship.doubleShoot();
        ship.fewShots(3);
        ship.deleteInfo();
        ship.printInfo();
        ship.dispose();
    }
}