package typingsJapgolly.recorderJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderConfig extends js.Object {
  var onAnalysed: js.UndefOr[OnAnalysedHandler] = js.undefined
}

object RecorderConfig {
  @scala.inline
  def apply(onAnalysed: (/* data */ js.Array[Double], /* lastNonZero */ Double) => Callback = null): RecorderConfig = {
    val __obj = js.Dynamic.literal()
    if (onAnalysed != null) __obj.updateDynamic("onAnalysed")(js.Any.fromFunction2((t0: /* data */ js.Array[scala.Double], t1: /* lastNonZero */ scala.Double) => onAnalysed(t0, t1).runNow()))
    __obj.asInstanceOf[RecorderConfig]
  }
}

