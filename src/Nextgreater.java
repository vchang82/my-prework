import java.util.ArrayList;

public class Nextgreater {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        ArrayList<Integer> solution = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int val = A.get(i);
            int newval = 0;
            for (int j = i; j < A.size(); j++) {
                if (A.get(j) > val) {
                    newval = A.get(j);
                    break;
                }

            }
            if (newval == 0) {
                solution.add(-1);
            } else {
                solution.add(newval);
            }

        }
        return solution;
    }
}
