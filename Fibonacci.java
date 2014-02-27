package c08_S14S_TI1_P1.aufgabenzettel1_A3;


/*
 * @author <ul><li>Michael Schaefers (Michael.Schaefers@HAW-Hamburg.de)</li></ul>
 */
public class Fibonacci {
    
    public static void main( String[] args ) {
        
        int input=8;                                // "metapher" f�r eingabe
        //
        //pr�fen, ob eingabe okay
        assert ( 0<input && input<=92 ) : "eingabe muss zwischen 1 und 92 liegen!";
        
        
        
        int n=input;                                // anzahl der gew�nschten fibonacci-zahlen
        int i;
        long next=1,fx=0,fy=1;
        
        System.out.printf( "0" );                   // erste fibonacci-zahl ausgeben
        for ( i=2; i<=n; i++ ){                     // 
            System.out.printf( ",%d",  next );      // aktuelle fibonacci-zahl ausgeben
            next = fx+fy;                           // n�chste fibonacci-zahl berechnen und
            fx = fy;                                // werte tauschen
            fy = next;                              // 
        }//for
        
    }//main()
    
}//Fibonacci
