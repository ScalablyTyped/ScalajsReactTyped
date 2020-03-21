package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMarkerDataLabelOffset extends js.Object {
  /** X value or horizontal offset to position the labels in chart.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Y value or vertical offset to position the labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SeriesMarkerDataLabelOffset {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): SeriesMarkerDataLabelOffset = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMarkerDataLabelOffset]
  }
}

