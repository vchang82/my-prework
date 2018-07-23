import java.util.ArrayList;
import java.util.Arrays;

public class Prettyprint {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int size = A * 2 - 1;
        int res[][] = new int[A * 2 - 1][A * 2 - 1];
        int counter = 0;
        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A * 2 - 1; i++) {
            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(new Integer[size]));
            b.add(a);
        }
        //System.out.println("size: " + b.size() + " " + b.get(1).size());
        //for (int i=0; i< A*2-1; i++) {
        //    for (int j=0; j<A*2-1; j++) {
        //        res[i][j]=A;
        //    }
        //    counter++;
        //}


        for (int i = 0; i < A; i++) {
            writeSquare(A, i, b);
        }

        return b;
    }

    public void writeSquare(int A, int num, ArrayList<ArrayList<Integer>> arr) {
        //write 4 sides
        //write first row
        //System.out.println(A + " " + num);
        int rows = A * 2 - 1;
        int i, j;
        i = num;
        for (j = num; j < rows - num; j++) {
            //System.out.println("i=" + i + "j=" + j);

            //arr[i][j] = A - num;
            arr.get(i).set(j, A - num);
        }

        //write second row
        i = rows - num - 1;
        for (j = num; j < rows - num; j++) {
            //System.out.println("i=" + i + "j=" + j);
            //arr[i][j] = A - num;
            arr.get(i).set(j, A - num);
        }

        //write first col
        j = num;
        for (i = num; i < rows - num; i++) {
            //arr[i][j] = A-num;
            arr.get(i).set(j, A - num);

        }
        //write last col
        j = rows - num - 1;
        for (i = num; i < rows - num; i++) {
            //arr[i][j] = A-num;
            arr.get(i).set(j, A - num);

        }
    }
}
