package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdSession extends js.Object {
  def close(): Unit
  def sendMessageAndGetReplyAsync(message: UssdMessage): IAsyncOperation[UssdReply]
}

object IUssdSession {
  @scala.inline
  def apply(
    close: Callback,
    sendMessageAndGetReplyAsync: UssdMessage => CallbackTo[IAsyncOperation[UssdReply]]
  ): IUssdSession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("sendMessageAndGetReplyAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdMessage) => sendMessageAndGetReplyAsync(t0).runNow()))
    __obj.asInstanceOf[IUssdSession]
  }
}

