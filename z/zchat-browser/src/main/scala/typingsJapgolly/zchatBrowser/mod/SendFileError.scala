package typingsJapgolly.zchatBrowser.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendFileError
  extends StObject
     with Error {
  
  @JSName("message")
  var message_SendFileError: SendFileErrorMessage
}
object SendFileError {
  
  inline def apply(message: SendFileErrorMessage, name: String): SendFileError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendFileError]
  }
  
  extension [Self <: SendFileError](x: Self) {
    
    inline def setMessage(value: SendFileErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
