import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
/**
 * Author: Jack Brashier
 * Date: 10/11/2017
 * Professor: Kanchanawanchai
 */
public class PentAreaCalc extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextInputDialog rReader = new TextInputDialog("r");
        rReader.setTitle("PentAreaCalc");
        rReader.setHeaderText("Area of a Pentagon:");
        rReader.setContentText("Distance between the pentagon's center and the vertex of two of its sides:");
        rReader.showAndWait();
        double r = Integer.parseInt(rReader.getResult());
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
        Alert areaDisplay = new Alert(AlertType.INFORMATION);
        areaDisplay.setTitle("PentAreaCalc");
        areaDisplay.setHeaderText("Area of a Pentagon:");
        areaDisplay.setContentText("The area of the pentagon with r " + r + " and s " + s + " = " + area + ".");
        areaDisplay.showAndWait();
    }
}
