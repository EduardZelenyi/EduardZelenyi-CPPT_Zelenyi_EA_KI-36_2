import java.io.*;
import java.util.*;

public class Lab_02{

    public static void main(String[] args) throws FileNotFoundException {
        int r_n;
        char[][] arr;
        String filler;

        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Enter amount of rows and columns: ");
        r_n = in.nextInt();
        in.nextLine();
        arr = new char[r_n][];
        for(int i = 0; i < r_n; i++){
            arr[i]= new char[r_n];
        }

        System.out.print("\n Enter filler: ");
        filler = in.nextLine();
        exit:
        for(int i = 0; i < r_n; i++) {
            for(int j = 0; j < i+1; j++) {
                if(filler.length() == 1){
                    if(i < r_n/2 && j < r_n/2)
                        arr[i][j] = (char)filler.codePointAt(0);
                    if(i > (r_n/2-1 ) && j > (r_n/2-1 ))
                        arr[i][j] = (char)filler.codePointAt(0);
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                }
                else if (filler.length() == 0)
                {
                    System.out.println("\n Please, enter filler");
                    break exit;
                }
                else
                {
                    System.out.print("\nError occured");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}