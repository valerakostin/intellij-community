// "Extract variable 'l' to separate stream step" "true"
import java.util.*;
import java.util.stream.*;

public class Test {
  Object[] testBoxed(int[] x) {
    return Arrays.stream(x).mapToObj(i -> {
      long <caret>l = i;
      return l;
    }).toArray();
  }
}