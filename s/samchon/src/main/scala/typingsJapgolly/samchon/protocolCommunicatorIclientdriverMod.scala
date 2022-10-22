package typingsJapgolly.samchon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.samchon.protocolCommunicatorIcommunicatorMod.ICommunicator
import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorIclientdriverMod {
  
  trait IClientDriver
    extends StObject
       with ICommunicator {
    
    /**
      * Listen message from the newly connected client.
      *
      * Starts listening message from the newly connected client. Replied message from the connected client will be
      * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
      * method.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def listen(listener: IProtocol): Unit
  }
  object IClientDriver {
    
    inline def apply(
      close: Callback,
      isConnected: CallbackTo[Boolean],
      listen: IProtocol => Callback,
      onClose: js.Function,
      replyData: Invoke => Callback,
      sendData: Invoke => Callback
    ): IClientDriver = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, isConnected = isConnected.toJsFn, listen = js.Any.fromFunction1((t0: IProtocol) => listen(t0).runNow()), onClose = onClose.asInstanceOf[js.Any], replyData = js.Any.fromFunction1((t0: Invoke) => replyData(t0).runNow()), sendData = js.Any.fromFunction1((t0: Invoke) => sendData(t0).runNow()))
      __obj.asInstanceOf[IClientDriver]
    }
    
    extension [Self <: IClientDriver](x: Self) {
      
      inline def setListen(value: IProtocol => Callback): Self = StObject.set(x, "listen", js.Any.fromFunction1((t0: IProtocol) => value(t0).runNow()))
    }
  }
}
