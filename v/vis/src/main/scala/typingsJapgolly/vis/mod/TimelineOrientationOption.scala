package typingsJapgolly.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOrientationOption extends js.Object {
  var axis: js.UndefOr[String] = js.undefined
  var item: js.UndefOr[String] = js.undefined
}

object TimelineOrientationOption {
  @scala.inline
  def apply(axis: String = null, item: String = null): TimelineOrientationOption = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineOrientationOption]
  }
}

