// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package stuffYouDontHaveToUnderstand;


import java.io.Serializable;
import java.lang.module.ModuleDescriptor;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;


/**
 * Task: For information see ReadMe.txt resp. task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class EnvironmentAnalyzer implements Serializable {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2023_02_28__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    final static private long  serialVersionUID = version.getVersionNumber();
    
    
    
    
    
    /**
     * Determine if assert is enabled for JVM.
     * 
     * @return <code>true</code> if assert is enabled,
     *         <code>false</code> otherwise.
     */
    public static boolean assertEnabled(){
        try {
            assert false : "ASSERT IS ENABLED";
            throw new RuntimeException( "ASSERT IS DISABLED" );
        }catch( final Throwable ex ){
            if( ex instanceof AssertionError ){
                return true;
            }else{
                return false;
            }//if
        }//try
    }//method()
    
    /**
     * Determine number of available cores
     * 
     * @return number of available cores
     */
    public static int getAvailableCores() {
        return Runtime.getRuntime().availableProcessors();
    }//method()
    
    /**
     * Determine Java version
     * 
     * @return java version
     */
    public static String getJavaVersion(){
        final String rawVersion = System.getProperty( "java.version" );
        if( rawVersion.startsWith("1.") ){
            return String.format( "%s (%s)",  rawVersion.substring( 2 ), rawVersion );
        }else{
            return rawVersion;
        }//if
    }// method()
    // Note:
    // Use "Runtime.version()" instead?  (available since Java9)
    
    /**
     * Determine (JUnit-) Jupiter version
     * 
     * @return Jupiter version
     */
    public static String getJUnitJupiterVersion(){
        final String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        try{
            final Class<Test> testClass = org.junit.jupiter.api.Test.class;
            final Module module = testClass.getModule();
            if( null != module ){
                final ModuleDescriptor moduleDescriptor = module.getDescriptor();
                if( null != moduleDescriptor ){
                    final Optional<ModuleDescriptor.Version> optionalVersion = moduleDescriptor.version();
                    if( optionalVersion.isPresent() ){
                        return optionalVersion.get().toString();
                    }//if
                }//if
            }//if
            final Package pakage = testClass.getPackage();
            if( null != pakage ){
                final String version = pakage.getImplementationVersion();
                if( null != version ){
                    return version;
                }//if
            }//if
        }catch( final Exception ex ){
            final StringBuilder sb = new StringBuilder();
            sb.append( "\n\n" );
            sb.append( "UNEXPECTED probably JUnit5 related exception occurred in :  " );
            sb.append( methodName );
            sb.append( "\n" );
            sb.append( "message :  " );
            sb.append( ex.getMessage() );
            sb.append( "\n" );
            Herald.proclaimError( sb );
            ex.printStackTrace();
            Herald.proclaimError( "\nCall advisor.\n\n" );
        }//try
        return "??? <- could not be determined as result of an unexpected exception";
    }//method()
    //
    /**
     * Determine (JUnit-) Platform version<br />
     * Attention: Access to JUnitPlatform is deprecated!
     * (* Warum tut sich JUnit immer so schwer auf einfache&zeitlose(!) Weise die Version zur Verfügung zu stellen? *)
     * 
     * @return (JUnit-) Platform version
     */
    public static String getJUnitPlatformVersion(){
        final String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        try{
            final Class<JUnitPlatform> jUnitPlatformClass = org.junit.platform.runner.JUnitPlatform.class;  // deprecated: JUnit ist die Hölle - wie kommt man einfach&zeitlos an die Version?
            final Module module = jUnitPlatformClass.getModule();
            if( null != module ){
                final ModuleDescriptor moduleDescriptor = module.getDescriptor();
                if( null != moduleDescriptor ){
                    final Optional<ModuleDescriptor.Version> optionalVersion = moduleDescriptor.version();
                    if( optionalVersion.isPresent() ){
                        return optionalVersion.get().toString();
                    }//if
                }//if
            }//if
            final Package pakage = jUnitPlatformClass.getPackage();
            if( null != pakage ){
                final String version = pakage.getImplementationVersion();
                if( null != version ){
                    return version;
                }//if
            }//if
        }catch( final Exception ex ){
            final StringBuilder sb = new StringBuilder();
            sb.append( "\n\n" );
            sb.append( "UNEXPECTED probably JUnit5 related exception occurred in :  " );
            sb.append( methodName );
            sb.append( "\n" );
            sb.append( "message :  " );
            sb.append( ex.getMessage() );
            sb.append( "\n" );
            Herald.proclaimError( sb );
            ex.printStackTrace();
            Herald.proclaimError( "\nCall advisor.\n\n" );
        }//try
        return "??? <- could not be determined as result of an unexpected exception";
    }//method()
    
}//class
//see: https://stackoverflow.com/questions/59377304/accessing-junit-version-during-runtime
