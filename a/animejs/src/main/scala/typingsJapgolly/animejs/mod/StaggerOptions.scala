package typingsJapgolly.animejs.mod

import typingsJapgolly.animejs.animejsStrings.center
import typingsJapgolly.animejs.animejsStrings.first
import typingsJapgolly.animejs.animejsStrings.last
import typingsJapgolly.animejs.animejsStrings.normal
import typingsJapgolly.animejs.animejsStrings.reverse
import typingsJapgolly.animejs.animejsStrings.x
import typingsJapgolly.animejs.animejsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaggerOptions extends js.Object {
  var axis: js.UndefOr[x | y] = js.undefined
  var direction: js.UndefOr[normal | reverse] = js.undefined
  var easing: js.UndefOr[CustomEasingFunction | String | EasingOptions] = js.undefined
  var from: js.UndefOr[first | last | center | Double] = js.undefined
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  var start: js.UndefOr[Double | String] = js.undefined
}

object StaggerOptions {
  @scala.inline
  def apply(
    axis: x | y = null,
    direction: normal | reverse = null,
    easing: CustomEasingFunction | String | EasingOptions = null,
    from: first | last | center | Double = null,
    grid: js.Array[Double] = null,
    start: Double | String = null
  ): StaggerOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaggerOptions]
  }
}

