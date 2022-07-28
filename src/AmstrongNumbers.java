import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class AmstrongNumbers {
    public static void compute() {
        for(int i=0;i<=500;i++){
            String number = String.valueOf(i);
            int sum=0;
            for(int o = 0; number.length() > o; o++){
                sum+=pow(parseInt(number.substring(o,(o+1)),10),3);

            }
            int amstrongNumber=sum;
            if (amstrongNumber==i){
                System.out.println(i);

            }

        }
    }
}
