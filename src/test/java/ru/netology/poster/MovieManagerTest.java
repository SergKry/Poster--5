package ru.netology.poster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void shouldMiddleFilmFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");

        String[] actual = manager.findAll();
        String[] expected = {
                "f1",
                "f2",
                "f3",
                "f4",
                "f5"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMinFilmFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("f1");


        String[] actual = manager.findAll();
        String[] expected = {"f1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxFilmFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");
        manager.add("f10");

        String[] actual = manager.findAll();
        String[] expected = {
                "f1",
                "f2",
                "f3",
                "f4",
                "f5",
                "f6",
                "f7",
                "f8",
                "f9",
                "f10"
        };

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldMiddleFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");

        String[] actual = manager.findLast();
        String[] expected = {
                "f5",
                "f4",
                "f3",
                "f2",
                "f1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMinFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("f1");


        String[] actual = manager.findLast();
        String[] expected = {"f1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMinFilmFindLast2() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");


        String[] actual = manager.findLast();
        String[] expected = {
                "f2",
                "f1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");
        manager.add("f10");

        String[] actual = manager.findLast();
        String[] expected = {
                "f10",
                "f9",
                "f8",
                "f7",
                "f6",
                "f5",
                "f4",
                "f3",
                "f2",
                "f1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxBoundaryFilmFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");
        manager.add("f10");
        manager.add("f11");

        String[] actual = manager.findLast();
        String[] expected = {
                "f11",
                "f10",
                "f9",
                "f8",
                "f7",
                "f6",
                "f5",
                "f4",
                "f3",
                "f2"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

}
