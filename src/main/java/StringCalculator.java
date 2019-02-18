public class StringCalculator {
    public StringCalculator() {
    }

    public int add(String numbers) {
        int total = 0;
        int sum = 0;
        if(!numbers.equals("")) {
            sum = Integer.parseInt(numbers);
        }

        return total + sum;
    }
}
