public class taxcalculator {
        public static void main(String[] args) {
            double productPrice = 9.99;
            double vatRate = 0.23;

            double grossPrice = productPrice * (1 + vatRate);

            double totalannualValue = grossPrice * 10000;

            double totalNetValue = totalannualValue / (1 + vatRate);

            System.out.println("Using Double:");
            System.out.println("Gross Price: " + grossPrice);
            System.out.println("Total annual value for 10,000 units: " + totalannualValue);
            System.out.println("Total Net Value excluding vat: " + totalNetValue);
        }
    }


