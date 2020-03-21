package typingsJapgolly.reactNativePopupDialog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePopupDialog.mod.DialogProps
import typingsJapgolly.reactNativePopupDialog.mod.FadeAnimation
import typingsJapgolly.reactNativePopupDialog.mod.OverlayPointerEventTypes
import typingsJapgolly.reactNativePopupDialog.mod.ScaleAnimation
import typingsJapgolly.reactNativePopupDialog.mod.SlideAnimation
import typingsJapgolly.reactNativePopupDialog.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativePopupDialog {
  def apply(
    animationDuration: Int | Double = null,
    containerStyle: StyleProp[ViewStyle] = null,
    dialogAnimation: FadeAnimation | ScaleAnimation | SlideAnimation = null,
    dialogStyle: StyleProp[ViewStyle] = null,
    dialogTitle: js.Any = null,
    footer: js.Any = null,
    hasOverlay: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onHardwareBackPress: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    onTouchOutside: js.UndefOr[Callback] = js.undefined,
    overlayBackgroundColor: String = null,
    overlayOpacity: Int | Double = null,
    overlayPointerEvents: OverlayPointerEventTypes = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DialogProps, default, Unit, DialogProps] = {
    val __obj = js.Dynamic.literal()
  
      if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dialogAnimation != null) __obj.updateDynamic("dialogAnimation")(dialogAnimation.asInstanceOf[js.Any])
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle.asInstanceOf[js.Any])
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOverlay)) __obj.updateDynamic("hasOverlay")(hasOverlay.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    onHardwareBackPress.foreach(p => __obj.updateDynamic("onHardwareBackPress")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    onTouchOutside.foreach(p => __obj.updateDynamic("onTouchOutside")(p.toJsFn))
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.asInstanceOf[js.Any])
    if (overlayOpacity != null) __obj.updateDynamic("overlayOpacity")(overlayOpacity.asInstanceOf[js.Any])
    if (overlayPointerEvents != null) __obj.updateDynamic("overlayPointerEvents")(overlayPointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativePopupDialog.mod.DialogProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativePopupDialog.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativePopupDialog.mod.DialogProps])(children: _*)
  }
  @JSImport("react-native-popup-dialog", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

