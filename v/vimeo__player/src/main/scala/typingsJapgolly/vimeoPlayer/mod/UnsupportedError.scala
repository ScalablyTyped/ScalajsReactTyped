package typingsJapgolly.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedError
  extends StObject
     with Error {
  
  @JSName("name")
  var name_UnsupportedError: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.UnsupportedError
}
object UnsupportedError {
  
  inline def apply(message: String, method: String): UnsupportedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "UnsupportedError")
    __obj.asInstanceOf[UnsupportedError]
  }
  
  extension [Self <: UnsupportedError](x: Self) {
    
    inline def setName(value: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.UnsupportedError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
