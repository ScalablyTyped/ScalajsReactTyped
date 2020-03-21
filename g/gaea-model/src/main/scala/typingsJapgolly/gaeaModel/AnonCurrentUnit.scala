package typingsJapgolly.gaeaModel

import typingsJapgolly.gaeaModel.FitGaea.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentUnit extends js.Object {
  var currentUnit: String
  var inputRange: js.UndefOr[js.Array[Double]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var outputRange: js.UndefOr[js.Array[Double]] = js.undefined
  var slider: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var units: js.Array[Number]
}

object AnonCurrentUnit {
  @scala.inline
  def apply(
    currentUnit: String,
    units: js.Array[Number],
    inputRange: js.Array[Double] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    outputRange: js.Array[Double] = null,
    slider: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    step: Int | Double = null
  ): AnonCurrentUnit = {
    val __obj = js.Dynamic.literal(currentUnit = currentUnit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    if (inputRange != null) __obj.updateDynamic("inputRange")(inputRange.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (outputRange != null) __obj.updateDynamic("outputRange")(outputRange.asInstanceOf[js.Any])
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentUnit]
  }
}

