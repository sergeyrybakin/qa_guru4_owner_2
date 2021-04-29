package qaguru.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
/*
It was created only as example! Don't use it!
 */
public class SystemPropertiesTest {

    @BeforeEach
    public void initProperties() {
        System.setProperty("browser", "chrome");
    }

    @Test
    public void testSystemProerties() {
        String browser = System.getProperty("browser");
        assertThat(browser).isEqualTo("chrome");
    }
}
