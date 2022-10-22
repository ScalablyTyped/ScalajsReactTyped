package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 文件描述符 */
  var fd: String
}
object OpenSuccessCallbackResult {
  
  inline def apply(errMsg: String, fd: String): OpenSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fd = fd.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSuccessCallbackResult]
  }
  
  extension [Self <: OpenSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
