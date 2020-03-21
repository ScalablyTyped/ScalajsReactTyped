package typingsJapgolly.reactNativeGestureHandler.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.reactNativeGestureHandler.AnonBottom
import typingsJapgolly.reactNativeGestureHandler.AnonBottomHeight
import typingsJapgolly.reactNativeGestureHandler.AnonHeight
import typingsJapgolly.reactNativeGestureHandler.AnonLeft
import typingsJapgolly.reactNativeGestureHandler.AnonRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongPressGestureHandlerProperties extends GestureHandlerProperties {
  var maxDist: js.UndefOr[Double] = js.undefined
  var minDurationMs: js.UndefOr[Double] = js.undefined
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerStateChangeEvent, Unit]] = js.undefined
}

object LongPressGestureHandlerProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    id: String = null,
    maxDist: Int | Double = null,
    minDurationMs: Int | Double = null,
    onGestureEvent: /* event */ LongPressGestureHandlerGestureEvent => Callback = null,
    onHandlerStateChange: /* event */ LongPressGestureHandlerStateChangeEvent => Callback = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref | js.Array[Ref] = null,
    waitFor: Ref | js.Array[Ref] = null
  ): LongPressGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxDist != null) __obj.updateDynamic("maxDist")(maxDist.asInstanceOf[js.Any])
    if (minDurationMs != null) __obj.updateDynamic("minDurationMs")(minDurationMs.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.LongPressGestureHandlerGestureEvent) => onGestureEvent(t0).runNow()))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.LongPressGestureHandlerStateChangeEvent) => onHandlerStateChange(t0).runNow()))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressGestureHandlerProperties]
  }
}

