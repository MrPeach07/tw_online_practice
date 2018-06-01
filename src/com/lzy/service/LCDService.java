package com.lzy.service;/**
 * Created by Administrator on 2018/6/1.
 */

import java.util.ArrayList;
import java.util.List;

import com.lzy.core.NumberManager;
import com.lzy.view.Printer;

/**
 * tw_three
 *
 * @author MrPeach
 * @create 2018-06-01 15:26
 **/
public class LCDService {
    public void showLCD(String input)
            throws Exception
    {
        if (!input.isEmpty())
        {
            List<String> numberList = new ArrayList<String>();

            String[] inputList = input.split(",");
            if (inputList.length > 0)
            {
                int size = Integer.parseInt(inputList[0]);
                String content = inputList[1];
                for (int i = 0; i < content.length(); i++)
                {
                    Character character = content.charAt(i);
                    String value = character.toString();
                    int number = Integer.parseInt(value);

                    NumberManager manager = new NumberManager(number, size);
                    numberList.add(manager.getContentString());
                }

                Printer.print(size, numberList);
            }
            else
            {
                System.out.println("invalid number! input again");
            }
        }
        else
        {
            System.out.println("you must input a number");
        }
    }
}
