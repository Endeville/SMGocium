package bg.smgocium.models.enities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Colour {
    WHITE("#FFFFFF"),
    LIGHT_GREY("#E4E4E4"),
    GREY("#888888"),
    BLACK("#222222"),
    PINK("#FFA7D1"),
    RED("#E50000"),
    ORANGE("#E59500"),
    BROWN("#A06A42"),
    YELLOW("#E5D900"),
    LIGHT_GREEN("#94E044"),
    GREEN("#02BE01"),
    CYAN("#00D3DD"),
    LIGHT_BLUE("#0083C7"),
    BLUE("#0000EA"),
    LIGHT_PURPLE("#CF6EE4"),
    PURPLE("#820080");

    private final String hexCode;
}
