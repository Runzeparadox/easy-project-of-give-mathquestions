import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.util.Random;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    TextArea textArea = new TextArea();
    automath mat = new automath();
    String a=mat.sss();
    String all[] = {"做数学题","读10分钟故事书","做眼保健操","写拼音","看3分钟手机"};
    Random random = new Random();
    int num = random.nextInt(4);
    // 将随机数映射到abc三个字母之一
    String all2[] = {"做数学题","跳绳100下","做眼保健操","看10分钟手机","看3分钟手机"};
    Random random2 = new Random();
    int num2 = random2.nextInt(4);
    String contents = all[num] + "\n" + all2[num2]+"\n"+"-------------------------------"+"\n"+"\n"+a;

    Scene scene = new Scene(textArea, 5000, 700);
    primaryStage.setTitle("幸运抽抽抽");
    primaryStage.setScene(scene);
    primaryStage.show();
    textArea.setStyle("-fx-background-color: green; -fx-text-fill: black; -fx-font-size: 50pt;");
    textArea.setText(contents);
    textArea.appendText("");
    textArea.setStyle(textArea.getStyle()+"; -fx-text-fill: black;");


  }
}
