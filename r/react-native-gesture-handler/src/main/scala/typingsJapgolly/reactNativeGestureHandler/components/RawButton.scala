package typingsJapgolly.reactNativeGestureHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeGestureHandler.AnonBottom
import typingsJapgolly.reactNativeGestureHandler.AnonBottomHeight
import typingsJapgolly.reactNativeGestureHandler.AnonHeight
import typingsJapgolly.reactNativeGestureHandler.AnonLeft
import typingsJapgolly.reactNativeGestureHandler.AnonRight
import typingsJapgolly.reactNativeGestureHandler.mod.NativeViewGestureHandlerGestureEvent
import typingsJapgolly.reactNativeGestureHandler.mod.NativeViewGestureHandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.mod.RawButtonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RawButton {
  def apply(
    accessibilityLabel: String = null,
    disallowInterruption: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    id: String = null,
    onGestureEvent: /* event */ NativeViewGestureHandlerGestureEvent => Callback = null,
    onHandlerStateChange: /* event */ NativeViewGestureHandlerStateChangeEvent => Callback = null,
    shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref | js.Array[Ref] = null,
    testID: String = null,
    waitFor: Ref | js.Array[Ref] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RawButtonProperties, 
    typingsJapgolly.reactNativeGestureHandler.mod.RawButton, 
    Unit, 
    RawButtonProperties
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(disallowInterruption)) __obj.updateDynamic("disallowInterruption")(disallowInterruption.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.NativeViewGestureHandlerGestureEvent) => onGestureEvent(t0).runNow()))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeGestureHandler.mod.NativeViewGestureHandlerStateChangeEvent) => onHandlerStateChange(t0).runNow()))
    if (!js.isUndefined(shouldActivateOnStart)) __obj.updateDynamic("shouldActivateOnStart")(shouldActivateOnStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeGestureHandler.mod.RawButtonProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeGestureHandler.mod.RawButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeGestureHandler.mod.RawButtonProperties])(children: _*)
  }
  @JSImport("react-native-gesture-handler", "RawButton")
  @js.native
  object componentImport extends js.Object
  
}

