package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Getter
@Builder
public class Translations {

    @SerializedName("translations")
    public List<Translation> translations;



}
