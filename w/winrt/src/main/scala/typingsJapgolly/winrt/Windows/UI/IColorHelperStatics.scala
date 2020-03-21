package typingsJapgolly.winrt.Windows.UI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorHelperStatics extends js.Object {
  def fromArgb(a: Double, r: Double, g: Double, b: Double): Color
}

object IColorHelperStatics {
  @scala.inline
  def apply(fromArgb: (Double, Double, Double, Double) => CallbackTo[Color]): IColorHelperStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromArgb")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => fromArgb(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[IColorHelperStatics]
  }
}

