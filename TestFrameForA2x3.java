
/**
 * A2x3: Fir - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: Niemals verschiedene Spachen in einem Programm mixen.
 * Oder konkreter: Entweder Variablen und Kommentar in deutsch oder in englisch.
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar hier fuer Erklaerungen und Ausfuehrungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 * Im Rahmen der Aufgabenstellung muessen Sie GUTEN Kommentar schreiben.
 */
public class TestFrameForA2x3 {
    
    // Moegliche Exemplarvariablen bzw. Objekt-spezifische Variablen
    // ... ???
    
    
    
    /**
     * print fir
     * 
     * @param height height of fir
     */
    public void printFir( int height ){
        // Ersetzen Sie diesen Kommentar durch Ihren Code.
        // Geben Sie die letzen drei Zahlen aus.
        // ...
        for( int h=0; h<height; h++ ){
            for( int x=1; x<height-h; x++ )  System.out.print( "." );
            for( int x=0; x<2*h+1;    x++ )  System.out.print( "*" );
            for( int x=1; x<height-h; x++ )  System.out.print( "." );
            System.out.println();
        }//for
    }//method()
    
}//class
