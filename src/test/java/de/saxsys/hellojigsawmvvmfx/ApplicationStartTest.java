package de.saxsys.hellojigsawmvvmfx;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import de.saxsys.mvvmfx.testingutils.JfxToolkitExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(JfxToolkitExtension.class)
public class ApplicationStartTest {

    @Test
    void applicationStartsCorrectTest() {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("app");

        ViewTuple<AppView, AppViewModel> viewTuple = FluentViewLoader.fxmlView(AppView.class).resourceBundle(
                resourceBundle).load();

        assertNotNull(viewTuple.getView());
    }
}
