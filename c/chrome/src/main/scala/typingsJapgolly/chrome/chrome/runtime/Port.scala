package typingsJapgolly.chrome.chrome.runtime

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Port extends StObject {
  
  def disconnect(): Unit
  
  var name: String
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: PortDisconnectEvent
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: PortMessageEvent
  
  def postMessage(message: Any): Unit
  
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[MessageSender] = js.undefined
}
object Port {
  
  inline def apply(
    disconnect: Callback,
    name: String,
    onDisconnect: PortDisconnectEvent,
    onMessage: PortMessageEvent,
    postMessage: Any => Callback
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = disconnect.toJsFn, name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1((t0: Any) => postMessage(t0).runNow()))
    __obj.asInstanceOf[Port]
  }
  
  extension [Self <: Port](x: Self) {
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnDisconnect(value: PortDisconnectEvent): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
    
    inline def setOnMessage(value: PortMessageEvent): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    inline def setPostMessage(value: Any => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSender(value: MessageSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
