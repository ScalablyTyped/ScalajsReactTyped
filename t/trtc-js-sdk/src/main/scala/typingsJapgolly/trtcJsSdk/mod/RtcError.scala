package typingsJapgolly.trtcJsSdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RtcError
  extends StObject
     with Error {
  
  /** 获取错误码, 详细错误码列表参见 [ErrorCode](https://trtc-1252463788.file.myqcloud.com/web/docs/module-ErrorCode.html) */
  def getCode(): String
}
object RtcError {
  
  inline def apply(getCode: CallbackTo[String], message: String, name: String): RtcError = {
    val __obj = js.Dynamic.literal(getCode = getCode.toJsFn, message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtcError]
  }
  
  extension [Self <: RtcError](x: Self) {
    
    inline def setGetCode(value: CallbackTo[String]): Self = StObject.set(x, "getCode", value.toJsFn)
  }
}
