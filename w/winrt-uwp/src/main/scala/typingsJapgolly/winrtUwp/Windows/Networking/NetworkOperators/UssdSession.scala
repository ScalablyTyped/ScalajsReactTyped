package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a session of the USSD network protocol. */
trait UssdSession extends StObject {
  
  /** Closes the USSD session with the network. */
  def close(): Unit
  
  /**
    * Sends a message to a USSD session and returns a handler to retrieve the reply asynchronously.
    * @param message The message to send to the USSD session.
    * @return An asynchronous handler to retrieve the USSD response to the sent message.
    */
  def sendMessageAndGetReplyAsync(message: UssdMessage): IPromiseWithIAsyncOperation[UssdReply]
}
object UssdSession {
  
  inline def apply(
    close: Callback,
    sendMessageAndGetReplyAsync: UssdMessage => IPromiseWithIAsyncOperation[UssdReply]
  ): UssdSession = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
    __obj.asInstanceOf[UssdSession]
  }
  
  extension [Self <: UssdSession](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setSendMessageAndGetReplyAsync(value: UssdMessage => IPromiseWithIAsyncOperation[UssdReply]): Self = StObject.set(x, "sendMessageAndGetReplyAsync", js.Any.fromFunction1(value))
  }
}
