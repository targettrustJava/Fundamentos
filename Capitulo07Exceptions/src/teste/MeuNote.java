package teste;

import javax.swing.JFrame;  
import javax.swing.JTextArea;  
  
public class MeuNote extends JFrame {  
  /**
	 * 
	 */
	private static final long serialVersionUID = -4986856489620554277L;
/* Componentes devem estar no contexto da inst�ncia,  
  para que possam ser acessados em todos os m�todos  
  n�o-est�ticos da classe  
  */  
  private JTextArea texto = new JTextArea ();  
    
  public MeuNote () {  
    // Define o t�tulo da janela  
    super ("Meu Notepad");  
    this.montaJanela ();  
  }  
    
  private void montaJanela () {  
    this.getContentPane (). add (texto);  
  }  
    
  public static void main (String [] args) {  
    // Cria objeto:  
      MeuNote janela = new MeuNote (); 
      janela.setVisible (true); 
      janela.setSize (640, 480);  
  }  
}   
