package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRotateSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 旋转角 */
  var rotate: Double
}
object GetRotateSuccessCallbackResult {
  
  inline def apply(errMsg: String, rotate: Double): GetRotateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRotateSuccessCallbackResult]
  }
  
  extension [Self <: GetRotateSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}
