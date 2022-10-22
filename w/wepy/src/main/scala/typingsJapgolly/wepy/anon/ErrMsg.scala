package typingsJapgolly.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrMsg extends StObject {
  
  var errMsg: String
  
  var isEnrolled: Boolean
}
object ErrMsg {
  
  inline def apply(errMsg: String, isEnrolled: Boolean): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
  
  extension [Self <: ErrMsg](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setIsEnrolled(value: Boolean): Self = StObject.set(x, "isEnrolled", value.asInstanceOf[js.Any])
  }
}
