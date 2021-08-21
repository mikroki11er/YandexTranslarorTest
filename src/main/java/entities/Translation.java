package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Translation {

    @SerializedName("text")
    public String text;

    @SerializedName("detectedLanguageCode")
    public String detectedLanguageCode;

}
