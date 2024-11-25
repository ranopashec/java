package stage2.services;
import java.util.*;

public class AppLocale {
    private static final String strMsg = "Msg";
    private static Locale loc = Locale.getDefault();
    private static ResourceBundle res =
            ResourceBundle.getBundle( AppLocale.strMsg, AppLocale.loc );

    public static Locale get() {
        return AppLocale.loc;
    }

    public static void set(Locale loc) {
        AppLocale.loc = loc;
        res = ResourceBundle.getBundle( AppLocale.strMsg, AppLocale.loc );
    }

    static ResourceBundle getBundle() {
        return AppLocale.res;
    }

    public static String getString(String key) {
        return AppLocale.res.getString(key);
    }

    public static final String Atlant = "Atlant";
    public static final String Samsung = "Samsung";
    public static final String LG = "LG";
}