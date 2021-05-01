package qaguru.owner.config;

import java.net.URL;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean isRemote();

    @DefaultValue("http://localhost:4444/wd/hub")
    @Key("webdriver.url")
    URL getURL();

    @DefaultValue("CHROME")
    @Key("webdriver.browser")
    BROWSER getBrowser();

    enum BROWSER {
        CHROME,
        FIREFOX,
        OPERA
    }
}
