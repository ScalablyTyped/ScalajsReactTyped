package typingsJapgolly.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wechatMiniprogram.IAPISuccessParam
  - typingsJapgolly.wechatMiniprogram.IAPIError
*/
trait IAPICompleteParam extends StObject
object IAPICompleteParam {
  
  inline def IAPIError(errMsg: String): typingsJapgolly.wechatMiniprogram.IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.IAPIError]
  }
  
  inline def IAPISuccessParam(errMsg: String): typingsJapgolly.wechatMiniprogram.IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.IAPISuccessParam]
  }
}
