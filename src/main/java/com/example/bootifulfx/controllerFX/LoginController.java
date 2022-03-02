package com.example.bootifulfx.controllerFX;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@RequiredArgsConstructor
@Component
public class LoginController {

    @FXML
    public TextField userName;



    public void loadNewRoom() throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getClassLoader().getResource("mainWindow-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//
//        MainChatController mainChatController = fxmlLoader.getController();
//        mainChatController.setUserName(userName.getText());
//        mainChatController.setRoomNumber(new Random().nextInt(100));
//        //mainChatController.listenForMessage();
//        Stage stage = ((Stage)userName.getScene().getWindow());
//        stage.setScene(scene);

        Stage stage = ((Stage)userName.getScene().getWindow());
        ClassPathResource fxml = new ClassPathResource("/mainWindow-view.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(fxml.getURL());
        //fxmlLoader.setControllerFactory(this.applicationContext::getBean);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }
}
