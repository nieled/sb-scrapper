package net.nieled.sbscrapper.service;

import net.nieled.sbscrapper.domain.Entry;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScrapperService {

    private static final String URL = "https://news.ycombinator.com/";

    public List<Entry> getData() throws IOException {
        Document doc = Jsoup.connect(URL).get();

        List<Entry> entries = new ArrayList<>();
        Elements titles = doc.select(".athing");
        for (Element element : titles.subList(0, Math.min(30, titles.size()))) {
            var details = element.nextElementSibling();

            var orderNo = Integer.parseInt(element.child(0).text().replace(".", ""));
            var title = element.child(2).text();
            int comments = asNumber(details.select("a:nth-child(6)").text().replaceAll("\\D+", ""));
            int points = asNumber(details.select(".score").text().replaceAll("\\D+", ""));

            entries.add(new Entry(orderNo, title, comments, points));
        }
        return entries;
    }

    protected int asNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

}

