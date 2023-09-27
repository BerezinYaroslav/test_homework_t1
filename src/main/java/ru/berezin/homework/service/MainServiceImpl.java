package ru.berezin.homework.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MainServiceImpl implements MainService {
    @Override
    public Map<String, Integer> analyseString(String string) {
        log.trace("Метод analyseString вызван");

        Map<String, Integer> map = new HashMap<>();
        String[] symbols = string.split("");

        for (String symbol : symbols) {
            map.put(symbol, map.get(symbol) == null ? 1 : map.get(symbol) + 1);
        }

        log.trace("Метод analyseString отработан успешно");
        return sortMap(map);
    }

    private Map<String, Integer> sortMap(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
