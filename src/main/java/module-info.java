module org.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens org.example.javafxjdbc to javafx.fxml;
    opens org.example.javafxjdbc.controller to javafx.fxml;
    opens org.example.javafxjdbc.model.entities to javafx.base;
    exports org.example.javafxjdbc;
}