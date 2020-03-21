package typingsJapgolly.reactRange.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactRange.AnonChildren
import typingsJapgolly.reactRange.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  var allowOverlap: Boolean
  var direction: Direction
  var disabled: Boolean
  var max: Double
  var min: Double
  var onFinalChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
  var rtl: Boolean
  var step: Double
  var values: js.Array[Double]
  def onChange(values: js.Array[Double]): Unit
  def renderThumb(params: AnonIndex): Node
  def renderTrack(params: AnonChildren): Node
}

object IProps {
  @scala.inline
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    onChange: js.Array[Double] => Callback,
    renderThumb: AnonIndex => CallbackTo[Node],
    renderTrack: AnonChildren => CallbackTo[Node],
    rtl: Boolean,
    step: Double,
    values: js.Array[Double],
    onFinalChange: /* values */ js.Array[Double] => Callback = null
  ): IProps = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => onChange(t0).runNow()))
    __obj.updateDynamic("renderThumb")(js.Any.fromFunction1((t0: typingsJapgolly.reactRange.AnonIndex) => renderThumb(t0).runNow()))
    __obj.updateDynamic("renderTrack")(js.Any.fromFunction1((t0: typingsJapgolly.reactRange.AnonChildren) => renderTrack(t0).runNow()))
    if (onFinalChange != null) __obj.updateDynamic("onFinalChange")(js.Any.fromFunction1((t0: /* values */ js.Array[scala.Double]) => onFinalChange(t0).runNow()))
    __obj.asInstanceOf[IProps]
  }
}

