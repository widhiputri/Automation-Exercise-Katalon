package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseURL
     
    /**
     * <p></p>
     */
    public static Object loginEmail
     
    /**
     * <p></p>
     */
    public static Object loginPassword
     
    /**
     * <p></p>
     */
    public static Object userName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            baseURL = selectedVariables['baseURL']
            loginEmail = selectedVariables['loginEmail']
            loginPassword = selectedVariables['loginPassword']
            userName = selectedVariables['userName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
