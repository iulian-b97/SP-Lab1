package models;

import models.Context;
import models.Element;
import services.AlignStrategy;

public class Paragraph implements Element
{
    String pText;
    AlignStrategy strategy;
    Visitor visitor;

    public Paragraph(String text)
    {
        this.pText = text;
    }

    public void setAlignStrategy(AlignStrategy strategy)
    {
        this.strategy = strategy;
    }

    @Override
    public void accept(Visitor visitor)
    {
        this.visitor = visitor;
    }

    @Override
    public String toString()
    {
        return "Paragraph{" +
                "pText='" + pText + '\'' +
                '}';
    }

    @Override
    public void print()
    {
        if(strategy != null)
        {
            strategy.render(this.toString(), new Context());
            return;
        }
        System.out.println(this.toString());
    }
}
