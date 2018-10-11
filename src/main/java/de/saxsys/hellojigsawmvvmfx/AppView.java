package de.saxsys.hellojigsawmvvmfx;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;


public class AppView implements FxmlView<AppViewModel> {

    @FXML
    private VBox appMainBox;

    @InjectViewModel
    private AppViewModel appViewModel;

    public void initialize(){

    }
}
