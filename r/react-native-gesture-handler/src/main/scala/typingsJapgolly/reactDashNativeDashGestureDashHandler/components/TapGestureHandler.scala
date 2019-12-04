package typingsJapgolly.reactDashNativeDashGestureDashHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Bottom
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_BottomHeight
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Height
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Left
import typingsJapgolly.reactDashNativeDashGestureDashHandler.Anon_Right
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandlerGestureEvent
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandlerProperties
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TapGestureHandler {
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
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
    waitFor: Ref | js.Array[Ref] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TapGestureHandlerProperties, 
    typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandler, 
    Unit, 
    TapGestureHandlerProperties
  ] = {
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
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandlerGestureEvent) => onGestureEvent(t0).runNow()))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandlerStateChangeEvent) => onHandlerStateChange(t0).runNow()))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandlerProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandler](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TapGestureHandlerProperties])(children: _*)
  }
  @JSImport("react-native-gesture-handler", "TapGestureHandler")
  @js.native
  object componentImport extends js.Object
  
}

