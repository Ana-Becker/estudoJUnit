package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {
    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Julia",
                LocalDate.of(2000, 1, 1));

        Assertions.assertEquals(23, pessoa.getIdade());
    }

    @Test
    void retornarSeEhMaiorDeIdade(){
        Pessoa pessoa1 = new Pessoa("Joao",
                LocalDate.of(2000, 1, 1));

        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());
    }
}
