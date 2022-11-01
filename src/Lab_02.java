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
        int idx = 1;
        int size = r_n/2+1;


        arr = new char[r_n][];
        for(int i = 1; i <= r_n ; ++i) {
            idx = i>=size ? idx = (i + 1)%size:i%size;
            arr[i-1] = new char [idx];
        }


        System.out.println(Arrays.deepToString(arr));

        System.out.print("\n Enter filler: ");
        filler = in.nextLine();
        int k = 1;

        exit:
        for(int i = 0; i < r_n; i++) {
            for(int j = 0;j < k; j++) {
                char c = filler.charAt(0);

                if (j == k - 1) {
                    c = 'g';
                }
                arr[i][j] = c;
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
                if (j == r_n/2-1) {
                    k = 0;
                }

            }
            k++;
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }


}