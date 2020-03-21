package typingsJapgolly.reactSwipeable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableOptions extends js.Object {
  // Configuration Props
  var delta: js.UndefOr[Double] = js.undefined
  // Event handler/callbacks
  var onSwiped: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedDown: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedLeft: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedRight: js.UndefOr[SwipeCallback] = js.undefined
  var onSwipedUp: js.UndefOr[SwipeCallback] = js.undefined
  var onSwiping: js.UndefOr[SwipeCallback] = js.undefined
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
  var rotationAngle: js.UndefOr[Double] = js.undefined
  var trackMouse: js.UndefOr[Boolean] = js.undefined
  var trackTouch: js.UndefOr[Boolean] = js.undefined
}

object SwipeableOptions {
  @scala.inline
  def apply(
    delta: Int | Double = null,
    onSwiped: /* eventData */ EventData => Callback = null,
    onSwipedDown: /* eventData */ EventData => Callback = null,
    onSwipedLeft: /* eventData */ EventData => Callback = null,
    onSwipedRight: /* eventData */ EventData => Callback = null,
    onSwipedUp: /* eventData */ EventData => Callback = null,
    onSwiping: /* eventData */ EventData => Callback = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Int | Double = null,
    trackMouse: js.UndefOr[Boolean] = js.undefined,
    trackTouch: js.UndefOr[Boolean] = js.undefined
  ): SwipeableOptions = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwiped(t0).runNow()))
    if (onSwipedDown != null) __obj.updateDynamic("onSwipedDown")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedDown(t0).runNow()))
    if (onSwipedLeft != null) __obj.updateDynamic("onSwipedLeft")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedLeft(t0).runNow()))
    if (onSwipedRight != null) __obj.updateDynamic("onSwipedRight")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedRight(t0).runNow()))
    if (onSwipedUp != null) __obj.updateDynamic("onSwipedUp")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedUp(t0).runNow()))
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwiping(t0).runNow()))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(trackTouch)) __obj.updateDynamic("trackTouch")(trackTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableOptions]
  }
}

