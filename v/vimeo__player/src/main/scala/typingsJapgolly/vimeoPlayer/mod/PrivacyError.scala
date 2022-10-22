package typingsJapgolly.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivacyError
  extends StObject
     with Error {
  
  @JSName("name")
  var name_PrivacyError: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.PrivacyError
}
object PrivacyError {
  
  inline def apply(message: String, method: String): PrivacyError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "PrivacyError")
    __obj.asInstanceOf[PrivacyError]
  }
  
  extension [Self <: PrivacyError](x: Self) {
    
    inline def setName(value: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.PrivacyError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
