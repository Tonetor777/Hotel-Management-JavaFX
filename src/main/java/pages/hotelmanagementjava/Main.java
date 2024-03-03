package pages.hotelmanagementjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 800);
        stage.setTitle("Hotel Management!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        List<String> lines = CheckinController.readRoomFile("data/room.txt");
//        updateAvailability(lines, true);
//        CheckinController.writeRoomFile("data/room.txt", lines);
        launch();
    }

//    public static void updateAvailability(List<String> lines, boolean newAvailability) {
//        for (int i = 0; i < lines.size(); i++) {
//            String[] parts = lines.get(i).split("/");
//            if (parts.length == 5) {
//                    parts[4] = String.valueOf(newAvailability);
//                    lines.set(i, String.join("/", parts));
//            }
//        }
//    }
}