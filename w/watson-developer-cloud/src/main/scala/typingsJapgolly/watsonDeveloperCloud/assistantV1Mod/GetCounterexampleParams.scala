package typingsJapgolly.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getCounterexample` operation. */
trait GetCounterexampleParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The text of a user input counterexample (for example, `What are you wearing?`). */
  var text: String
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object GetCounterexampleParams {
  
  inline def apply(text: String, workspace_id: String): GetCounterexampleParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCounterexampleParams]
  }
  
  extension [Self <: GetCounterexampleParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInclude_audit(value: Boolean): Self = StObject.set(x, "include_audit", value.asInstanceOf[js.Any])
    
    inline def setInclude_auditUndefined: Self = StObject.set(x, "include_audit", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
