import java.util.List;

// Given a list of strings, return a list of the strings, omitting any string that contains a "z".

public class NoZ {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
}
