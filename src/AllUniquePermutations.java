import java.util.ArrayList;
import java.util.HashSet;

public class AllUniquePermutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        recpermute(A, result, 0);
        return dedup(result);

    }

    public void recpermute(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res, int index) {
        if (index == A.size()) {
            res.add(new ArrayList<Integer>(A));
        }
        for (int i = index; i < A.size(); i++) {
            swap(A, i, index);

            recpermute(A, res, index + 1);
            swap(A, i, index);

        }
    }

    public void swap(ArrayList<Integer> A, int index, int endindex) {
        Integer temp = A.get(index);
        A.set(index, A.get(endindex));
        A.set(endindex, temp);
    }

    public ArrayList<ArrayList<Integer>> dedup(ArrayList<ArrayList<Integer>> list) {
        HashSet<ArrayList<Integer>> h = new HashSet<ArrayList<Integer>>();
        for (int i = 0; i < list.size(); i++) {
            h.add(list.get(i));
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(h);
        return result;
    }
}
