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
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerGestureEvent
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerProperties
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ForceTouchGestureHandler {
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    feedbackOnActivation: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    id: String = null,
    maxForce: Int | Double = null,
    minForce: Int | Double = null,
    onGestureEvent: /* event */ ForceTouchGestureHandlerGestureEvent => Callback = null,
    onHandlerStateChange: /* event */ ForceTouchGestureHandlerStateChangeEvent => Callback = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref | js.Array[Ref] = null,
    waitFor: Ref | js.Array[Ref] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ForceTouchGestureHandlerProperties, 
    typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler, 
    Unit, 
    ForceTouchGestureHandlerProperties
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(feedbackOnActivation)) __obj.updateDynamic("feedbackOnActivation")(feedbackOnActivation.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (minForce != null) __obj.updateDynamic("minForce")(minForce.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerGestureEvent) => onGestureEvent(t0).runNow()))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerStateChangeEvent) => onHandlerStateChange(t0).runNow()))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerProperties])(children: _*)
  }
  @JSImport("react-native-gesture-handler", "ForceTouchGestureHandler")
  @js.native
  object componentImport extends js.Object
  
}

