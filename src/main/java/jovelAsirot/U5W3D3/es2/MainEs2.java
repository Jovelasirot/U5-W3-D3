package jovelAsirot.U5W3D3.es2;

import jovelAsirot.U5W3D3.es2.entities.Author;
import jovelAsirot.U5W3D3.es2.entities.Book;
import jovelAsirot.U5W3D3.es2.entities.BookChapter;
import jovelAsirot.U5W3D3.es2.entities.SinglePage;

import java.util.ArrayList;
import java.util.List;

public class MainEs2 {
    public static void main(String[] args) {

        Author authorA = new Author("Tyler");

        Author authorB = new Author("Shaniqua");

        List<Author> authorList = new ArrayList<>();
        authorList.add(authorA);
        authorList.add(authorB);

        SinglePage singlePage1 = new SinglePage();
        SinglePage singlePage2 = new SinglePage();
        SinglePage singlePage3 = new SinglePage();
        SinglePage singlePage4 = new SinglePage();
        SinglePage singlePage5 = new SinglePage();
        SinglePage singlePage6 = new SinglePage();
        SinglePage singlePage7 = new SinglePage();
        SinglePage singlePage8 = new SinglePage();
        SinglePage singlePage9 = new SinglePage();
        SinglePage singlePage10 = new SinglePage();


        BookChapter chapter1 = new BookChapter();
        chapter1.addSinglePage(singlePage1);
        chapter1.addSinglePage(singlePage2);
        chapter1.addSinglePage(singlePage3);

        BookChapter chapter2 = new BookChapter();
        chapter1.addSinglePage(singlePage4);
        chapter1.addSinglePage(singlePage5);
        chapter1.addSinglePage(singlePage6);
        chapter1.addSinglePage(singlePage7);


        List<BookChapter> chaptersList = new ArrayList<>();
        chaptersList.add(chapter1);
        chaptersList.add(chapter2);

        Book book = new Book("Dreams", authorList, chaptersList, 14.99);

        System.out.println("-------------- Book --------------");
        System.out.println(book);
        System.out.println("Total number of the book: " + book.getTotalPages());

    }
}
