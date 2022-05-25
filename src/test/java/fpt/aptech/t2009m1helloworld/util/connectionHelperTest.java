package fpt.aptech.t2009m1helloworld.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class connectionHelperTest {

    @Test
    void getConnection() {
        assertNotEquals(null, connectionHelper.getConnection());
    }
}