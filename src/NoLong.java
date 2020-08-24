import java.util.List;

// Given a list of strings, return a list of the strings, omitting any string length 4 or more.

public class NoLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }
}
