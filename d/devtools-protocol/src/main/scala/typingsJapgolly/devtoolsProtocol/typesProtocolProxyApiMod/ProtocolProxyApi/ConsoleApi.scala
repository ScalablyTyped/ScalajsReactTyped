package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.messageAdded
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Console.MessageAddedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleApi extends StObject {
  
  /**
    * Does nothing.
    */
  def clearMessages(): js.Promise[Unit]
  
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the
    * `messageAdded` notification.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  def on_messageAdded(event: messageAdded, listener: js.Function1[/* params */ MessageAddedEvent, Unit]): Unit
}
object ConsoleApi {
  
  inline def apply(
    clearMessages: CallbackTo[js.Promise[Unit]],
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    on: (messageAdded, js.Function1[/* params */ MessageAddedEvent, Unit]) => Callback
  ): ConsoleApi = {
    val __obj = js.Dynamic.literal(clearMessages = clearMessages.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, on = js.Any.fromFunction2((t0: messageAdded, t1: js.Function1[/* params */ MessageAddedEvent, Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[ConsoleApi]
  }
  
  extension [Self <: ConsoleApi](x: Self) {
    
    inline def setClearMessages(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clearMessages", value.toJsFn)
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setOn(value: (messageAdded, js.Function1[/* params */ MessageAddedEvent, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: messageAdded, t1: js.Function1[/* params */ MessageAddedEvent, Unit]) => (value(t0, t1)).runNow()))
  }
}
