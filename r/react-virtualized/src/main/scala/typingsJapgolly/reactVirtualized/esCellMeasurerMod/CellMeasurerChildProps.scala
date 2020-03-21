package typingsJapgolly.reactVirtualized.esCellMeasurerMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMeasurerChildProps extends js.Object {
  var registerChild: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  def measure(): Unit
}

object CellMeasurerChildProps {
  @scala.inline
  def apply(measure: Callback, registerChild: /* element */ Element => Callback = null): CellMeasurerChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("measure")(measure.toJsFn)
    if (registerChild != null) __obj.updateDynamic("registerChild")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.Element) => registerChild(t0).runNow()))
    __obj.asInstanceOf[CellMeasurerChildProps]
  }
}

