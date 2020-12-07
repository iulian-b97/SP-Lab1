package models;

public class Book implements Element
{
    private String title;
    private Author author;
    private Visitor visitor;
    private Element elements = null;


    Book(String title){
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
    public void addAuthor(Author autor) {
        this.author = autor;
    }

    public void addContent(Element content) {
        this.elements = content;
    }

    @Override
    public void print() {
        if(this.elements != null) {
            elements.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        this.visitor = visitor;
    }
}
