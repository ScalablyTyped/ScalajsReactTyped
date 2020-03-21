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

trait FlingGestureHandlerProperties extends GestureHandlerProperties {
  var direction: js.UndefOr[Double] = js.undefined
  var numberOfPointers: js.UndefOr[Double] = js.undefined
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerStateChangeEvent, Unit]] = js.undefined
}

object FlingGestureHandlerProperties {
  @scala.inline
  def apply(
    direction: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    id: String = null,
    numberOfPointers: Int | Double = null,
    onGestureEvent: /* event */ FlingGestureHandlerGestureEvent => Callback = null,
    onHandlerStateChange: /* event */ FlingGestureHandlerStateChangeEvent => Callback = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref | js.Array[Ref] = null,
    waitFor: Ref | js.Array[Ref] = null
  ): FlingGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (numberOfPointers != null) __obj.updateDynamic("numberOfPointers")(numberOfPointers.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandlerGestureEvent) => onGestureEvent(t0).runNow()))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandlerStateChangeEvent) => onHandlerStateChange(t0).runNow()))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlingGestureHandlerProperties]
  }
}

