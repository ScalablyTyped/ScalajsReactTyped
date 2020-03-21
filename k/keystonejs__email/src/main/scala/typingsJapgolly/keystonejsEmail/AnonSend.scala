package typingsJapgolly.keystonejsEmail

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSend extends js.Object {
  def send(rendererOpts: js.Any, transportOptions: js.Any): js.Any
}

object AnonSend {
  @scala.inline
  def apply(send: (js.Any, js.Any) => CallbackTo[js.Any]): AnonSend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => send(t0, t1).runNow()))
    __obj.asInstanceOf[AnonSend]
  }
}

