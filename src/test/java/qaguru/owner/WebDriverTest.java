package qaguru.owner;

import qaguru.owner.config.WebDriverConfig;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class WebDriverTest {

    private  WebDriver driver;

    @BeforeEach
    public void initDriver() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        initWebDriver(config);
    }

    @Test
    public void testWebDriver() {
        driver.get("https://github.com");
        assertThat(driver.getTitle())
                .isEqualTo("GitHub: Where the world builds software · GitHub");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

    private void initWebDriver(WebDriverConfig webDriverConfig) {
        if (webDriverConfig.isRemote()) {
            DesiredCapabilities capabilities;
            switch (webDriverConfig.getBrowser()) {
                case CHROME: {
                    capabilities = DesiredCapabilities.chrome();
                }
                case FIREFOX: {
                    capabilities = DesiredCapabilities.firefox();
                    break;
                }
                case OPERA: {
                    capabilities = DesiredCapabilities.opera();
                    break;
                }
                default: {
                    capabilities = DesiredCapabilities.chrome();
                    break;
                }
            }
            driver = new RemoteWebDriver(webDriverConfig.getURL(), capabilities);
        } else {
            driver = new ChromeDriver();
        }
    }
}
