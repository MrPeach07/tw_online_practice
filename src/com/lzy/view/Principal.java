package com.lzy.view;/**
 * Created by Administrator on 2018/6/1.
 */
import java.util.Scanner;

import com.lzy.service.LCDService;

/**
 * tw_three
 *
 * @author MrPeach
 * @create 2018-06-01 15:28
 **/
public class Principal {
    public static void main(String[] args)
    {
        boolean finish = false;
        Scanner scanner = new Scanner(System.in);

        while(!finish)
        {
            System.out.println("input number: format:number of num,num eg:1 ,910");
            String dato = scanner.nextLine();

            if ("0,0".equals(dato))
            {
                finish = true;
                return;
            }

            LCDService lcdServices = new LCDService();
            try
            {
                lcdServices.showLCD(dato);
            }
            catch (Exception e)
            {
                System.out.println("invalid number! input again ");
            }
        }
        scanner.close();

    }
}
