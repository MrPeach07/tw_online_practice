package com.lzy.core;/**
 * Created by Administrator on 2018/6/1.
 */

/**
 * tw_three
 *
 * @author MrPeach
 * @create 2018-06-01 15:24
 **/
public class NumberManager {
    private StringBuilder content;
    private int number;
    private int size;
    private int hight;
    private static final String SPACE = " ";
    private static final String LANDSCAPE = "-";
    private static final String PORTRAIS = "|";

    public NumberManager(int number, int size)
            throws Exception
    {
        this.number = number;
        this.size = size;
        this.hight = size;
        content = new StringBuilder(number*size*hight);
        createNumber();
    }

    private void createNumber()
            throws Exception
    {
        switch(number)
        {
            case 0: createNumberZero();
                break;
            case 1: createNumberOne();
                break;
            case 2: createNumberTwo();
                break;
            case 3: createNumberThree();
                break;
            case 4: createNumberFour();
                break;
            case 5: createNumberFive();
                break;
            case 6: createNumberSix();
                break;
            case 7: createNumberSeven();
                break;
            case 8: createNumberEight();
                break;
            case 9: createNumberNine();
                break;
            default: throw new Exception("Incorrect number entered");
        }
    }

    private void createNumberOne()
    {
        fillWith(SPACE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWith(SPACE);
        }

        fillWith(SPACE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWith(SPACE);
        }

        fillWith(SPACE);
    }

    private void createNumberTwo()
    {
        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWith(SPACE);
        }

        fillWith(LANDSCAPE);
    }

    private void createNumberThree()
    {
        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(LANDSCAPE);
    }

    private void createNumberFour()
    {
        fillWith(SPACE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWithSpaceAndVertical();
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(SPACE);
    }

    private void createNumberFive()
    {
        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWith(SPACE);
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(LANDSCAPE);
    }

    private void createNumberSix()
    {
        fillWith(SPACE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWith(SPACE);
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWithSpaceAndVertical();
        }

        fillWith(LANDSCAPE);
    }

    private void createNumberSeven()
    {
        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(SPACE);
    }

    private void createNumberEight()
    {
        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWithSpaceAndVertical();
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWithSpaceAndVertical();
        }

        fillWith(LANDSCAPE);
    }

    private void createNumberNine()
    {
        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWithSpaceAndVertical();
        }

        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            completeWith(SPACE);
            content.append(PORTRAIS);
        }

        fillWith(LANDSCAPE);
    }

    private void createNumberZero()
    {
        fillWith(LANDSCAPE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWithSpaceAndVertical();
        }

        fillWith(SPACE);

        for (int i = 0; i < hight; i++)
        {
            content.append(PORTRAIS);
            completeWithSpaceAndVertical();
        }

        fillWith(LANDSCAPE);
    }

    private void fillWith(String character)
    {
        content.append(SPACE);
        for (int i = 0; i < size; i++)
        {
            content.append(character);
        }
        content.append(SPACE);
    }

    private void completeWith(String character)
    {
        content.append(SPACE);
        for (int i = 1; i < size; i++)
        {
            content.append(character);
        }
        content.append(SPACE);
    }

    private void completeWithSpaceAndVertical()
    {
        int totalSize = size + 2;
        for (int i = 1; i < totalSize; i++)
        {
            if (i == (totalSize-1))
            {
                content.append(PORTRAIS);
            }
            else
            {
                content.append(SPACE);
            }
        }
    }

    public String getContentString()
    {
        return content.toString();
    }
}
