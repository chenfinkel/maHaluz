package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        IScheduleAlgorithm isa = new mySchedulingAlgorithm();
        TimeTableBuilder ttb = new TimeTableBuilder(isa);
        List<Course> myCourses = getCourses();
        for (Course c : myCourses){
            ttb.addCourse(c);
        }
        Course[][] table = ttb.build();
    }

    public static List<Course> getCourses(){
        List<Course> courses = new ArrayList<>();
        return courses;
    }
}
