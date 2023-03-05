public class Main {

    public static void  main(String[] args) {

        Author author1 = new Author("Антон", "Чехов");
        Author author2 = new Author("Лев", "Толстой");

        Book book1 = new Book("Чайка", author1, 1896);
        Book book2 = new Book("Война и мир", author2, 1869);

        System.out.println ("Название: " + book1.getBookName() + "  Автор: "+ book1.getAuthor().getSurname()+ " " + book1.getAuthor().getName()+ "  год: "+ book1.getPublishingYear());
        System.out.println ("Название: " + book2.getBookName() + "  Автор: "+ book2.getAuthor().getSurname()+ " " + book2.getAuthor().getName() + "  год: "+ book2.getPublishingYear());

        book1.setPublishingYear(1901);

        System.out.println ("Название: " + book1.getBookName() + "  Автор: "+ book1.getAuthor().getSurname()+ " " + book1.getAuthor().getName()+ "  год: "+ book1.getPublishingYear());

    }

}