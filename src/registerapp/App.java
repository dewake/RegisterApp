package registerapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class App extends Application {

    static Stage appStage = null;

    public static int register(String name, String mobile, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int login(String name, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start(Stage stage) throws IOException {

        appStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/views/Login.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("First App");
        stage.show();
    }

    public static void change(String path, String title) {
        Parent root;
        try {
            root = FXMLLoader.load(App.class.getClass().getResource(path));
            Scene scene = new Scene(root);

            appStage.setScene(scene);
            appStage.setTitle(title);

            appStage.hide();
            appStage.show();
        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        /*  String tempdata = "welcome youth\nYou are in java";
        writeData("sultan.txt", tempdata);
        String res = readData("sultan.txt");
        System.out.println(res);
        
        writeText("saleh.txt", tempdata);
          res = readText("saleh.txt");
        System.out.println(res);
         */
        launch(args);
    }

    public static void writeData(String fileName, String data) {

        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            //   BufferedWriter bb=new BufferedWriter(new FileWriter(new File(fileName)));
            bw.write(data);

            bw.close();
        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public static String readData(String fileName) {
        String data = "", temp = "";

        try {
            File file = new File(fileName);
            FileReader fw = new FileReader(file);
            BufferedReader bw = new BufferedReader(fw);
            while ((temp = bw.readLine()) != null) {
                data += temp + "\n";
                System.out.println(temp);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return data;
    }

    public static String readText(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public static void writeText(String fileName, String data) {
        try {
            Files.write(Paths.get(fileName), data.getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static File chooseFile() {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(appStage);
        return file;

    }

}
