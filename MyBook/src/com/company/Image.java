package com.company;

import java.util.concurrent.TimeUnit;

public class Image
{
    public String imageName;

    public Image(String name)
    {
        imageName = name;
        try
        {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
