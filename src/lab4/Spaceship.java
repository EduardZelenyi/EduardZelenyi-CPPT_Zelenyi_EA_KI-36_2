package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Spaceship implements Moveable{
    protected int fuel;
    protected int ammo;
    protected boolean isAim;

    protected PrintWriter fout;
    protected int maxAmmo;
    public Spaceship() {
        this.fuel = 0;
        this.ammo = 0;
    }


    public Spaceship(int fuel, int ammo, int maxAmmo, boolean isAim) throws FileNotFoundException {
        this.fuel = fuel;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.isAim = false;
        fout = new PrintWriter(new File("Log.txt"));
    }

    public int GetFuel() {
        return this.fuel;
    }

    public int GetAmmo() {
        return this.ammo;
    }

    public void LoadAmmo(int res) {
        res = ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public boolean isAim() {
        return isAim;
    }

    public void setAim(boolean aim) {
        isAim = aim;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public void shoot() {
        if(isAim) {
            if(ammo == 0){
                System.out.println("No ammo");
                fout.println("No ammo");
            }
            else {
                System.out.println("Boom");
                fout.print("Boom\n");
                ammo -= 1;
                isAim = false;
            }
        }
        else {System.out.println("First you need to aim");}


    }

    public void reload() {
        ammo = maxAmmo;
        System.out.println("Reloading..");
        fout.print("Reloading..\n");
    }

    public void aim() {
        if (isAim) {
            System.out.println("Your target is already aimed");
            fout.print("Your target is already aimed\n");
        } else {
            System.out.println("Aimed.");
            fout.print("Aimed\n");
            isAim = true;
        }
    }

    public void dispose()
    {
        fout.flush();
        fout.close();
    }

}
