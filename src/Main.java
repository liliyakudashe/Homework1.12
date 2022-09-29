public class Main {
    public static void main(String[] args) {
        Book hp = new Book("Harry Potter the Philosopher's Stone", "1997", "Joanne Rowling");
        System.out.println("Book " + hp.getTitleOfTheBook()+ " year of publication " + hp.getYearOfPublicationOfTheBook());
        Author book = new Author("Joanne Rowling");
        System.out.println("Author "+ book.getAuthorOfTheBook());

        Book lp = new Book("The little prince", "1942", "Antoine de Saint Exupery");
        System.out.println("Book " + lp.getTitleOfTheBook() +" year of publication " + lp.getYearOfPublicationOfTheBook());
        Author booklp = new Author("Antoine de Saint Exupery");
        System.out.println("Author " + booklp.getAuthorOfTheBook());

        hp.setYearOfPublicationOfTheBook("2022");
        System.out.println("New edition " + hp.getTitleOfTheBook() + " " + hp.getYearOfPublicationOfTheBook());
        lp.setYearOfPublicationOfTheBook("2021");
        System.out.println("New edition " + lp.getTitleOfTheBook()+ " " + lp.getYearOfPublicationOfTheBook());
    }
}