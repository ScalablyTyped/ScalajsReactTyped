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

trait TapGestureHandlerProperties extends GestureHandlerProperties {
  var maxDelayMs: js.UndefOr[Double] = js.undefined
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  var maxDist: js.UndefOr[Double] = js.undefined
  var maxDurationMs: js.UndefOr[Double] = js.undefined
  var minPointers: js.UndefOr[Double] = js.undefined
  var numberOfTaps: js.UndefOr[Double] = js.undefined
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ TapGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ TapGestureHandlerStateChangeEvent, Unit]] = js.undefined
}

object TapGestureHandlerProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    id: String = null,
    maxDelayMs: Int | Double = null,
    maxDeltaX: Int | Double = null,
    maxDeltaY: Int | Double = null,
    maxDist: Int | Double = null,
    maxDurationMs: Int | Double = null,
    minPointers: Int | Double = null,
    numberOfTaps: Int | Double = null,
    onGestureEvent: /* event */ TapGestureHandlerGestureEvent => Callback = null,
    onHandlerStateChange: /* event */ TapGestureHandlerStateChangeEvent => Callback = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref | js.Array[Ref] = null,
    waitFor: Ref | js.Array[Ref] = null
  ): TapGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxDelayMs != null) __obj.updateDynamic("maxDelayMs")(maxDelayMs.asInstanceOf[js.Any])
    if (maxDeltaX != null) __obj.updateDynamic("maxDeltaX")(maxDeltaX.asInstanceOf[js.Any])
    if (maxDeltaY != null) __obj.updateDynamic("maxDeltaY")(maxDeltaY.asInstanceOf[js.Any])
    if (maxDist != null) __obj.updateDynamic("maxDist")(maxDist.asInstanceOf[js.Any])
    if (maxDurationMs != null) __obj.updateDynamic("maxDurationMs")(maxDurationMs.asInstanceOf[js.Any])
    if (minPointers != null) __obj.updateDynamic("minPointers")(minPointers.asInstanceOf[js.Any])
    if (numberOfTaps != null) __obj.updateDynamic("numberOfTaps")(numberOfTaps.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.TapGestureHandlerGestureEvent) => onGestureEvent(t0).runNow()))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.TapGestureHandlerStateChangeEvent) => onHandlerStateChange(t0).runNow()))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapGestureHandlerProperties]
  }
}

