package typingsJapgolly.reduxBootstrap

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  def accept(path: String, cb: js.Function0[Unit]): Unit
}

object AnonAccept {
  @scala.inline
  def apply(accept: (String, js.Function0[Unit]) => Callback): AnonAccept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => accept(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAccept]
  }
}

