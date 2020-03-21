package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.mod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    backgroundColor: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    height: Int | Double = null,
    highlightColor: String = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    overlayColor: String = null,
    pointerColor: String = null,
    popover: VdomElement = null,
    toggleOnPress: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    withOverlay: js.UndefOr[Boolean] = js.undefined,
    withPointer: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TooltipProps, typingsJapgolly.reactNativeElements.mod.Tooltip, Unit, TooltipProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (pointerColor != null) __obj.updateDynamic("pointerColor")(pointerColor.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnPress)) __obj.updateDynamic("toggleOnPress")(toggleOnPress.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(withPointer)) __obj.updateDynamic("withPointer")(withPointer.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.Tooltip](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.TooltipProps])(children: _*)
  }
  @JSImport("react-native-elements", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
}

