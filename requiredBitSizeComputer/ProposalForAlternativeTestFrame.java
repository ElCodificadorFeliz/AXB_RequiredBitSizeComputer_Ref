package requiredBitSizeComputer;


import stuffYouDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffYouDontHaveToUnderstand.GivenCodeVersion;
import stuffYouDontHaveToUnderstand.Version;


//###
//### Wenn Sie einen eigenen TestFrame entwickeln - was ausdruecklich gut waere
//### dann sollten Sie den Klassennamen (mit "Refactoring") aendern
//### Z.B. in  MyAlternativeTestFrame
//###
//### Ein Nachteil des gestellten TestFrames besteht darin, dass er interaktiv ist
//### und damit fuer reproduzierbare Testlaeufe eigentlich NICHT geeignet ist.
//### "Hier" sollten Sie Tests entwickeln, die leicht reproduzierbar sind,
//### damit Sie im Falle eines gefundenen Fehlers auch (leicht) testen koennen, dass Sie
//###   1.) den Fehler wirklich korrigiert und
//###   2.) keine neuen Fehler bei bereits sicheren Code eingebaut
//### haben.
//###
/**
 * Your alternative TestFrame for Required Bit Size Computer
 * 
// @author  (your name(s))  based on template from Michael Schaefers
// @version (a version number or a date)
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class ProposalForAlternativeTestFrame {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2023_02_28__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * Get decoded version of code {@link TestFrameAutomated}
     * 
     * @return decoded version
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        
        // print some information at start
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    TestFrame version:      %s\n",  version.getDecodedVersion() );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.assertEnabled() );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Start of actual test(s)\n" );
        System.out.printf( "=======================\n" );
        System.out.printf( "\n" );
        //
        System.out.flush();
        
        
        
        
        
        try{
            final RequiredBitSizeComputer requiredBitSizeComputer = new RequiredBitSizeComputer();
            
            
            
            //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
            // Sofern Sie kein Vorwissen und/oder NICHT wissen was Sie tun
            // fuehren Sie (bis auf die Aenderung des Klassennamens)
            // KEINE Aenderungen oberhalb dieser Zeilen durch
            //###
            //###
            //###
            //###   HIER kommt Ihr Code zum Testen hin ;-)
            //###
            //###                    VVVV
            //###                    VVVV
            //###                    VVVV
            //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
            //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
            //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
            //###            VVVVVVVVVVVVVVVVVVVV
            //###               VVVVVVVVVVVVVV
            //###                  VVVVVVVV
            //###                     VV
            
            
            
            // Z.B. bzw. nur als erste Start-Idee/Anregung, wie so etwas aussehen koennte
            // Es sollten die Zahlen auf den "Grenzen" genommen werden - also (2^n)-1 und 2^n
            long number;
            int bitSize;
            //
            number = 0;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 1;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 2;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 3;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );            //...
            //
            number = 4;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 255;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 256;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 140737488355328L;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 281474976710655L;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 9223372036854775807L;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );            
            
            
            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
            // fuehren Sie KEINE Aenderungen unterhalb dieser Zeilen durch.
            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            //
            System.out.printf( "\n\n" );
            System.out.printf( "THIS IS THE END" );
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                System.out.flush();
                System.err.printf( "###\n" );
                System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
                System.err.printf( "###\n" );
                System.err.printf( "\n" );
            }//if
            throw( ex );
        }//try
        
    }//method()
    
}//class
