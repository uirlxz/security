import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lxz on 2017/4/1.
 */

public class ordinary {

    public static void main(String[] args) {

        System.out.println("求m的n次方的值(calculate m^n)");
        System.out.print("m=");
        Scanner min = new Scanner(System.in);
        BigInteger m = min.nextBigInteger();
        System.out.print("n=");
        Scanner nin = new Scanner(System.in);
        BigInteger n = nin.nextBigInteger();

        long startTime = System.nanoTime();

        BigInteger num0 = BigInteger.valueOf(0);
        BigInteger num1 = BigInteger.valueOf(1);
        BigInteger result = BigInteger.valueOf(1);

        int a =n.intValue();
        for(;a>0;a--){
            result=result.multiply(m);
        }

        long endTime = System.nanoTime();
        long during = endTime - startTime;

        System.out.println("用时(time)： "+during+"纳秒(nm) 即"+during/1000000+"毫秒(ms)   即"+during/1000000000+"秒(s)");
        int x = String.valueOf(result.toString()).length();
        System.out.println("结果是(result)： "+result);
        System.out.println("位数(length of the result)："+x);

    }

    }
