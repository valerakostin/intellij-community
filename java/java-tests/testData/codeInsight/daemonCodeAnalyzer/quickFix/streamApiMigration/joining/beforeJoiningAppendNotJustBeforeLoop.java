// "Replace with collect" "true"

import java.util.List;

public class Test {
  private static String work2(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    String separator = "";
    for <caret> (String str : strs) {
      sb.append(separator);
      sb.append(str);
      separator = ",";
    }
    sb.append("}");
    return sb.toString();
  }
}