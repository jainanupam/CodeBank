import java.util.Arrays;
import java.util.List;

public class ListToString {

  public static String getCommaSeparatedString(List<String> input) {
    return input.stream()
        .reduce(
            // identity function for String concatenation
            "",
            (s1, s2) -> {
              System.out.println(s1 + " : " + s2);
              if ("".equals(s1)) {
                return s2;
              } else {
                return s1 + "," + s2;
              }
            });
  }

  public static void main(String[] args) {
    //
    List<String> input = Arrays.asList("MySQL", "Oracle", "DB2");
    System.out.println(getCommaSeparatedString(input));
  }
}
