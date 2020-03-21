package typingsJapgolly.reactSparklines.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSparklines.reactSparklinesStrings.click
import typingsJapgolly.reactSparklines.reactSparklinesStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesLineProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function3[/* event */ enter | click, /* value */ Double, /* point */ Point, Unit]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesLineProps {
  @scala.inline
  def apply(
    color: String = null,
    onMouseMove: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Callback = null,
    style: CSSProperties = null
  ): SparklinesLineProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.reactSparklines.reactSparklinesStrings.enter | typingsJapgolly.reactSparklines.reactSparklinesStrings.click, t1: /* value */ scala.Double, t2: /* point */ typingsJapgolly.reactSparklines.mod.Point) => onMouseMove(t0, t1, t2).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesLineProps]
  }
}

