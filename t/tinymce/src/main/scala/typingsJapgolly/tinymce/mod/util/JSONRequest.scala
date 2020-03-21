package typingsJapgolly.tinymce.mod.util

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONRequest extends js.Object {
  def send(args: js.Object): Unit
  def sendRPC(o: js.Object): Unit
}

object JSONRequest {
  @scala.inline
  def apply(send: js.Object => Callback, sendRPC: js.Object => Callback): JSONRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Object) => send(t0).runNow()))
    __obj.updateDynamic("sendRPC")(js.Any.fromFunction1((t0: js.Object) => sendRPC(t0).runNow()))
    __obj.asInstanceOf[JSONRequest]
  }
}

