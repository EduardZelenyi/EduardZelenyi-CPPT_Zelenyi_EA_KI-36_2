package lab6;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class CalcApp {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter data: ");
        Scanner s = new Scanner(System.in);
        double data = s.nextDouble();
        Calc obj = new Calc();

        for(int i = 0; i<5;i++) {
            try
            {
                obj.calculate(data);
                data+=1;

            }
            catch (CalcException ex)
            {
                System.out.println(ex.getMessage());
            }
            try {
                System.out.println("Result is: " + obj.getResult());
                obj.writeResTxt("Lab999.txt");
                obj.writeResBin("BinRes.bin");

                obj.readResBin("BinRes.bin");
                System.out.println("Result is(read from bin): " + obj.getResult());
                obj.readResTxt("Lab999.txt");
                System.out.println("Result is(read from txt): " + obj.getResult());
            }catch(IOException ex) {
                System.out.println(ex);
            }
        }



    }
}