package lab6;
import java.io.*;
import java.util.Scanner;



public class Calc {
    private double result, radian;

    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + " not found\n");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }

    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    public double calculate(double x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try{
            y =  1/Math.tan(x);
            result = y;
            System.out.printf("y = ctg(%f) = %f \n", x , 1/Math.tan(x));
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||  y==Double.POSITIVE_INFINITY || x==90 || x== -90)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex) {
            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (x==0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }

        return y;
    }

    public double getResult()
    {
        return result;
    }

}