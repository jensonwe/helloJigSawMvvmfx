module de.saxsys.hellojigsawmvvmfx {

    requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires mvvmfx;

    exports de.saxsys.hellojigsawmvvmfx to javafx.graphics;

    opens de.saxsys.hellojigsawmvvmfx to mvvmfx, javafx.fxml;

}