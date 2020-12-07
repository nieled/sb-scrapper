package net.nieled.sbscrapper;

import net.nieled.sbscrapper.service.FiltersService;
import net.nieled.sbscrapper.service.ScrapperService;

import java.io.IOException;

public class Main {

    public static void main(String... args) {
        ScrapperService scrapperService = new ScrapperService();
        FiltersService filtersService = new FiltersService();
        try {
            var data = scrapperService.getData();

            var filter1 = filtersService.firstFilter(data);
            var filter2 = filtersService.secondFilter(data);

            System.out.println("First filter results:");
            filter1.forEach(System.out::println);
            System.out.println("Second filter results:");
            filter2.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Oops! We got an error");
        }
    }
}

