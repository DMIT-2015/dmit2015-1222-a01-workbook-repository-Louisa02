package dmit2015.model;

import lombok.Getter;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.List;

public class CanadianIncomeTaxManager {

    // define private constructor to implement a Single pattern
    private CanadianIncomeTaxManager() {

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

    public void loadDataFromFile() {
        try {
            Path csvPath = Path.of(
                    getClass()
                            .getClassLoader()
                            .getResource("data/CanadianPersonalIncomeTaxRates.csv").toURI());
//            incomeTaxData = Files.readAllLines(csvPath);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
