package typingsJapgolly.reactNativeLoadingSpinnerOverlay.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.mod.SpinnerProps
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.mod.default
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.fade
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.large
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.none
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.normal
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.slide
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeLoadingSpinnerOverlay {
  def apply(
    animation: none | slide | fade = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    overlayColor: String = null,
    size: normal | small | large = null,
    textContent: String = null,
    textStyle: StyleProp[TextStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SpinnerProps, default, Unit, SpinnerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeLoadingSpinnerOverlay.mod.SpinnerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeLoadingSpinnerOverlay.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeLoadingSpinnerOverlay.mod.SpinnerProps])(children: _*)
  }
  @JSImport("react-native-loading-spinner-overlay", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

