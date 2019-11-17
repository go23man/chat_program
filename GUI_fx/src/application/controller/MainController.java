package application.controller;

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.sun.javafx.scene.control.behavior.TabPaneBehavior;
import com.sun.javafx.scene.control.skin.TabPaneSkin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@FXML
	private Button btn_login;
	@FXML
	private Button btn_logout;
	@FXML
	private Button btn_groupchat;
	@FXML
	private Button btn_chat_1;
	@FXML
	private Button btn_chat_2;
	@FXML
	private Button btn_chat_3;
	@FXML
	private Button btn_chat_4;
	@FXML
	private Button btn_chat_5;
	@FXML
	private Button btn_chat_6;
	@FXML
	private TabPane myTabPane;
	@FXML
	private Tab tab_friend;
	@FXML
	private Tab tab_home;
	@FXML
	private Tab tab_chatlist;
	@FXML
	private AnchorPane anchorpane_chat;
	@FXML
	private Button btn_close;
	@FXML
	private ImageView btn_friendhome_1;
	@FXML
	private ImageView btn_friendhome_2;
	@FXML
	private ImageView btn_friendhome_3;
	@FXML
	private ImageView btn_friendhome_4;
	@FXML
	private ImageView btn_friendhome_5;
	@FXML
	private ImageView btn_friendhome_6;

	int i = 0;

	public void loggedinScreen(ActionEvent event) throws IOException {
		// Stage newStage = new Stage();

		Parent tableViewParent = FXMLLoader.load(getClass().getResource("../view/loggedin.fxml")); // 새 레이아웃 추가(../: 상위
																									// 폴더로 이동)
		Scene tableViewScene = new Scene(tableViewParent); // Scene에 레이아웃 추가

		// getting the stage info
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

		window.setScene(tableViewScene);
		window.show();

		Stage login = (Stage) btn_login.getScene().getWindow();
		// tab_friend.isSelected();
	}

	@FXML
	public void chatScreen(ActionEvent event) throws IOException {
		
		AnchorPane chat = FXMLLoader.load(getClass().getResource("../view/chatscreen.fxml")); // chatscreen.fxml is loaded
		// Scene tableViewScene = new Scene(tableViewParent); // Scene에 레이아웃 추가
		
		// Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		// ArrayList<Integer> tab_num = new ArrayList<Integer>();
		
		Tab chat_tab = new Tab();
        chat_tab.setText("Friend");
        chat_tab.setContent(chat);
        chat_tab.setClosable(true);
       
        myTabPane.getTabs().add(chat_tab);
        
        i++;        
       		        
		myTabPane.getSelectionModel().select(chat_tab);
		
		i = myTabPane.getSelectionModel().getSelectedIndex();
	}
	
		
	public void logout(ActionEvent event) throws IOException {
		
		Parent tableViewParent = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
		Scene tableViewScene = new Scene(tableViewParent); // Scene에 레이아웃 추가
		
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(tableViewScene);
		window.show();
		
		Stage chat = (Stage) btn_logout.getScene().getWindow();
		
	}
	
	public void friendHome(ActionEvent event) throws IOException {
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
