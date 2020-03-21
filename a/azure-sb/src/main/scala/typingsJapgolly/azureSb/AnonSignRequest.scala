package typingsJapgolly.azureSb

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignRequest extends js.Object {
  def signRequest(webResource: js.Any, callback: js.Function0[Unit]): Unit
}

object AnonSignRequest {
  @scala.inline
  def apply(signRequest: (js.Any, js.Function0[Unit]) => Callback): AnonSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signRequest")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => signRequest(t0, t1).runNow()))
    __obj.asInstanceOf[AnonSignRequest]
  }
}

