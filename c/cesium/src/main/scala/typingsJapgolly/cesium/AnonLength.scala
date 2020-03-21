package typingsJapgolly.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var bottomRadius: Double
  var length: Double
  var numberOfVerticalLines: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var topRadius: Double
}

object AnonLength {
  @scala.inline
  def apply(
    bottomRadius: Double,
    length: Double,
    topRadius: Double,
    numberOfVerticalLines: Int | Double = null,
    slices: Int | Double = null
  ): AnonLength = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

