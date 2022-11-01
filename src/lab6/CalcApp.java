package lab6;

import java.io.IOException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) throws IOException {
        Calc obj = new Calc();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        try
        {
            obj.calculate(data);
        }
        catch (CalcException ex)
        {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Result is: " + obj.getResult());
            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");

            obj.readResBin("BinRes.bin");
            System.out.println("Result is(read from bin): " + obj.getResult());
            obj.readResTxt("textRes.txt");
            System.out.println("Result is(read from txt): " + obj.getResult());
        }catch(IOException ex) {
            System.out.println(ex);
        }


    }
}