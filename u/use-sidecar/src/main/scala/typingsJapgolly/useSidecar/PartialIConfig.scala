package typingsJapgolly.useSidecar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<use-sidecar.use-sidecar/dist/es5/config.IConfig> */
trait PartialIConfig extends js.Object {
  var onError: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
}

object PartialIConfig {
  @scala.inline
  def apply(onError: /* e */ js.Error => Callback = null): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* e */ js.Error) => onError(t0).runNow()))
    __obj.asInstanceOf[PartialIConfig]
  }
}

