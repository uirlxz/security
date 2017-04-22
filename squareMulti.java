import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lxz on 2017/4/8.
 */
public class squareMulti{

    public static void main(String args[]) {
        System.out.println("求m的n次方的值(calculate m^n)");
        System.out.print("m=");
        Scanner min = new Scanner(System.in);
        BigInteger m = min.nextBigInteger();
        System.out.print("n=");
        Scanner nin = new Scanner(System.in);
        BigInteger n = nin.nextBigInteger();



        long startTime = System.nanoTime();

        String binStr=Integer.toBinaryString(n.intValue());//转换为二进制
        int len = binStr.length();//位数长短

        BigInteger result = m;
        for(int a=1;len>1;len--)//第一位总是1，所以从第二位开始判断，len也只用判断到2
        {
           String num = binStr.substring(a,a+1);//取二进制第二位并
            int i=Integer.parseInt(num);
            if(i==0) {
                result = result.multiply(result);
            }

            else{
                result = result.multiply(result.multiply(m));
            }
            a++;
        }



        long endTime = System.nanoTime();
        long during = endTime - startTime;
        System.out.println("结果是(result)： "+result);
        System.out.println("用时(time):"+during+"纳秒(nm) 即"+during/1000000+"毫秒(ms)");
        int x = String.valueOf(result.toString()).length();

        System.out.println("位数(length of the result)："+x);

    }

}
