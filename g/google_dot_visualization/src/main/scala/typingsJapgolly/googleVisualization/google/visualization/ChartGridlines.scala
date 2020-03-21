package typingsJapgolly.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartGridlines extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
}

object ChartGridlines {
  @scala.inline
  def apply(color: String = null, count: Int | Double = null): ChartGridlines = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartGridlines]
  }
}

