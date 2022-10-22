package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ImportDocumentsResponse extends StObject {
  
  /** Includes details about skipped documents or any other warnings. */
  var warnings: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ImportDocumentsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ImportDocumentsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1ImportDocumentsResponse](x: Self) {
    
    inline def setWarnings(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
