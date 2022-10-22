package typingsJapgolly.samchon

import japgolly.scalajs.react.Callback
import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolInvokeIprotocolMod {
  
  trait IProtocol extends StObject {
    
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    def replyData(invoke: Invoke): Unit
    
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    def sendData(invoke: Invoke): Unit
  }
  object IProtocol {
    
    inline def apply(replyData: Invoke => Callback, sendData: Invoke => Callback): IProtocol = {
      val __obj = js.Dynamic.literal(replyData = js.Any.fromFunction1((t0: Invoke) => replyData(t0).runNow()), sendData = js.Any.fromFunction1((t0: Invoke) => sendData(t0).runNow()))
      __obj.asInstanceOf[IProtocol]
    }
    
    extension [Self <: IProtocol](x: Self) {
      
      inline def setReplyData(value: Invoke => Callback): Self = StObject.set(x, "replyData", js.Any.fromFunction1((t0: Invoke) => value(t0).runNow()))
      
      inline def setSendData(value: Invoke => Callback): Self = StObject.set(x, "sendData", js.Any.fromFunction1((t0: Invoke) => value(t0).runNow()))
    }
  }
}
