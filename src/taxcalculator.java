import java.math.BigDecimal;


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
            System.out.println("Total net value :" +totalNetValue);
            // With BigDecimal
            BigDecimal netPrice = new BigDecimal("9.99");
            BigDecimal VatRate = new BigDecimal("0.23");
            BigDecimal NetgrossPrice = netPrice.multiply(BigDecimal.ONE.add(VatRate));
            BigDecimal annualgross = NetgrossPrice.multiply(new BigDecimal("10000"));
            BigDecimal annualNetValue = annualgross.divide(BigDecimal.ONE.add(VatRate));

            System.out.println("\nUsing BigDecimal:");
            System.out.println("Gross Price: " + NetgrossPrice);
            System.out.println("Total Gross (10,000 pcs): " + annualgross);
            System.out.println("Total Net : " + annualNetValue);

            //Comparison between Double and BgDecimal
          System.out.println("\nComparison:");
            System.out.println("Total net with Double : " +(totalannualValue));
            System.out.println("Total Net with BigDecimal : " +(annualNetValue));

        }
    }


