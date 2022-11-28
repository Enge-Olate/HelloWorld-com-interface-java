/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariologin;

import com.sun.javafx.scene.SceneUtils;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Márcio Olate
 */
public class FormularioLogin extends Application {
    
   @Override
   public void start(Stage primeiroStage){
       primeiroStage.setTitle("Formulário para login");
       primeiroStage.show();
       
       GridPane grade = new GridPane();
       grade.setAlignment(Pos.CENTER);
       grade.setHgap(10);
       grade.setVgap(10);
       grade.setPadding(new Insets(25,25,25,25));
       
       Scene tela = new Scene(grade,300,275);
       primeiroStage.setScene(tela);
       tela.getStylesheets().add(FormularioLogin.class.getResource("formularioLogin.css").toExternalForm());
       primeiroStage.show();
       Text sceText = new Text("Entre");
       
       sceText.setId("Entre-text");//ID, para se trabalhar no css.
      // sceText.setFont(Font.font("Verdana",FontWeight.NORMAL,20));
       grade.add(sceText, 0, 0,2,1);
       
       Label nomeUsuario = new Label("Nome de usuário");
       nomeUsuario.setId("nome-text");
       grade.add(nomeUsuario,0,1);
       
       TextField campoTextoUsuario = new TextField();
       grade.add(campoTextoUsuario,1,1);
       
       Label senha = new Label("senha:");
       senha.setId("senha-text");
       grade.add(senha,0,2);
       
       PasswordField caixaSenha = new PasswordField();
       grade.add(caixaSenha,1,2);
       
       Button botao = new Button("Logar");
       HBox hbbotao = new HBox(10);
       hbbotao.setAlignment(Pos.BOTTOM_RIGHT);
       hbbotao.getChildren().add(botao);
       grade.add(hbbotao,1,4);
       
       final Text acao = new Text();
       grade.add(acao,1,6);
        
       botao.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
 
               acao.setText("Logado");
               acao.setFill(color(0, 0-1, 0));
               
           }
          
             
       });
       /*Scene cena = new Scene(grade, 300, 275);
       primeiroStage.setScene(cena);
       cena.getStylesheets().add(FormularioLogin.class.getResource("formulurioLogin.css").toExternalForm());
       primeiroStage.show();*/
   }
    
}
