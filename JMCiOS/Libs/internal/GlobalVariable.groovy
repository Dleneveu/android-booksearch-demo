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
    public static Object app_path
     
    /**
     * <p></p>
     */
    public static Object TEST_CASE_CONTEXT
     
    /**
     * <p></p>
     */
    public static Object reportiumClient
     
    /**
     * <p></p>
     */
    public static Object projectVersion
     
    /**
     * <p></p>
     */
    public static Object projectName
     
    /**
     * <p></p>
     */
    public static Object jobNumber
     
    /**
     * <p></p>
     */
    public static Object jobName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            app_path = selectedVariables['app_path']
            TEST_CASE_CONTEXT = selectedVariables['TEST_CASE_CONTEXT']
            reportiumClient = selectedVariables['reportiumClient']
            projectVersion = selectedVariables['projectVersion']
            projectName = selectedVariables['projectName']
            jobNumber = selectedVariables['jobNumber']
            jobName = selectedVariables['jobName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
