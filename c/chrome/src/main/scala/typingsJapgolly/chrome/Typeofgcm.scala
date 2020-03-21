package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.gcm.GcmErrorEvent
import typingsJapgolly.chrome.chrome.gcm.MessageDeletionEvent
import typingsJapgolly.chrome.chrome.gcm.MessageReceptionEvent
import typingsJapgolly.chrome.chrome.gcm.OutgoingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgcm extends js.Object {
  var MAX_MESSAGE_SIZE: Double
  var onMessage: MessageReceptionEvent
  var onMessagesDeleted: MessageDeletionEvent
  var onSendError: GcmErrorEvent
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit
  def unregister(callback: js.Function0[Unit]): Unit
}

object Typeofgcm {
  @scala.inline
  def apply(
    MAX_MESSAGE_SIZE: Double,
    onMessage: MessageReceptionEvent,
    onMessagesDeleted: MessageDeletionEvent,
    onSendError: GcmErrorEvent,
    register: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Callback,
    send: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Callback,
    unregister: js.Function0[Unit] => Callback
  ): Typeofgcm = {
    val __obj = js.Dynamic.literal(MAX_MESSAGE_SIZE = MAX_MESSAGE_SIZE.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], onMessagesDeleted = onMessagesDeleted.asInstanceOf[js.Any], onSendError = onSendError.asInstanceOf[js.Any])
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function1[/* registrationId */ java.lang.String, scala.Unit]) => register(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.gcm.OutgoingMessage, t1: js.Function1[/* messageId */ java.lang.String, scala.Unit]) => send(t0, t1).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => unregister(t0).runNow()))
    __obj.asInstanceOf[Typeofgcm]
  }
}

