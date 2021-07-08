/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pptgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Luan
 */
public class FXMLDocumentController implements Initializable {
    //Variaveis
    private int winsCount;
    private int num;
    String[] escs = {"Pedra","Papel","Tesoura"}; //Lista com as Escolhas
    
    @FXML
    private Label wins;
    
    @FXML
    private Button tesoura;

    @FXML
    private Label titleGame;

    @FXML
    private Button pedra;

    @FXML
    private Label relatorio;
    //Método
    private void results(int resultado,int num, int jg){
        switch (resultado) {
            case 1:
                relatorio.setText("Jogador Escolheu: "+escs[jg]+"\nMáquina Escolheu: "+escs[num]+"\nJogador Venceu!");
                winsCount++;
                wins.setText("Vitórias: " + winsCount);
                break;
            case 2:
                relatorio.setText("Jogador Escolheu: "+escs[jg]+"\nMáquina Escolheu: "+escs[num]+"\nEmpate!");
                break;
            default:
                relatorio.setText("Jogador Escolheu: "+escs[jg]+"\nMáquina Escolheu: "+escs[num]+"\nJogador Perdeu!");
                break;
        }
    }
    
    @FXML
    private Button papel;

    @FXML
    void clicouPedra(ActionEvent event) {
        num = Game.gerarNum();
        results(Game.start(0,num),num,0);
        
    }

    @FXML
    void clicouPapel(ActionEvent event) {
        num = Game.gerarNum();
        results(Game.start(1,num),num,1);
    }

    @FXML
    void clicouTesoura(ActionEvent event) {
        num = Game.gerarNum();
        results(Game.start(2,num),num,2);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }      
}
