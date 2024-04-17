package jovelAsirot.U5W3D3.es2.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    private String name;

    private List<Author> authorList;

    private List<BookChapter> chapterList;

    private double price;

    public int getTotalPages() {
        int totalPage = 0;
        for (BookChapter chapter : chapterList) {
            totalPage += chapter.getNumberOfPage();
        }
        return totalPage;
    }
}
