package typingsJapgolly.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a closed event on a MessageWebSocket , StreamWebSocket , or IWebSocket object. */
trait WebSocketClosedEventArgs extends StObject {
  
  /** Gets information about the reason that a WebSocket object was closed. */
  var code: Double
  
  /** Gets additional details about the reason that a WebSocket object was closed. */
  var reason: String
}
object WebSocketClosedEventArgs {
  
  inline def apply(code: Double, reason: String): WebSocketClosedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketClosedEventArgs]
  }
  
  extension [Self <: WebSocketClosedEventArgs](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
