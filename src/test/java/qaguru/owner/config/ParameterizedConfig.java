package qaguru.owner.config;

import org.aeonbits.owner.Config;

public interface ParameterizedConfig extends Config {

    @Config.DefaultValue("hello, ${name}!")
    String sayHello();
}
