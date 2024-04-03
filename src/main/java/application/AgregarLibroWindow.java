package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AgregarLibroWindow extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Agregar Libro");

        Label lblTitulo = new Label("Título:");
        Label lblAutor = new Label("Autor:");
        Label lblAnioPublicacion = new Label("Año de Publicación:");
        Label lblCodigo = new Label("Código:");

        TextField txtTitulo = new TextField();
        TextField txtAutor = new TextField();
        TextField txtAnioPublicacion = new TextField();
        TextField txtCodigo = new TextField();

        // Configuración de validación para los campos de entrada
        txtAnioPublicacion.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtAnioPublicacion.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });

        txtCodigo.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtCodigo.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });

        Button btnGuardar = new Button("Guardar");
        Button btnLimpiar = new Button("Limpiar");
        Button btnRegresar = new Button("Regresar");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(lblTitulo, 0, 0);
        gridPane.add(txtTitulo, 1, 0);
        gridPane.add(lblAutor, 0, 1);
        gridPane.add(txtAutor, 1, 1);
        gridPane.add(lblAnioPublicacion, 0, 2);
        gridPane.add(txtAnioPublicacion, 1, 2);
        gridPane.add(lblCodigo, 0, 3);
        gridPane.add(txtCodigo, 1, 3);
        gridPane.add(btnGuardar, 0, 4);
        gridPane.add(btnLimpiar, 1, 4);
        gridPane.add(btnRegresar, 0, 5);

        Scene scene = new Scene(gridPane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
