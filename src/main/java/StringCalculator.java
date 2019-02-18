import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public StringCalculator() {
    }

    public int add(String numbers) {
        int total = 0;
        List<String> tabNumbers = new ArrayList<>();
        if(!numbers.equals("")) {
            tabNumbers = Arrays.asList(numbers.split(","));

            for (String strNumber : tabNumbers) {
                total += Integer.parseInt(strNumber);
            }
        }

        return total;
    }
}
