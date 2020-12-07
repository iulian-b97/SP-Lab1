package main;

import models.ImageProxy;
import models.Paragraph;
import models.Section;
import models.Table;
import services.AlignCenter;
import services.AlignLeft;
import services.AlignRight;
import services.RenderContentVisitor;

public class BookMain
{
    public static void main(String[] args) throws Exception
    {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        ImageProxy img1 = new ImageProxy("first image");
        cap1.add(img1);
        ImageProxy img2 = new ImageProxy("second image");
        cap1.add(img2);
        Table table1 = new Table("first table");
        cap1.add(table1);

        RenderContentVisitor visitor = new RenderContentVisitor();
        cap1.accept(visitor);
        visitor.visit(cap1);

    }
}

