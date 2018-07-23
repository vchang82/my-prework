import java.util.ArrayList;

public class Numrange {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int result = 0;
        for (int i = 0; i < A.size(); i++) {
            int currindex = i;
            int currsum = 0;
            while (currsum <= C && currindex < A.size()) {
                currsum = currsum + A.get(currindex);
                if (currsum >= B && currsum <= C) {
                    result++;
                }
                currindex++;
            }
        }
        return result;
    }
}
