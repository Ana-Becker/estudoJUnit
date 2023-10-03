package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosPessoaTeste {

    @BeforeAll
    static void configurarConexao (){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void inserirDados(){
        BancoDeDados.insereDados(new Pessoa("Joao", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    void removerDados(){
        BancoDeDados.removerDados(new Pessoa("Joao", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno (){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao (){
        BancoDeDados.finalizarConexao();
    }


}
