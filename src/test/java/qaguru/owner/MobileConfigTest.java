package qaguru.owner;

import qaguru.owner.config.MobileConfig;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileConfigTest {

    //Запускать по отдельности!
    @Test
    public void testAndroid () {
        System.setProperty("platform","android");

        MobileConfig mobileConfig = ConfigFactory
                .create(MobileConfig.class, System.getProperties());

        assertThat(mobileConfig)
                .extracting(MobileConfig::appUrl, MobileConfig::platformName, MobileConfig::platformVersion)
                .contains("https://ci.server.com/android","android", "11");
    }

    //Запускать по отдельности!
    @Test
    public void testIOS () {
        System.setProperty("platform","ios");

        MobileConfig mobileConfig = ConfigFactory
                .create(MobileConfig.class, System.getProperties());

        assertThat(mobileConfig)
                .extracting(MobileConfig::appUrl, MobileConfig::platformName, MobileConfig::platformVersion)
                .contains("https://ci.server.com/ios","ios", "13");
    }

    //Запускать по отдельности!
    @Test
    public void testLocalProperties () {
//        System.setProperty("platform","android");

        MobileConfig mobileConfig = ConfigFactory
                .create(MobileConfig.class, System.getProperties(), System.getenv());

        assertThat(mobileConfig)
                .extracting(MobileConfig::appUrl, MobileConfig::platformName, MobileConfig::platformVersion)
                .contains("https://ci.server.com/android","android", "19");
    }
}
