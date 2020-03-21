package typingsJapgolly.nvd3.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFactory[TChart /* <: Nvd3Element */] extends js.Object {
  var callback: js.UndefOr[js.Function1[/* chart */ TChart, Unit]] = js.undefined
  def generate(): TChart
}

object ChartFactory {
  @scala.inline
  def apply[TChart /* <: Nvd3Element */](generate: CallbackTo[TChart], callback: /* chart */ TChart => Callback = null): ChartFactory[TChart] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(generate.toJsFn)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* chart */ TChart) => callback(t0).runNow()))
    __obj.asInstanceOf[ChartFactory[TChart]]
  }
}

