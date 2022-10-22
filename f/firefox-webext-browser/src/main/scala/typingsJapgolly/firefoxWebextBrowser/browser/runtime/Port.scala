package typingsJapgolly.firefoxWebextBrowser.browser.runtime

import japgolly.scalajs.react.Callback
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* runtime types */
/** An object which allows two way communication with other pages. */
trait Port extends StObject {
  
  def disconnect(): Unit
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var name: String
  
  var onDisconnect: WebExtEvent[js.Function1[/* port */ this.type, Unit]]
  
  var onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]]
  
  def postMessage(message: js.Object): Unit
  
  /** This property will **only** be present on ports passed to onConnect/onConnectExternal listeners. */
  var sender: js.UndefOr[MessageSender] = js.undefined
}
object Port {
  
  inline def apply(
    disconnect: Callback,
    name: String,
    onDisconnect: WebExtEvent[js.Function1[Port, Unit]],
    onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]],
    postMessage: js.Object => Callback
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = disconnect.toJsFn, name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1((t0: js.Object) => postMessage(t0).runNow()))
    __obj.asInstanceOf[Port]
  }
  
  extension [Self <: Port](x: Self) {
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnDisconnect(value: WebExtEvent[js.Function1[Port, Unit]]): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
    
    inline def setOnMessage(value: WebExtEvent[js.Function1[/* response */ js.Object, Unit]]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    inline def setPostMessage(value: js.Object => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSender(value: MessageSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
