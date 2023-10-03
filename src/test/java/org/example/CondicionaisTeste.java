package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoWindows(){
        Assertions.assertEquals(10, 5+5);
    }

}
