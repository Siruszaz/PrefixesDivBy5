package PrefixesDivBy5;

import java.util.ArrayList;
import java.util.List;

public class erjizhi {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int prev = 0;
        for (int i = 0; i < A.length; i++) {
            int cur = prev * 2 + A[i];
            res.add(cur % 5 == 0);
            prev = cur % 10;
        }
        return res;
    }
}
