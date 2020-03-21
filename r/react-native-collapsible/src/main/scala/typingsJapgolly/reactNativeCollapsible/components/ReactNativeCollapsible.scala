package typingsJapgolly.reactNativeCollapsible.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.mod.CollapsibleProps
import typingsJapgolly.reactNativeCollapsible.mod.EasingMode
import typingsJapgolly.reactNativeCollapsible.mod.default
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCollapsible {
  def apply(
    align: top | center | bottom = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedHeight: Int | Double = null,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    enablePointerEvents: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CollapsibleProps, default, Unit, CollapsibleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePointerEvents)) __obj.updateDynamic("enablePointerEvents")(enablePointerEvents.asInstanceOf[js.Any])
    onAnimationEnd.foreach(p => __obj.updateDynamic("onAnimationEnd")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeCollapsible.mod.CollapsibleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeCollapsible.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeCollapsible.mod.CollapsibleProps])(children: _*)
  }
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

