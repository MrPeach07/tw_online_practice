/**
 * Created by Administrator on 2018/6/1.
 */

import java.util.Scanner;

/**
 * tw_one
 *
 * @author MrPeach
 * @create 2018-06-01 13:54
 **/
public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }
}
