package ru.testing;


import entities.Translations;
import gateway.YandexTranslationGateway;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Slf4j
public class YandexTranslationTest {
    private static final String sourceLanguage = "en";
    private static final String targetLanguage = "ru";
    private static final String textTranslate = "Hello World!";
    private static final String textAfterTranslate = "Всем Привет!";

    @Test
    @DisplayName("Перевод текста")
    public void getTranslateTest(){
        YandexTranslationGateway YandexTranslationGateway = new YandexTranslationGateway();
        Translations translation = YandexTranslationGateway.getTranslate(sourceLanguage,targetLanguage,textTranslate);
        String str = translation.getTranslations().get(0).text;
        Assertions.assertEquals(str, textAfterTranslate);

    }
}