package typingsJapgolly.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesSubGaugesPosition extends js.Object {
  /** Specify x-axis position for sub-gauge of circular gauge
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specify y-axis position for sub-gauge of circular gauge
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesSubGaugesPosition {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): ScalesSubGaugesPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesSubGaugesPosition]
  }
}

