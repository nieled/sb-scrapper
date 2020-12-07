package net.nieled.sbscrapper.service;

import net.nieled.sbscrapper.domain.Entry;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersService {

    /**
     * Filter all previous entries with more than five words in the title ordered by the amount of comments first.
     */
    public List<Entry> firstFilter(List<Entry> input) {
        return input.stream()
                .sorted(Comparator.comparing(Entry::getComments).reversed())
                .filter(entry -> entry.getTitle().split("\\s+").length > 5)
                .collect(Collectors.toList());
    }

    /**
     * Filter all previous entries with less than or equal to five words in the title ordered by points.
     */
    public List<Entry> secondFilter(List<Entry> input) {
        return input.stream()
                .sorted(Comparator.comparing(Entry::getPoints).reversed())
                .filter(entry -> entry.getTitle().split("\\s+").length <= 5)
                .collect(Collectors.toList());
    }
}
