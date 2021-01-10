//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.AnchorPane;
//import javafx.stage.Stage;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.net.Socket;
//
//public class ClientRegisterController {
//    public TextField txtId;
//    static String id;
//    static DataOutputStream dataOutputStream;
//    static DataInputStream dataInputStream;
//    public AnchorPane root;
//    static String infor;
//
//    public void btnConnectOnAction(ActionEvent actionEvent) {
//
//        try{
//            id=txtId.getText();
//
//            Socket socket=new Socket("localhost",5000);
//            dataInputStream=new DataInputStream(socket.getInputStream());
//            dataOutputStream=new DataOutputStream(socket.getOutputStream());
//
//            dataOutputStream.writeUTF(id);
//
//            String i=new DataInputStream(socket.getInputStream()).readUTF();
//
//            if (i.equals("You are already Registered")){
//                new Alert(Alert.AlertType.INFORMATION,"You are already Registered!", ButtonType.OK).show();
//            }else {
//               // new MyClientController(id,socket);
//
//                Stage stage= (Stage) this.root.getScene().getWindow();
//                stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("MyClient.fxml"))));
//                stage.centerOnScreen();
//            }
//
//
//        }catch (Exception ex){
//            ex.getStackTrace();
//        }
//    }
//}
