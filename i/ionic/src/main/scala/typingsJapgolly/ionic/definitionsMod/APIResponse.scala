package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.APIResponseSuccess
  - typingsJapgolly.ionic.definitionsMod.APIResponseError
*/
trait APIResponse extends StObject
object APIResponse {
  
  inline def APIResponseError(error: APIResponseErrorError, meta: APIResponseMeta): typingsJapgolly.ionic.definitionsMod.APIResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.APIResponseError]
  }
  
  inline def APIResponseSuccess(data: APIResponseData, meta: APIResponseMeta): typingsJapgolly.ionic.definitionsMod.APIResponseSuccess = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.APIResponseSuccess]
  }
}
