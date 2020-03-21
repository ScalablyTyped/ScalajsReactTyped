package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsMacdLine extends js.Object {
  /** Color of MACD line.
    * @Default {#ff9933}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Width of the MACD line.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IndicatorsMacdLine {
  @scala.inline
  def apply(fill: String = null, width: Int | Double = null): IndicatorsMacdLine = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsMacdLine]
  }
}

