package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesRange extends js.Object {
  /** Interval of the axis range.
    * @Default {null}
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Maximum value of the axis range.
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.undefined
  /** Minimum value of the axis range.
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.undefined
}

object AxesRange {
  @scala.inline
  def apply(interval: Int | Double = null, max: Int | Double = null, min: Int | Double = null): AxesRange = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesRange]
  }
}

