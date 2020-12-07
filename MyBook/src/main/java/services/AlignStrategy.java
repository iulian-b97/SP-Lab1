package services;

import models.Context;

public interface AlignStrategy
{
    void render(String content, Context context);
}