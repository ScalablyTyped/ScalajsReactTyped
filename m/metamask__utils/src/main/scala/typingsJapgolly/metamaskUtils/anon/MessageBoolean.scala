package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBoolean extends StObject {
  
  var code: Double
  
  var message: Boolean
}
object MessageBoolean {
  
  inline def apply(code: Double, message: Boolean): MessageBoolean = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoolean]
  }
  
  extension [Self <: MessageBoolean](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
