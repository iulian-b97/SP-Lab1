package com.company;

public class Book
{
    public String book_name;
    public Section section;

    public Book(String book_name)
    {
        this.book_name = book_name;
    }

    public void createNewParagraph(String paragraph)
    {
        System.out.println(paragraph + " has been created.");
    }
    public void createNewImage(String image)
    {
        System.out.println(image + " has been created.");
    }
    public void createNewTable(String table)
    {
        System.out.println(table + " has been created.");
    }
    public void addContent(Section section)
    {
        this.section = section;
    }

    public void print()
    {
        System.out.println(book_name);
    }
}
