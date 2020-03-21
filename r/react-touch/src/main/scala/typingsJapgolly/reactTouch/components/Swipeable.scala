package typingsJapgolly.reactTouch.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTouch.mod.SwipeableConfig
import typingsJapgolly.reactTouch.mod.SwipeableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable {
  def apply(
    config: SwipeableConfig = null,
    onMouseDown: js.UndefOr[Callback] = js.undefined,
    onSwipeDown: js.UndefOr[Callback] = js.undefined,
    onSwipeLeft: js.UndefOr[Callback] = js.undefined,
    onSwipeRight: js.UndefOr[Callback] = js.undefined,
    onSwipeUp: js.UndefOr[Callback] = js.undefined,
    onTouchStart: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwipeableProps, typingsJapgolly.reactTouch.mod.Swipeable, Unit, SwipeableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    onMouseDown.foreach(p => __obj.updateDynamic("onMouseDown")(p.toJsFn))
    onSwipeDown.foreach(p => __obj.updateDynamic("onSwipeDown")(p.toJsFn))
    onSwipeLeft.foreach(p => __obj.updateDynamic("onSwipeLeft")(p.toJsFn))
    onSwipeRight.foreach(p => __obj.updateDynamic("onSwipeRight")(p.toJsFn))
    onSwipeUp.foreach(p => __obj.updateDynamic("onSwipeUp")(p.toJsFn))
    onTouchStart.foreach(p => __obj.updateDynamic("onTouchStart")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTouch.mod.SwipeableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTouch.mod.Swipeable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTouch.mod.SwipeableProps])(children: _*)
  }
  @JSImport("react-touch", "Swipeable")
  @js.native
  object componentImport extends js.Object
  
}

