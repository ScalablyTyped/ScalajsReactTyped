package typingsJapgolly.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraMsg extends StObject {
  
  var extraMsg: js.UndefOr[String] = js.undefined
  
  var failedPermid: js.UndefOr[Double] = js.undefined
  
  var id: String
  
  var message: String
  
  var msg: String
}
object ExtraMsg {
  
  inline def apply(id: String, message: String, msg: String): ExtraMsg = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraMsg]
  }
  
  extension [Self <: ExtraMsg](x: Self) {
    
    inline def setExtraMsg(value: String): Self = StObject.set(x, "extraMsg", value.asInstanceOf[js.Any])
    
    inline def setExtraMsgUndefined: Self = StObject.set(x, "extraMsg", js.undefined)
    
    inline def setFailedPermid(value: Double): Self = StObject.set(x, "failedPermid", value.asInstanceOf[js.Any])
    
    inline def setFailedPermidUndefined: Self = StObject.set(x, "failedPermid", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
