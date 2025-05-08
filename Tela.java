import javax.swing.*;

public class Tela extends JFrame {
    public Tela(){
        setTitle("Gerenciador de Equipamentos");
        setVisible(true); //permite que a tela seja visível
        setSize(800, 500); //tamanho da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //faz com que o programa encerre assim que fechar a tela
        setLocationRelativeTo(null); //quando ele abrir, vai pro meio da tela

    }
}
