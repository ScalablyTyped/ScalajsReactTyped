package typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Bottom
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_BottomHeight
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Height
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Left
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationGestureHandlerProperties extends GestureHandlerProperties {
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ RotationGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ RotationGestureHandlerStateChangeEvent, Unit]] = js.undefined
}

object RotationGestureHandlerProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    id: String = null,
    onGestureEvent: /* event */ RotationGestureHandlerGestureEvent => Callback = null,
    onHandlerStateChange: /* event */ RotationGestureHandlerStateChangeEvent => Callback = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref | js.Array[Ref] = null,
    waitFor: Ref | js.Array[Ref] = null
  ): RotationGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandlerGestureEvent) => onGestureEvent(t0).runNow()))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandlerStateChangeEvent) => onHandlerStateChange(t0).runNow()))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationGestureHandlerProperties]
  }
}

