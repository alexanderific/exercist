import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {

        if (old == null || old.isEmpty()) {
            return null;
        }

        Map<String, Integer> newFormat = new HashMap<String, Integer>();

        old.forEach((score, letters) -> {
            letters.forEach(letter -> {
                newFormat.put(letter.toLowerCase(), score);
            });
        });

        return newFormat;
    }
}
