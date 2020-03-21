package typingsJapgolly.openfin.externalProcessMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalProcessInfo extends js.Object {
  var listener: js.UndefOr[LaunchExternalProcessListener] = js.undefined
  var pid: Double
}

object ExternalProcessInfo {
  @scala.inline
  def apply(pid: Double, listener: /* code */ ExitCode => Callback = null): ExternalProcessInfo = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(js.Any.fromFunction1((t0: /* code */ typingsJapgolly.openfin.externalProcessMod.ExitCode) => listener(t0).runNow()))
    __obj.asInstanceOf[ExternalProcessInfo]
  }
}

