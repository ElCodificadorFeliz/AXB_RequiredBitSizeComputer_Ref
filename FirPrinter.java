
/**
 * A2x3: Fir Printer - see task
 * 
 * @author   Michael Schäfers ; P1@Hamburg-UAS.eu 
 * @version  2015/10/28
 */
public class FirPrinter {
    
    /**
     * print fir
     * 
     * @param height height of fir
     */
    public void printFir( int height ){
        // Vermutlich ist "ab 1" fuer Anfaenger angenehmer - "ab 0" ist aber ausdruecklich auch ok - wenn alles stimmt ;-)
        for( int h=1; h<=height; h++ ){                                         // HIER gehoert eine Abzählschleife (for) hin
            // 1. Variante
            for( int x=1; x<=height-h; x++ )  System.out.print( "." );          // HIER gehoert eine Abzählschleife (for) hin
            for( int x=1; x<=2*h-1;    x++ )  System.out.print( "*" );          // HIER gehoert eine Abzählschleife (for) hin
            for( int x=1; x<=height-h; x++ )  System.out.print( "." );          // HIER gehoert eine Abzählschleife (for) hin
            
            /*
            // 2.Variante
            for( int x=1; x<=2*height-1; x++ ){
                if( height-h<x  &&  x<height+h ){
                    System.out.print( "*" );
                }else{
                    System.out.print( "." );
                }//if
            }//for
            */
            System.out.println();
        }//for
    }//method()
    
}//class
