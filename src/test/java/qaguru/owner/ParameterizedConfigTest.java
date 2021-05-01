package qaguru.owner;

import qaguru.owner.config.ParameterizedConfig;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParameterizedConfigTest {

    @Test
    public void testParameter() {
        System.setProperty("name", "Sergey");

        ParameterizedConfig config = ConfigFactory
                .create(ParameterizedConfig.class,System.getProperties());

        System.out.println(config.sayHello());

        assertThat(config.sayHello()).endsWith("Sergey!");
    }
}
