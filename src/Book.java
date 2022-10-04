public class Book {
    private String titleOfTheBook;
    private String yearOfPublicationOfTheBook;
    private Author authorBook;

    public Book(String titleOfTheBook, String yearOfPublicationOfTheBook, String authorOfTheBook){
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.authorBook = authorBook;
    }
    public String getTitleOfTheBook(){
        return this.titleOfTheBook;
    }
    public String getYearOfPublicationOfTheBook(){
        return this.yearOfPublicationOfTheBook;
    }
    public String getAuthorBook() {
        return authorBook.toString();
    }

    public void setYearOfPublicationOfTheBook(String yearOfPublicationOfTheBook){
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }
}
