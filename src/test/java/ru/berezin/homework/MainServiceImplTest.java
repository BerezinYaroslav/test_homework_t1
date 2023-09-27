package ru.berezin.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.berezin.homework.service.MainService;
import ru.berezin.homework.service.MainServiceImpl;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MainServiceImplTest {
    private MainService service = new MainServiceImpl();

    @Test
    public void analyseString1() {
        String testString = "aabbbc";
        Map<String, Integer> testMap = new TreeMap<>();
        testMap.put("b", 3);
        testMap.put("a", 2);
        testMap.put("c", 1);

        assertEquals(testMap, service.analyseString(testString));
    }
}
