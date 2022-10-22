package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.gcm.GcmErrorEvent
import typingsJapgolly.chrome.chrome.gcm.MessageDeletionEvent
import typingsJapgolly.chrome.chrome.gcm.MessageReceptionEvent
import typingsJapgolly.chrome.chrome.gcm.OutgoingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofgcm extends StObject {
  
  var MAX_MESSAGE_SIZE: Double
  
  var onMessage: MessageReceptionEvent
  
  var onMessagesDeleted: MessageDeletionEvent
  
  var onSendError: GcmErrorEvent
  
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit
  
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit
  
  def unregister(callback: js.Function0[Unit]): Unit
}
object Typeofgcm {
  
  inline def apply(
    MAX_MESSAGE_SIZE: Double,
    onMessage: MessageReceptionEvent,
    onMessagesDeleted: MessageDeletionEvent,
    onSendError: GcmErrorEvent,
    register: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Callback,
    send: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Callback,
    unregister: js.Function0[Unit] => Callback
  ): Typeofgcm = {
    val __obj = js.Dynamic.literal(MAX_MESSAGE_SIZE = MAX_MESSAGE_SIZE.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], onMessagesDeleted = onMessagesDeleted.asInstanceOf[js.Any], onSendError = onSendError.asInstanceOf[js.Any], register = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function1[/* registrationId */ String, Unit]) => (register(t0, t1)).runNow()), send = js.Any.fromFunction2((t0: OutgoingMessage, t1: js.Function1[/* messageId */ String, Unit]) => (send(t0, t1)).runNow()), unregister = js.Any.fromFunction1((t0: js.Function0[Unit]) => unregister(t0).runNow()))
    __obj.asInstanceOf[Typeofgcm]
  }
  
  extension [Self <: Typeofgcm](x: Self) {
    
    inline def setMAX_MESSAGE_SIZE(value: Double): Self = StObject.set(x, "MAX_MESSAGE_SIZE", value.asInstanceOf[js.Any])
    
    inline def setOnMessage(value: MessageReceptionEvent): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    inline def setOnMessagesDeleted(value: MessageDeletionEvent): Self = StObject.set(x, "onMessagesDeleted", value.asInstanceOf[js.Any])
    
    inline def setOnSendError(value: GcmErrorEvent): Self = StObject.set(x, "onSendError", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function1[/* registrationId */ String, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSend(value: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Callback): Self = StObject.set(x, "send", js.Any.fromFunction2((t0: OutgoingMessage, t1: js.Function1[/* messageId */ String, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setUnregister(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
