package qaguru.owner.config;

import java.net.URL;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("webdriver.remote")
    boolean isRemote();

    @Key("webdriver.url")
    URL getURL();

    @Key("webdriver.browser")
    BROWSER getBrowser();

    enum BROWSER {
        CHROME,
        FIREFOX,
        OPERA
    }
}
