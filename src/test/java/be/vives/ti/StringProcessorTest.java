package be.vives.ti;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {
    StringProcessor sp;
    @BeforeEach
    void setUp() {
        sp = new StringProcessor();
    }
    @Test
    void suffxInString(){
        String str = "abc";
        String suffix = "c";
        assertEquals("abc",sp.appendIfMissing(str,suffix));
    }
}