package typingsJapgolly.highcharts.accessibilityMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointAccessibilityOptionsObject extends js.Object {
  /**
    * Provide a description of the data point, announced to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object PointAccessibilityOptionsObject {
  @scala.inline
  def apply(description: String = null): PointAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAccessibilityOptionsObject]
  }
}

