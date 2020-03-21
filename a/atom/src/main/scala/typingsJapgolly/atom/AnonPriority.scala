package typingsJapgolly.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPriority[T] extends js.Object {
  var item: T
  var priority: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonPriority {
  @scala.inline
  def apply[T](item: T, priority: Int | Double = null, visible: js.UndefOr[Boolean] = js.undefined): AnonPriority[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPriority[T]]
  }
}

