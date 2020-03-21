package typingsJapgolly.reactSwipeableViewsUtils.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`x-reverse`
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`y-reverse`
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithBindKeyboardProps extends js.Object {
  var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.undefined
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  var slidecount: js.UndefOr[Double] = js.undefined
}

object WithBindKeyboardProps {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Callback,
    axis: x | `x-reverse` | y | `y-reverse` = null,
    slidecount: Int | Double = null
  ): WithBindKeyboardProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* indexLatest */ scala.Double) => onChangeIndex(t0, t1).runNow()))
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (slidecount != null) __obj.updateDynamic("slidecount")(slidecount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithBindKeyboardProps]
  }
}

