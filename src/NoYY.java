import java.util.List;

// Given a list of strings, return a list where each string has "y" added at its end,
// omitting any resulting strings that contain "yy" as a substring anywhere.

public class NoYY {
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }
}
