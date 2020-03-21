package typingsJapgolly.reactSwipeableViewsUtils.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallback
import typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithAutoPlay extends js.Object {
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  var onSwitching: js.UndefOr[OnSwitchingCallback] = js.undefined
}

object WithAutoPlay {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Callback,
    onSwitching: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Callback = null
  ): WithAutoPlay = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* indexLatest */ scala.Double) => onChangeIndex(t0, t1).runNow()))
    if (onSwitching != null) __obj.updateDynamic("onSwitching")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* type */ typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor) => onSwitching(t0, t1).runNow()))
    __obj.asInstanceOf[WithAutoPlay]
  }
}

