package software.ulpgc.kata3;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> people = TsvFilePersonLoader.with("hw_25000.tsv").load();
        Histogram weightHistogram = new WeightHistogram(people);
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(weightHistogram);
        mainFrame.setVisible(true);
    }
}

