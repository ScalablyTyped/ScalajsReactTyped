package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAnimation
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.collapse
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.landscape
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.left
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.overlay
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.portrait
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.right
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.split
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SplitterSide {
  def apply(
    animation: overlay | default = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    collapse: portrait | landscape | Boolean = null,
    id: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mode: collapse | split = null,
    onClose: /* e */ js.UndefOr[Event_] => Callback = null,
    onModeChange: /* e */ js.UndefOr[Event_] => Callback = null,
    onOpen: /* e */ js.UndefOr[Event_] => Callback = null,
    onPreClose: /* e */ js.UndefOr[Event_] => Callback = null,
    onPreOpen: /* e */ js.UndefOr[Event_] => Callback = null,
    openThreshold: Int | Double = null,
    side: left | right = null,
    style: CSSProperties = null,
    swipeTargetWidth: Int | Double = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameAnimation, 
    typingsJapgolly.reactOnsenui.mod.SplitterSide, 
    Unit, 
    HTMLAttributesidclassNameAnimation
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onClose(t0).runNow()))
    if (onModeChange != null) __obj.updateDynamic("onModeChange")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onModeChange(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onOpen(t0).runNow()))
    if (onPreClose != null) __obj.updateDynamic("onPreClose")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onPreClose(t0).runNow()))
    if (onPreOpen != null) __obj.updateDynamic("onPreOpen")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onPreOpen(t0).runNow()))
    if (openThreshold != null) __obj.updateDynamic("openThreshold")(openThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeTargetWidth != null) __obj.updateDynamic("swipeTargetWidth")(swipeTargetWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAnimation, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.SplitterSide](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAnimation])(children: _*)
  }
  @JSImport("react-onsenui", "SplitterSide")
  @js.native
  object componentImport extends js.Object
  
}

