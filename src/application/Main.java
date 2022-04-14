package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application implements EventHandler<ActionEvent> {
	/*
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane(); //Layout
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	/*
	@Override    
    public void start(Stage primaryStage) throws Exception { 
         
        Label label1 = new Label("This is the Center section");
        Label label2 = new Label("This is the Top-most section");
        Label label3 = new Label("This is the Right section");
        Label label4 = new Label("This is the Bottom section");
        Label label5 = new Label("This is the Left section");
             
        BorderPane layout = new BorderPane(label1, label2, label3, label4, label5); //Layout avec 5 zones
        //layout.getChildren().addAll(label1, label2, label3, label4, label5);
        
        
        layout.setPadding(new Insets(20, 20, 20, 20));  
  
        layout.setAlignment(label2, Pos.CENTER); 
        layout.setAlignment(label3, Pos.CENTER); 
        layout.setAlignment(label4, Pos.CENTER); 
        layout.setAlignment(label5, Pos.CENTER); 

        Scene scene = new Scene(layout, 500, 600);  
 
        primaryStage.setTitle("Application avec Java FX ULT 2022");
        primaryStage.setScene(scene);   
        primaryStage.show();    
    }*/
	/*
	@Override    
    public void start(Stage primaryStage) throws Exception { 
     
        Button Button1 = new Button("Button1"); 
        Button Button2 = new Button("Button2"); 
        Button Button3 = new Button("Button3"); 
             
        VBox layout = new VBox(Button1, Button2, Button3);
        layout.setAlignment(Pos.BASELINE_CENTER);
        //layout.setPadding(new Insets(20, 20, 20, 20)); 
        layout.setSpacing(30);
        Scene scene = new Scene(layout, 300, 300);  
 
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();    
    }*/
	/*
	 @Override    
	    public void start(Stage primaryStage) throws Exception { 
	        StackPane layout = new StackPane();
	         
	        Scene scene = new Scene(layout, 300, 300);
	         
	        Button button = new Button("Hello World");
	         
	        layout.getChildren().addAll(button);
	         
	        primaryStage.setTitle("CodersLegacy");
	        primaryStage.setScene(scene);   
	        primaryStage.show();
	    }*/
	
	Button btn;
	TextField txtNom;
	
	@Override    
    public void start(Stage primaryStage) throws Exception { 
		
		Label nom = new Label("Taper votre nom"); 
        txtNom = new TextField(); 
        btn = new Button("Cliquer"); 
             
        VBox layout = new VBox(nom, txtNom, btn);
        layout.setAlignment(Pos.BASELINE_CENTER);
        //layout.setPadding(new Insets(20, 20, 20, 20)); 
        layout.setSpacing(30);
        Scene scene = new Scene(layout, 300, 300);  
        //StackPane layout = new StackPane();
         
        //Scene scene = new Scene(layout, 300, 300);
         
        //button = new Button("Hello World");
        btn.setOnAction(this);
         
        //layout.getChildren().addAll(button);
         
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();
    }
     
    public void handle(ActionEvent event) {
        if(event.getSource() == btn) {
            System.out.println("Vous avez taper = " +txtNom.getText());
        }
        //if(event.getSource() == button2) {
            //System.out.println("A commented out code block");
        //}
             
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
