package typingsJapgolly.samchon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorIcommunicatorMod {
  
  trait ICommunicator
    extends StObject
       with IProtocol {
    
    /**
      * Close connection.
      */
    def close(): Unit
    
    /**
      * Test connection.
      *
      * Test whether this {@link ICommunicator communicator} object is connected with the remote system. If the
      * connection is alive, then returns ```true```. Otherwise, the connection is not alive or this
      * {@link ICommunicator communicator has not connected with the remote system yet, then returns ```false```.
      *
      * @return true if connected, otherwise false.
      */
    def isConnected(): Boolean
    
    /**
      * Callback function for connection closed.
      */
    var onClose: js.Function
  }
  object ICommunicator {
    
    inline def apply(
      close: Callback,
      isConnected: CallbackTo[Boolean],
      onClose: js.Function,
      replyData: Invoke => Callback,
      sendData: Invoke => Callback
    ): ICommunicator = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, isConnected = isConnected.toJsFn, onClose = onClose.asInstanceOf[js.Any], replyData = js.Any.fromFunction1((t0: Invoke) => replyData(t0).runNow()), sendData = js.Any.fromFunction1((t0: Invoke) => sendData(t0).runNow()))
      __obj.asInstanceOf[ICommunicator]
    }
    
    extension [Self <: ICommunicator](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setIsConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnected", value.toJsFn)
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    }
  }
}
