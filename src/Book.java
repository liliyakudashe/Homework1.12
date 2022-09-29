public class Book {
    private String titleOfTheBook;
    private String yearOfPublicationOfTheBook;
    private String authorOfTheBook;

    public Book(String titleOfTheBook, String yearOfPublicationOfTheBook, String authorOfTheBook){
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
    }
    public String getTitleOfTheBook(){
        return this.titleOfTheBook;
    }
    public String getYearOfPublicationOfTheBook(){
        return this.yearOfPublicationOfTheBook;
    }

    public void setYearOfPublicationOfTheBook(String yearOfPublicationOfTheBook){
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }
}
