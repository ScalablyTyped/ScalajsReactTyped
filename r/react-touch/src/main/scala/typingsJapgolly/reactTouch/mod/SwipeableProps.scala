package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableProps extends js.Object {
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.undefined
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeRight: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SwipeableProps {
  @scala.inline
  def apply(
    config: SwipeableConfig = null,
    onMouseDown: js.UndefOr[Callback] = js.undefined,
    onSwipeDown: js.UndefOr[Callback] = js.undefined,
    onSwipeLeft: js.UndefOr[Callback] = js.undefined,
    onSwipeRight: js.UndefOr[Callback] = js.undefined,
    onSwipeUp: js.UndefOr[Callback] = js.undefined,
    onTouchStart: js.UndefOr[Callback] = js.undefined
  ): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    onMouseDown.foreach(p => __obj.updateDynamic("onMouseDown")(p.toJsFn))
    onSwipeDown.foreach(p => __obj.updateDynamic("onSwipeDown")(p.toJsFn))
    onSwipeLeft.foreach(p => __obj.updateDynamic("onSwipeLeft")(p.toJsFn))
    onSwipeRight.foreach(p => __obj.updateDynamic("onSwipeRight")(p.toJsFn))
    onSwipeUp.foreach(p => __obj.updateDynamic("onSwipeUp")(p.toJsFn))
    onTouchStart.foreach(p => __obj.updateDynamic("onTouchStart")(p.toJsFn))
    __obj.asInstanceOf[SwipeableProps]
  }
}

