package typingsJapgolly.tensorflowTfjsCore.backendMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendTimer extends js.Object {
  def time(f: js.Function0[Unit]): js.Promise[BackendTimingInfo]
}

object BackendTimer {
  @scala.inline
  def apply(time: js.Function0[Unit] => CallbackTo[js.Promise[BackendTimingInfo]]): BackendTimer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("time")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => time(t0).runNow()))
    __obj.asInstanceOf[BackendTimer]
  }
}

