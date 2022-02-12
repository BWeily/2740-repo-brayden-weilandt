import javax.swing.JOptionPane;
import java.text.NumberFormat;

// For the first part of this exercise, explain the outputs for each of the 16 statements in the sampleOperators method.
// Then complete the program for the outlined methods.
public class Main {
    public static void main(String[] args) {
        String city = JOptionPane.showInputDialog("Enter your city: ");
        String strPopulation = JOptionPane.showInputDialog("Enter your city population: ");
        int population = 0;
        // convert strPopulation to int using Integer.parseInt ()
        String strSalesTaxRate = JOptionPane.showInputDialog("Enter your city sales tax rate: ");
        double salesTaxRate = 0.0;
         showLength(city);
         showUpperCase(city);
         showLower(city);
         showFirstChar(city);
         showPopulation(population);
         showSalesTaxRate(salesTaxRate);
         sampleOperators();
    }

    public static void showLength (String s) {
        JOptionPane.showMessageDialog(null,
                "Count of characters in '" + s + "': " + s.length());
    }

    public static void showUpperCase (String s) {
        JOptionPane.showMessageDialog(null,
                "Upper case: '" + s.toUpperCase());

    }

    public static void showLower (String s) {
        JOptionPane.showMessageDialog(null,
                "Lower case: '" + s.toLowerCase());
    }

    public static void showFirstChar (String s) {
        JOptionPane.showMessageDialog(null,
                "First Character: '" + s.charAt(0));
    }

    // Convert population to string using Integer. to string ()
    public static void showPopulation (int population) {
        int i=10;
        String p=String.valueOf(population);
        JOptionPane.showMessageDialog(null,
                "Population: 55000");
    }

    // Format percent using NumberFormat.getPercentInstance ()
    public static void showSalesTaxRate (double salesTaxRate) {

        double num = 0.6875;

        NumberFormat defaultFormat = NumberFormat.getPercentInstance();
        defaultFormat.setMinimumFractionDigits(1);
        JOptionPane.showMessageDialog(null,
                "Sales Tax %: '" + defaultFormat.format(num));
    }

    public static void sampleOperators()
    {
        int i = 5, j = 4, k = 2;
        double d = 2.0;
        boolean t = true, f = false;
        char c = 'A', sp = 32;
        JOptionPane.showMessageDialog(null,
                "1) i / k = " + i / k + '\n' +		//
                        "2) i / d = " + i / d + '\n' +		//
                        "3) c++ = " + c++ + '\n' +		//
                        "4) ++c = " + ++c + '\n' +		//
                        "5) c + sp = '" + c + sp + "'\n" +	//
                        "6) (c + sp) = " + (c + sp) + '\n' +	//
                        "7) (c += sp) = " + (c += sp) + '\n' +	//
                        "8) (i > j) && (j > k) = " + (((i > j) && (j > k)) ? "true" : "false") + '\n' +
                        //
                        "9) (i < j) && (j > k) = " + (((i < j) && (j > k)) ? "true" : "false") + '\n' +
                        //
                        "10) (i < j) || (j > k) = " + (((i < j) || (j > k)) ? "true" : "false") + '\n' +
                        //
                        "11) i + j / k = " + (i + j / k) + '\n' +	//
                        "12) j / k + i = " + (j / k + i) + '\n' +	//
                        "13) j / (k + i) = " + (j / (k + i)) + '\n' +	//
                        "14) f && t || t = " + ((f && t || t) ? "true" : "false") + '\n' +
                        //
                        "15) 100001000 - 100000900 = " + (100001000 - 100000900) + '\n' +
                        "16) 100001000f - 100000900f = " + (100001000f - 100000900f) + '\n' +
                        //
                        "17) 1.000001f - 1.0000009f = " + (1.000001f - 1.0000009f) );
        //
    }
}