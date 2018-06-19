import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WinterAndSummer {

    public int solution(int[] T) {
        List<Integer> temp = Arrays.stream(T).boxed().collect(Collectors.toList());
        List<Integer> winter = new ArrayList<>();
        List<Integer> center = new ArrayList<>();

        int x = temp.indexOf(Collections.max(temp));
        for (int i = x - 1; i != -1; i--) {
            if (temp.get(x) <= temp.get(i)) {
                x = i;
                i = x - 1;
            }
            if (i == 0) {
                center.add(temp.get(x));
                x--;
                i = x;
            }
            if (x == 0) {
                break;
            }
        }

        int root = center.size() - 1;
        for (int i = temp.size() - 1; i >= x; i--) {
            x = temp.indexOf(center.get(root));
            if (temp.get(i) > temp.get(x)) {

                root--;
            }
        }

        winter.addAll(temp.subList(0, x));
        return winter.size();
    }
}
