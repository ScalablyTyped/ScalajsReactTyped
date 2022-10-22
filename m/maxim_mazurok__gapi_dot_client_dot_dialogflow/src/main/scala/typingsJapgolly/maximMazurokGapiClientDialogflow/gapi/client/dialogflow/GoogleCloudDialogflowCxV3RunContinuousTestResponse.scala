package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RunContinuousTestResponse extends StObject {
  
  /** The result for a continuous test run. */
  var continuousTestResult: js.UndefOr[GoogleCloudDialogflowCxV3ContinuousTestResult] = js.undefined
}
object GoogleCloudDialogflowCxV3RunContinuousTestResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3RunContinuousTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RunContinuousTestResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3RunContinuousTestResponse](x: Self) {
    
    inline def setContinuousTestResult(value: GoogleCloudDialogflowCxV3ContinuousTestResult): Self = StObject.set(x, "continuousTestResult", value.asInstanceOf[js.Any])
    
    inline def setContinuousTestResultUndefined: Self = StObject.set(x, "continuousTestResult", js.undefined)
  }
}
