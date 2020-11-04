package com.company;

public class Section
{
    public String title;
    public Image image;

    public Section(String title)
    {
        this.title = title;
    }

    public void add(Image image)
    {
        this.image = image;
    }

    public void print()
    {
        System.out.println(this.image);
    }
}
