package net.nieled.sbscrapper.service;

import net.nieled.sbscrapper.domain.Entry;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FiltersServiceTest {

    private static final List<Entry> ENTRY_LIST = Arrays.asList(
            new Entry(1, "Lorem ipsum dolor sit amet", 111, 209),
            new Entry(2, "Lorem ipsum dolor sit amet", 40, 116),
            new Entry(3, "Lorem ipsum dolor sit amet", 7, 30),
            new Entry(4, "Lorem ipsum dolor sit amet", 45, 264),
            new Entry(5, "Lorem ipsum dolor sit amet", 12, 29),
            new Entry(6, "Lorem ipsum dolor sit amet, consectetur ", 12, 38),
            new Entry(7, "Lorem ipsum dolor sit amet, consectetur ", 17, 43),
            new Entry(8, "Lorem ipsum dolor sit amet, consectetur ", 85, 297),
            new Entry(9, "Lorem ipsum dolor sit amet, consectetur adipiscing", 6, 18),
            new Entry(10, "Lorem ipsum dolor sit amet, consectetur adipiscing", 33, 73),
            new Entry(11, "Lorem ipsum dolor sit amet, consectetur adipiscing", 3, 16),
            new Entry(12, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", 77, 97),
            new Entry(13, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", 0, 0),
            new Entry(14, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", 98, 147),
            new Entry(15, "Lorem ipsum dolor sit", 352, 199),
            new Entry(16, "Lorem ipsum dolor sit", 0, 8),
            new Entry(17, "Lorem ipsum dolor sit", 6, 33),
            new Entry(18, "Lorem ipsum dolor sit", 94, 176),
            new Entry(19, "Lorem ipsum dolor sit", 62, 111),
            new Entry(20, "Lorem ipsum dolor", 3, 45),
            new Entry(21, "Lorem ipsum dolor", 5, 53),
            new Entry(22, "Lorem ipsum dolor", 207, 379),
            new Entry(23, "Lorem ipsum dolor", 7, 54),
            new Entry(24, "Lorem ipsum dolor", 0, 9),
            new Entry(25, "Lorem ipsum", 76, 83),
            new Entry(26, "Lorem ipsum", 85, 166),
            new Entry(27, "Lorem ipsum", 21, 46),
            new Entry(28, "Lorem", 195, 208),
            new Entry(29, "Lorem", 11, 84),
            new Entry(30, "Lorem)", 11, 12)
    );

    private static final List<Entry> EXPECTED_FILTER_1 = Arrays.asList(
            new Entry(14, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", 98, 147),
            new Entry(8, "Lorem ipsum dolor sit amet, consectetur ", 85, 297),
            new Entry(12, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", 77, 97),
            new Entry(10, "Lorem ipsum dolor sit amet, consectetur adipiscing", 33, 73),
            new Entry(7, "Lorem ipsum dolor sit amet, consectetur ", 17, 43),
            new Entry(6, "Lorem ipsum dolor sit amet, consectetur ", 12, 38),
            new Entry(9, "Lorem ipsum dolor sit amet, consectetur adipiscing", 6, 18),
            new Entry(11, "Lorem ipsum dolor sit amet, consectetur adipiscing", 3, 16),
            new Entry(13, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", 0, 0)
    );

    private static final List<Entry> EXPECTED_FILTER_2 = Arrays.asList(
            new Entry(22, "Lorem ipsum dolor", 207, 379),
            new Entry(4, "Lorem ipsum dolor sit amet", 45, 264),
            new Entry(1, "Lorem ipsum dolor sit amet", 111, 209),
            new Entry(28, "Lorem", 195, 208),
            new Entry(15, "Lorem ipsum dolor sit", 352, 199),
            new Entry(18, "Lorem ipsum dolor sit", 94, 176),
            new Entry(26, "Lorem ipsum", 85, 166),
            new Entry(2, "Lorem ipsum dolor sit amet", 40, 116),
            new Entry(19, "Lorem ipsum dolor sit", 62, 111),
            new Entry(29, "Lorem", 11, 84),
            new Entry(25, "Lorem ipsum", 76, 83),
            new Entry(23, "Lorem ipsum dolor", 7, 54),
            new Entry(21, "Lorem ipsum dolor", 5, 53),
            new Entry(27, "Lorem ipsum", 21, 46),
            new Entry(20, "Lorem ipsum dolor", 3, 45),
            new Entry(17, "Lorem ipsum dolor sit", 6, 33),
            new Entry(3, "Lorem ipsum dolor sit amet", 7, 30),
            new Entry(5, "Lorem ipsum dolor sit amet", 12, 29),
            new Entry(30, "Lorem)", 11, 12),
            new Entry(24, "Lorem ipsum dolor", 0, 9),
            new Entry(16, "Lorem ipsum dolor sit", 0, 8)
    );

    @Test
    public void firstFilter() {
        FiltersService filtersService = new FiltersService();
        var actual = filtersService.firstFilter(ENTRY_LIST);

        assertNotNull(actual);
        assertThat(actual.size(), is(EXPECTED_FILTER_1.size()));
        assertThat(actual, is(EXPECTED_FILTER_1));
    }

    @Test
    public void secondFilter() {
        FiltersService filtersService = new FiltersService();
        var actual = filtersService.secondFilter(ENTRY_LIST);

        assertNotNull(actual);
        assertThat(actual.size(), is(EXPECTED_FILTER_2.size()));
        assertThat(actual, is(EXPECTED_FILTER_2));
    }
}
