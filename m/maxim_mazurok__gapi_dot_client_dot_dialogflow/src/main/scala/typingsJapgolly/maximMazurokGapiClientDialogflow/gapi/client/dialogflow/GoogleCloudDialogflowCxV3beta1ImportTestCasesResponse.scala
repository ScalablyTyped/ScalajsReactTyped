package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ImportTestCasesResponse extends StObject {
  
  /** The unique identifiers of the new test cases. Format: `projects//locations//agents//testCases/`. */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ImportTestCasesResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ImportTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ImportTestCasesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1ImportTestCasesResponse](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
