public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jane", "Austen");
        Author author2 = new Author("William", "Shakespeare");

        Book book1 = new Book("Pride and Prejudice", author1, 1813);
        Book book2 = new Book("Hamlet", author2, 1603);

        System.out.println("Book 1 : " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " published in " + book1.getYearOfPublication());
        System.out.println("Book 2 : " + book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " published in " + book2.getYearOfPublication());

        book1.setYearOfPublication(1811);

        System.out.println("Book 1 : " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " published in " + book1.getYearOfPublication());
    }
}