package typingsJapgolly.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordError
  extends StObject
     with Error {
  
  @JSName("name")
  var name_PasswordError: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.PasswordError
}
object PasswordError {
  
  inline def apply(message: String, method: String): PasswordError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "PasswordError")
    __obj.asInstanceOf[PasswordError]
  }
  
  extension [Self <: PasswordError](x: Self) {
    
    inline def setName(value: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.PasswordError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
