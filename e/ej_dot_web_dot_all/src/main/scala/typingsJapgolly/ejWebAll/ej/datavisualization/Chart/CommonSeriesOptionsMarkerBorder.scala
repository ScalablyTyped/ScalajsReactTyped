package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerBorder extends js.Object {
  /** Border color of the marker shape.
    * @Default {white}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the marker shape.
    * @Default {3}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsMarkerBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): CommonSeriesOptionsMarkerBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsMarkerBorder]
  }
}

