package vinicius.joao.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TabelaController {

    @FXML
    private TableView<?> tabelaClassificacao;

    @FXML
    private TableColumn<?, ?> colunaTime;

    @FXML
    private TableColumn<?, ?> colunaPontos;

    @FXML
    private void initialize() {
        // Inicialização da tabela se necessário.
        // Aqui você pode configurar os dados da tabela, se necessário.
    }
}


