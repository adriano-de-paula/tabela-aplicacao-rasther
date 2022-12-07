module com.tecnomotor.tabelarasther {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    exports com.tecnomotor.tabelarasther;
    opens com.tecnomotor.tabelarasther to javafx.fxml;
    exports com.tecnomotor.tabelarasther.controller;
    opens com.tecnomotor.tabelarasther.controller to javafx.fxml;
    exports com.tecnomotor.tabelarasther.model;
    opens com.tecnomotor.tabelarasther.model to javafx.fxml;

}