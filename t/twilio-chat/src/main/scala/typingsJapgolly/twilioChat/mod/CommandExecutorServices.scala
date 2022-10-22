package typingsJapgolly.twilioChat.mod

import typingsJapgolly.twilsock.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandExecutorServices extends StObject {
  
  var transport: Transport
}
object CommandExecutorServices {
  
  inline def apply(transport: Transport): CommandExecutorServices = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandExecutorServices]
  }
  
  extension [Self <: CommandExecutorServices](x: Self) {
    
    inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
