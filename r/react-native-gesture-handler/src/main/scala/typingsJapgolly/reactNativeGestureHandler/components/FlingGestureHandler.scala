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
import typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandlerGestureEvent
import typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandlerProperties
import typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlingGestureHandler {
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
    waitFor: Ref | js.Array[Ref] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FlingGestureHandlerProperties, 
    typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandler, 
    Unit, 
    FlingGestureHandlerProperties
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandlerProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandler](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeGestureHandler.mod.FlingGestureHandlerProperties])(children: _*)
  }
  @JSImport("react-native-gesture-handler", "FlingGestureHandler")
  @js.native
  object componentImport extends js.Object
  
}

