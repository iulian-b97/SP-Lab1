package models;

import models.Context;
import models.Element;
import services.AlignStrategy;

public class Table implements Element
{
    String table;
    AlignStrategy strategy;
    Visitor visitor;

    public Table (String table)
    {
        this.table = table;
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
        return "Table{" +
                "table='" + table + '\'' +
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

