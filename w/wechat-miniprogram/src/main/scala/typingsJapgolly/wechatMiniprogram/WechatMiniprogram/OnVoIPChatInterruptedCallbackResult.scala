package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnVoIPChatInterruptedCallbackResult extends StObject {
  
  /** 错误码 */
  var errCode: Double
  
  /** 调用结果（错误原因） */
  var errMsg: String
}
object OnVoIPChatInterruptedCallbackResult {
  
  inline def apply(errCode: Double, errMsg: String): OnVoIPChatInterruptedCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnVoIPChatInterruptedCallbackResult]
  }
  
  extension [Self <: OnVoIPChatInterruptedCallbackResult](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
