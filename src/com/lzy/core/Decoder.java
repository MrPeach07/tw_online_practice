package com.lzy.core;
import java.util.ArrayList;
import java.util.List;


/**
 * tw_three
 *
 * @author MrPeach
 * @create 2018-06-01 15:23
 **/
public class Decoder
{
    private List<String> numberList;
    private List<String> result;
    private int margin;
    private int totalColumns;

    public Decoder (int size, List<String> numberList)
    {
        this.numberList = numberList;
        this.totalColumns = size + 2;
        this.margin = 2*size + 3;
        this.result = new ArrayList<String>(margin);
    }

    public List<String> decodeMessage()
    {
        int initialIndex = 0;
        int finalIndex = totalColumns;

        for (int k = 0; k < margin; k++)
        {
            StringBuilder partialMessage = new StringBuilder(totalColumns * numberList.size());

            for (int i = 0; i < numberList.size(); i++)
            {
                String message = numberList.get(i);
                partialMessage.append(message.substring(initialIndex, finalIndex));
            }

            result.add(partialMessage.toString());

            initialIndex = finalIndex;
            finalIndex = finalIndex + totalColumns;
            partialMessage = null;
        }
        return result;
    }
}