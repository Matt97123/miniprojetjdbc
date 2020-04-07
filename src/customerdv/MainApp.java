package customerdv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("view/viewRdv.fxml"));
            primaryStage.getIcons().add(new Image("file:resources/planning_18.png"));
            primaryStage.setTitle("CustomeRdv");

            primaryStage.setScene(new Scene(root, 600, 450));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showViewSearch() {
        Stage dialogStage = new Stage();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("view/viewSearch.fxml"));
            dialogStage.getIcons().add(new Image("file:resources/planning_18.png"));
            dialogStage.setTitle("CustomeRdv");

            dialogStage.setScene(new Scene(root, 600, 450));
            dialogStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) { launch(args); }
}
