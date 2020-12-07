package models;

public interface Visitor
{
    void visit(Book book);

    void visit(Section section);

    void visit(Paragraph paragraph);

    void visit(Image image);

    void visit(ImageProxy imageProxy);

    void visit(Table table);
}