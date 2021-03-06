package typingsJapgolly.reactHammerjs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hammerjs.HammerInput
import typingsJapgolly.hammerjs.HammerListener
import typingsJapgolly.hammerjs.Recognizer
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_ALL
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_DOWN
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_HORIZONTAL
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_LEFT
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_NONE
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_RIGHT
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_UP
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHammerProps extends js.Object {
  var action: js.UndefOr[HammerListener] = js.undefined
  var direction: js.UndefOr[
    DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
  ] = js.undefined
  var onDoubleTap: js.UndefOr[HammerListener] = js.undefined
  var onPan: js.UndefOr[HammerListener] = js.undefined
  var onPanCancel: js.UndefOr[HammerListener] = js.undefined
  var onPanEnd: js.UndefOr[HammerListener] = js.undefined
  var onPanStart: js.UndefOr[HammerListener] = js.undefined
  var onPinch: js.UndefOr[HammerListener] = js.undefined
  var onPinchCancel: js.UndefOr[HammerListener] = js.undefined
  var onPinchEnd: js.UndefOr[HammerListener] = js.undefined
  var onPinchIn: js.UndefOr[HammerListener] = js.undefined
  var onPinchOut: js.UndefOr[HammerListener] = js.undefined
  var onPinchStart: js.UndefOr[HammerListener] = js.undefined
  var onPress: js.UndefOr[HammerListener] = js.undefined
  var onPressUp: js.UndefOr[HammerListener] = js.undefined
  var onRotate: js.UndefOr[HammerListener] = js.undefined
  var onRotateCancel: js.UndefOr[HammerListener] = js.undefined
  var onRotateEnd: js.UndefOr[HammerListener] = js.undefined
  var onRotateMove: js.UndefOr[HammerListener] = js.undefined
  var onRotateStart: js.UndefOr[HammerListener] = js.undefined
  var onSwipe: js.UndefOr[HammerListener] = js.undefined
  var onTap: js.UndefOr[HammerListener] = js.undefined
  var options: js.UndefOr[HammerOptionsWithRecognizers] = js.undefined
  var recognizeWith: js.UndefOr[StringDictionary[Recognizer | String]] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ReactHammerProps {
  @scala.inline
  def apply(
    action: /* event */ HammerInput => Callback = null,
    direction: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL = null,
    onDoubleTap: /* event */ HammerInput => Callback = null,
    onPan: /* event */ HammerInput => Callback = null,
    onPanCancel: /* event */ HammerInput => Callback = null,
    onPanEnd: /* event */ HammerInput => Callback = null,
    onPanStart: /* event */ HammerInput => Callback = null,
    onPinch: /* event */ HammerInput => Callback = null,
    onPinchCancel: /* event */ HammerInput => Callback = null,
    onPinchEnd: /* event */ HammerInput => Callback = null,
    onPinchIn: /* event */ HammerInput => Callback = null,
    onPinchOut: /* event */ HammerInput => Callback = null,
    onPinchStart: /* event */ HammerInput => Callback = null,
    onPress: /* event */ HammerInput => Callback = null,
    onPressUp: /* event */ HammerInput => Callback = null,
    onRotate: /* event */ HammerInput => Callback = null,
    onRotateCancel: /* event */ HammerInput => Callback = null,
    onRotateEnd: /* event */ HammerInput => Callback = null,
    onRotateMove: /* event */ HammerInput => Callback = null,
    onRotateStart: /* event */ HammerInput => Callback = null,
    onSwipe: /* event */ HammerInput => Callback = null,
    onTap: /* event */ HammerInput => Callback = null,
    options: HammerOptionsWithRecognizers = null,
    recognizeWith: StringDictionary[Recognizer | String] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ReactHammerProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => action(t0).runNow()))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onDoubleTap != null) __obj.updateDynamic("onDoubleTap")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onDoubleTap(t0).runNow()))
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPan(t0).runNow()))
    if (onPanCancel != null) __obj.updateDynamic("onPanCancel")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPanCancel(t0).runNow()))
    if (onPanEnd != null) __obj.updateDynamic("onPanEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPanEnd(t0).runNow()))
    if (onPanStart != null) __obj.updateDynamic("onPanStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPanStart(t0).runNow()))
    if (onPinch != null) __obj.updateDynamic("onPinch")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPinch(t0).runNow()))
    if (onPinchCancel != null) __obj.updateDynamic("onPinchCancel")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPinchCancel(t0).runNow()))
    if (onPinchEnd != null) __obj.updateDynamic("onPinchEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPinchEnd(t0).runNow()))
    if (onPinchIn != null) __obj.updateDynamic("onPinchIn")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPinchIn(t0).runNow()))
    if (onPinchOut != null) __obj.updateDynamic("onPinchOut")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPinchOut(t0).runNow()))
    if (onPinchStart != null) __obj.updateDynamic("onPinchStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPinchStart(t0).runNow()))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPress(t0).runNow()))
    if (onPressUp != null) __obj.updateDynamic("onPressUp")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onPressUp(t0).runNow()))
    if (onRotate != null) __obj.updateDynamic("onRotate")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onRotate(t0).runNow()))
    if (onRotateCancel != null) __obj.updateDynamic("onRotateCancel")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onRotateCancel(t0).runNow()))
    if (onRotateEnd != null) __obj.updateDynamic("onRotateEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onRotateEnd(t0).runNow()))
    if (onRotateMove != null) __obj.updateDynamic("onRotateMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onRotateMove(t0).runNow()))
    if (onRotateStart != null) __obj.updateDynamic("onRotateStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onRotateStart(t0).runNow()))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onSwipe(t0).runNow()))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.hammerjs.HammerInput) => onTap(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (recognizeWith != null) __obj.updateDynamic("recognizeWith")(recognizeWith.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactHammerProps]
  }
}

