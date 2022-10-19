package lab4;

import java.io.FileNotFoundException;

public class Conqueror extends Spaceship{
    @Override
    public void Move(int km) {
        System.out.println("Conqueror is moving by:" + km);
    }

    public Conqueror(int fuel, int ammo, boolean isAim, int maxAmmo) throws FileNotFoundException {
        super (fuel, ammo, maxAmmo,isAim);
        this.fuel = fuel;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.isAim = isAim;
    }

    void doubleShoot() {
        ammo -= 2;

        System.out.println("You've done 2 hits");
        fout.print("You've done 2 hits\n");
    }

    public void printInfo() {
        System.out.println("\n");
        System.out.println("Ammo " + ammo);
        System.out.println("MaxAmmo " + maxAmmo);

        fout.print("\n");
        fout.print("Ammo" + ammo + "\n");
        fout.print("MaxAmmo" + maxAmmo + "\n");
    }

    public void deleteInfo() {
        this.ammo = 0;
        this.maxAmmo = 0;
        this.isAim = false;
        System.out.println("Information deleted");
        fout.print("Information deleted");
    }

    void fewShots(int ammo) {
        int AfterShots = this.ammo - ammo;
        System.out.println("You've done " + ammo + "hits, your current ammo is" + AfterShots);
        fout.print("You've done " + ammo + "hits, your current ammo is" + AfterShots
        );
    }
}
