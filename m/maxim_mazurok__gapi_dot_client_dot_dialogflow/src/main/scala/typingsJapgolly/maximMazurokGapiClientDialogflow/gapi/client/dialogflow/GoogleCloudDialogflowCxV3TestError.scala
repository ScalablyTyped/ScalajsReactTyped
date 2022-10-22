package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TestError extends StObject {
  
  /** The status associated with the test. */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** The test case resource name. */
  var testCase: js.UndefOr[String] = js.undefined
  
  /** The timestamp when the test was completed. */
  var testTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3TestError {
  
  inline def apply(): GoogleCloudDialogflowCxV3TestError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TestError]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TestError](x: Self) {
    
    inline def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestCase(value: String): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
    
    inline def setTestTime(value: String): Self = StObject.set(x, "testTime", value.asInstanceOf[js.Any])
    
    inline def setTestTimeUndefined: Self = StObject.set(x, "testTime", js.undefined)
  }
}
