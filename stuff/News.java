import java.util.ArrayList;
import java.util.Collections;

public class News implements Comparable<News> {
    private String title;
    private String content;
    private boolean isPinned;
    private ArrayList<String> comments;

    public News(String title, String content, boolean isPinned) {
        this.title = title;
        this.content = content;
        this.isPinned = isPinned;
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void pinNews() {
        this.isPinned = true;
    }

    @Override
    public int compareTo(News other) {
        return Boolean.compare(other.isPinned, this.isPinned);
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Pinned: %b, Content: %s, Comments: %s",
                title, isPinned, content, comments);
    }
}
