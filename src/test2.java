/**
 * Created by Administrator on 2018/6/1.
 */

import java.util.Scanner;

/**
 * tw_two
 *
 * @author MrPeach
 * @create 2018-06-01 13:57
 **/
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0,x;
        for (int i = 0;i < n;i ++) {
            for(int j = 0;j < n;j++) {
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
