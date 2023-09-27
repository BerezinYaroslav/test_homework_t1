package ru.berezin.homework.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.berezin.homework.service.MainService;

import java.util.Map;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class MainController {
    private final MainService service;

    @GetMapping("/{string}")
    public Map<String, Integer> sendData(@PathVariable @NonNull String string) {
        return service.analyseString(string);
    }
}
