import java.util.*;

public class DNA {

    private Map<Character, Integer> nucleotideCounts;

    private final List<Character> validNucleotides = Arrays.asList('A', 'C', 'G', 'T');

    public DNA(String dna) {
        nucleotideCounts = new HashMap<>();

        validNucleotides.forEach(marker -> {nucleotideCounts.put(marker, 0);});

        for (char nucleotide : dna.toCharArray()) {
            validateNucleotide(nucleotide);
            int currentNucleotideCount = nucleotideCounts.get(nucleotide);
            nucleotideCounts.put(nucleotide, ++currentNucleotideCount);
        }
    }

    public int count(char nucleotide) {
        validateNucleotide(nucleotide);
        return nucleotideCounts.get(nucleotide);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return new HashMap<>(nucleotideCounts);
    }

    private void validateNucleotide(Character nucleotide) {
        if (!validNucleotides.contains(nucleotide)) {
            throw new IllegalArgumentException("Invalid nucleotide " + nucleotide + " provided in sequence.");
        }
    }

}
