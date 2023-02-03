package dmit2015.model;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CanadianIncomeTaxManager {

    // define private constructor to implement a Single pattern
    private CanadianIncomeTaxManager() {
        loadDataFromFile();
    }

    // define a single instance of this class
    private static CanadianIncomeTaxManager INSTANCE;

    // define a static class-level to access the singleton
    public static CanadianIncomeTaxManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CanadianIncomeTaxManager();
        }
        return INSTANCE;
    }

    @Getter
    private List<CanadianPersonalIncomeTaxRate> incomeTaxRates;

    public int[] availbleTaxYear() {
        return incomeTaxRates.stream()
                .map(item -> item.getTaxYear())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(item -> item)
                .toArray();
    }

    public void loadDataFromFile() {
        try {
           try (var reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("data/CanadianPersonalIncomeTaxRates.csv")))) {
               // Skip the first line as it contains headers
               reader.readLine();
               String line;
               incomeTaxRates = new ArrayList<>();
               while ((line = reader.readLine()) != null) {
                   var optionalCanadianPersonalIncomeTaxRate = CanadianPersonalIncomeTaxRate.parseCsv(line);
                   if (optionalCanadianPersonalIncomeTaxRate.isPresent()) {

                   }
               }
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
