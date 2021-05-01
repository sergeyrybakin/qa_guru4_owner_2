package qaguru.owner.config;

import org.aeonbits.owner.Config;

public interface ServiceConfig extends Config {

    @DefaultValue("https://github.com")
    @Key("service.baseUrl")
    String getBaseUrl();

    @DefaultValue("autotester")
    @Key("service.username")
    String getUsername();

    @DefaultValue("Passw0rd!")
    @Key("service.password")
    String getPassword();

}
