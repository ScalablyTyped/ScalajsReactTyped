package typingsJapgolly.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPointersBorder extends js.Object {
  /** Specify border color for pointer of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specify border width for pointers of circular gauge
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesPointersBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): ScalesPointersBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPointersBorder]
  }
}

