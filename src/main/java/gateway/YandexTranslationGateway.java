package gateway;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import entities.Translations;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class YandexTranslationGateway {
    private static final String URL = "https://translate.api.cloud.yandex.net/translate/v2/translate";
    private static final String TOKEN = "";
    private static final String ID = "";


    @SneakyThrows
    public Translations getTranslate(String sourceLanguage, String targetLanguage, String textsTranslate) {
        Gson gson = new Gson();
        HttpResponse<String> response = Unirest.post(URL)
                .header("Authorization","Bearer " + TOKEN)
                .queryString("folderId", ID )
                .queryString("sourceLanguageCode", sourceLanguage)
                .queryString("targetLanguageCode", targetLanguage)
                .queryString("texts", textsTranslate)
                .asString();
        String strResponse = response.getBody();
        log.info("response: " + strResponse);
        return gson.fromJson(strResponse, Translations.class);
    }
}