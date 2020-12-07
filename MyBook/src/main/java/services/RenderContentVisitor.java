package services;

import models.*;

public class RenderContentVisitor implements Visitor
{

    @Override
    public void visit(Book book)
    {
        book.print(); // we are using the print method because we don't want to get it's private fields by using get methods
    }

    @Override
    public void visit(Section section)
    {
        section.print();
    }

    @Override
    public void visit(Paragraph paragraph)
    {
        paragraph.print();
    }

    @Override
    public void visit(Image image)
    {
        image.print();
    }

    @Override
    public void visit(ImageProxy imageProxy)
    {
        imageProxy.print();
    }

    @Override
    public void visit(Table table)
    {
        table.print();
    }
}

