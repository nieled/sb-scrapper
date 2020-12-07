package net.nieled.sbscrapper.service;

import net.nieled.sbscrapper.domain.Entry;

import java.util.List;

public class FiltersService {

    /**
     * Filter all previous entries with more than five words in the title ordered by the amount of comments first.
     */
    public List<Entry> firstFilter(List<Entry> input) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Filter all previous entries with less than or equal to five words in the title ordered by points.
     */
    public List<Entry> secondFilter(List<Entry> input) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
