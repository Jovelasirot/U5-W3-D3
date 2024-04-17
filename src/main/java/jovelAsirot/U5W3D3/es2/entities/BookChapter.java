package jovelAsirot.U5W3D3.es2.entities;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class BookChapter implements Page {

    private List<Page> pageList;

    public BookChapter() {
        this.pageList = new ArrayList<>();
    }

    @Override
    public int getNumberOfPage() {
        int numPage = 0;
        for (Page page : pageList) {
            numPage += page.getNumberOfPage();
        }
        return numPage;
    }

    public void addSinglePage(SinglePage singlePage) {
        pageList.add(singlePage);
    }
}
