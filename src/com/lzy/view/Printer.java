package com.lzy.view;/**
 * Created by Administrator on 2018/6/1.
 */
import java.util.List;

import com.lzy.core.Decoder;
/**
 * tw_three
 *
 * @author MrPeach
 * @create 2018-06-01 15:27
 **/
public class Printer {
    public static void print(int size, List<String> numberList)
    {
        Decoder deco = new Decoder(size, numberList);
        List<String> result = deco.decodeMessage();

        for(String value: result)
        {
            System.out.println(value);
        }
    }
}
