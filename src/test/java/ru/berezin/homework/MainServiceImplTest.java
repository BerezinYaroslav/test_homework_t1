package ru.berezin.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.berezin.homework.service.MainService;
import ru.berezin.homework.service.MainServiceImpl;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MainServiceImplTest {
    private MainService service;

    @BeforeEach
    public void beforeEach() {
        service = new MainServiceImpl();
    }

    @Test
    public void analyseString_aabbbc() {
        String testString = "aabbbc";
        Map<String, Integer> testMap = new TreeMap<>();

        testMap.put("b", 3);
        testMap.put("a", 2);
        testMap.put("c", 1);

        assertEquals(testMap, service.analyseString(testString));
    }

    @Test
    public void analyseString_hhlas() {
        String testString = "hhlas";
        Map<String, Integer> testMap = new TreeMap<>();

        testMap.put("h", 2);
        testMap.put("l", 1);
        testMap.put("a", 1);
        testMap.put("s", 1);

        assertEquals(testMap, service.analyseString(testString));
    }

    @Test
    public void analyseString_qwerty() {
        String testString = "qwerty";
        Map<String, Integer> testMap = new TreeMap<>();

        testMap.put("q", 1);
        testMap.put("w", 1);
        testMap.put("e", 1);
        testMap.put("r", 1);
        testMap.put("t", 1);
        testMap.put("y", 1);

        assertEquals(testMap, service.analyseString(testString));
    }

    @Test
    public void analyseString_ggdssiiiieieiei() {
        String testString = "ggdssiiiieieiei";
        Map<String, Integer> testMap = new TreeMap<>();

        testMap.put("i", 7);
        testMap.put("e", 3);
        testMap.put("d", 1);
        testMap.put("g", 2);
        testMap.put("s", 2);

        assertEquals(testMap, service.analyseString(testString));
    }

    @Test
    public void analyseString_yaroslav() {
        String testString = "yaroslav";
        Map<String, Integer> testMap = new TreeMap<>();

        testMap.put("a", 2);
        testMap.put("y", 1);
        testMap.put("r", 1);
        testMap.put("o", 1);
        testMap.put("s", 1);
        testMap.put("l", 1);
        testMap.put("v", 1);

        assertEquals(testMap, service.analyseString(testString));
    }
}
