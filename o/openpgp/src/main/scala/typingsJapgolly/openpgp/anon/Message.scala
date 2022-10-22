package typingsJapgolly.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: typingsJapgolly.openpgp.mod.message.Message
}
object Message {
  
  inline def apply(message: typingsJapgolly.openpgp.mod.message.Message): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: typingsJapgolly.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
