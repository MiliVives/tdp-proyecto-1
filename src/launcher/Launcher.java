package launcher;
import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student yo = new Student(137815, "Vives", "María de los Milagros", "milivives@gmail.com", "https://github.com/MiliVives/tdp-proyecto-1", null);
            	SimplePresentationScreen presentacion = new SimplePresentationScreen(yo);
            	presentacion.setVisible(true);
            }
        });
    }
}