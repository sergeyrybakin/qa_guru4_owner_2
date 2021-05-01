package qaguru.owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy
@Config.Sources({
        "classpath:${platform}.properties",
        "file://${HOME}/w/qa_guru_2021/local.properties"
})
public interface MobileConfig extends Config {

    @Key("app.url")
    String appUrl();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();
}
