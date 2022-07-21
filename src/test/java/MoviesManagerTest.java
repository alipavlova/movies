import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test

    public void shouldAddNew() {
        MoviesManager manager = new MoviesManager();
        manager.add("New");

        String[] expected = {"New"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindAll() {
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindLast() {
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third"};
        String[] actual = manager.findLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }
}