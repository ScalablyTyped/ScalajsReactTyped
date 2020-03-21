package typingsJapgolly.egjsAxes.pinchInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchInputOption extends js.Object {
  var scale: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PinchInputOption {
  @scala.inline
  def apply(scale: Int | Double = null, threshold: Int | Double = null): PinchInputOption = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchInputOption]
  }
}

