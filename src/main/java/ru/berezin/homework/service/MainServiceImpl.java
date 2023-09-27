package ru.berezin.homework.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.berezin.homework.util.MapUtil;

import java.util.HashMap;
import java.util.Map;

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
        return MapUtil.sortMap(map);
    }
}
