package org.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no DB
        LOGGER.info("Inseriu Dados");
    }

    public static void removerDados (Pessoa pessoa){
        //removeu pessoa no DB
        LOGGER.info("Removeu Dados");
    }


}
