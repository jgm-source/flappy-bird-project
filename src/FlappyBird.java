import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList; //Esses três primeiro vão ser usados para criar a interface gráfica do jogo
import java.util.Random; //Para colocar os tubos em posições aleatórias
 import javax.swing.*;

public class FlappyBird extends JPanel {
    int LarguraBorda = 360;
    int AlturaBorda = 640;

    FlappyBird() {
       setPreferredSize(new Dimension(LarguraBorda, AlturaBorda)); 
       setBackground(Color.blue);
    }   
}
   
