package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainBibliotecaWindow extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gestor de biblioteca");

        Button btnAgregarLibro = new Button("Agregar Libro");
        Button btnEliminarLibro = new Button("Eliminar Libro");
        Button btnModificarLibro = new Button("Modificar Libro");
        Button btnBuscarLibro = new Button("Buscar Libro");
        Button btnPrestamo = new Button("Prestamo");

        // Manejador de evento para el botón "Agregar Libro"
        btnAgregarLibro.setOnAction(event -> {
            AgregarLibroWindow agregarLibroWindow = new AgregarLibroWindow();
            Stage stage = new Stage();
            agregarLibroWindow.start(stage);
        });

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(btnAgregarLibro, btnEliminarLibro, btnModificarLibro, btnBuscarLibro, btnPrestamo);

        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
