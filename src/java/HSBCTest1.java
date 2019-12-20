import java.math.BigDecimal;

public class HSBCTest1 {

    public static void getIndex() {

        BigDecimal fibPre = new BigDecimal(1);
        BigDecimal tem = new BigDecimal(1);
        BigDecimal fibSum = fibPre.add(tem);
        int index = 3;

        while (fibSum.toString().length() < 1000) {
            tem = fibSum;
            fibSum = fibSum.add(fibPre);
            fibPre = tem;
            index++;
        }

        System.out.println(index);

    }


}
