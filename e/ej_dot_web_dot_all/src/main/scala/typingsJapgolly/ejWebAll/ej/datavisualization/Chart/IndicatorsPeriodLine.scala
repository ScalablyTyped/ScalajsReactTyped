package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsPeriodLine extends js.Object {
  /** Color of period line in indicator.
    * @Default {blue}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Width of the period line in indicators.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IndicatorsPeriodLine {
  @scala.inline
  def apply(fill: String = null, width: Int | Double = null): IndicatorsPeriodLine = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsPeriodLine]
  }
}

