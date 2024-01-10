import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @org.junit.jupiter.api.Test
    void nullResult() {
        Integer result = testing.nullTest(null,null);
        assertNull(result,"result is null");
    }
}