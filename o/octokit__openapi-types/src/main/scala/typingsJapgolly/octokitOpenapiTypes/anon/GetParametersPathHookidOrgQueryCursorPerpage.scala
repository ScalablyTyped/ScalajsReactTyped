package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidOrgQueryCursorPerpage extends StObject {
  
  /** Returns a list of webhook deliveries for a webhook configured in an organization. */
  var get: ParametersPathHookidOrgQueryCursorPerpage
}
object GetParametersPathHookidOrgQueryCursorPerpage {
  
  inline def apply(get: ParametersPathHookidOrgQueryCursorPerpage): GetParametersPathHookidOrgQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidOrgQueryCursorPerpage]
  }
  
  extension [Self <: GetParametersPathHookidOrgQueryCursorPerpage](x: Self) {
    
    inline def setGet(value: ParametersPathHookidOrgQueryCursorPerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
