package guru.springframework;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {
    public void testGetHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World".equals(javaHelloWorld.getHello()));
    }

    @Test
    public void testGetHelloJunit() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World", javaHelloWorld.getHello());
    }


}