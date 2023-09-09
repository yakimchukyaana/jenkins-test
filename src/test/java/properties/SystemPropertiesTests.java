package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemPropertiesTests {

    @Test
    @Tag("property")
    void systemPropertiesTests(){
        String browser = System.getProperty("browser", "mozilla");
        System.out.println(browser);
    }

    @Test
    @Tag("hello")
    void systemPropertiesTests1(){
        String name = System.getProperty("name","default student");
        String message = format("Hello, %s!", name);

        System.out.println(message);
    }
}
