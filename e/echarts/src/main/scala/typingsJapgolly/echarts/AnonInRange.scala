package typingsJapgolly.echarts

import typingsJapgolly.echarts.echarts.VisualMap.RangeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInRange extends js.Object {
  var inRange: js.UndefOr[RangeObject] = js.undefined
  var outOfRange: js.UndefOr[RangeObject] = js.undefined
}

object AnonInRange {
  @scala.inline
  def apply(inRange: RangeObject = null, outOfRange: RangeObject = null): AnonInRange = {
    val __obj = js.Dynamic.literal()
    if (inRange != null) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    if (outOfRange != null) __obj.updateDynamic("outOfRange")(outOfRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInRange]
  }
}

