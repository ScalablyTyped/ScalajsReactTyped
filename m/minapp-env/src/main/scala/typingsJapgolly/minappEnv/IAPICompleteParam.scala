package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minappEnv.IAPISuccessParam
  - typingsJapgolly.minappEnv.IAPIError
*/
trait IAPICompleteParam extends StObject
object IAPICompleteParam {
  
  inline def IAPIError(errMsg: java.lang.String): typingsJapgolly.minappEnv.IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.minappEnv.IAPIError]
  }
  
  inline def IAPISuccessParam(errMsg: java.lang.String): typingsJapgolly.minappEnv.IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.minappEnv.IAPISuccessParam]
  }
}
