package typingsJapgolly.trufflePrivatekeyProvider.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyProvider extends js.Object {
  def send(args: js.Any*): js.Any
  def sendAsync(args: js.Any*): Unit
}

object PrivateKeyProvider {
  @scala.inline
  def apply(send: /* repeated */ js.Any => CallbackTo[js.Any], sendAsync: /* repeated */ js.Any => Callback): PrivateKeyProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => send(t0).runNow()))
    __obj.updateDynamic("sendAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => sendAsync(t0).runNow()))
    __obj.asInstanceOf[PrivateKeyProvider]
  }
}

