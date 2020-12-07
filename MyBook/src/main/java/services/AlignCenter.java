package services;

import models.Context;

public class AlignCenter implements AlignStrategy
{
    @Override
    public void render(String content, Context context)
    {
        System.out.println("Align Center:"+content);
    }
}
