package requiredBitSizeComputer;


import stuffYouDontHaveToUnderstand.Version;


/**
 * Required Bit Size Computer - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class RequiredBitSizeComputer {
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
     * compute required bit size to code positive number
     * 
     * @param number  the number for that the required bit size shall be computed
     * @return required bit size to compute number
     */
    public int computeBitSize( final long number ){
        assert 0<=number : "negative numbers are NOT supported"; 
        
        int resu = 1;
        
        long remaining  = number;
        while( 1 < remaining ){
            remaining = remaining / 2;                // Die Studenten k(o)ennen ">>=1" noch nicht (wirklich)
            resu++;
        }//while
        
        return resu;
    }//method()
    
}//class
