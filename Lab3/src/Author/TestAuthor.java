package Author;
import Author.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Александр", "alexbulinmirea@gmail.com",'M');
        System.out.println(a1);
        a1.setEmail("alexbulinmirea@gmail.com");
        System.out.println(a1);
    }
}