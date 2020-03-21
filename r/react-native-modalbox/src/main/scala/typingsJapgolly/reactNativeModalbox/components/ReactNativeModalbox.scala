package typingsJapgolly.reactNativeModalbox.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalbox.mod.ModalProps
import typingsJapgolly.reactNativeModalbox.mod.default
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.bottom
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.center
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeModalbox {
  def apply(
    animationDuration: Int | Double = null,
    backButtonClose: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropContent: VdomNode = null,
    backdropOpacity: Int | Double = null,
    backdropPressToClose: js.UndefOr[Boolean] = js.undefined,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    entry: top | bottom | String = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    keyboardTopOffset: Int | Double = null,
    onClosed: js.UndefOr[Callback] = js.undefined,
    onClosingState: /* state */ Boolean => Callback = null,
    onOpened: js.UndefOr[Callback] = js.undefined,
    position: top | center | bottom | String = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    swipeArea: Int | Double = null,
    swipeThreshold: Int | Double = null,
    swipeToClose: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, default, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(backButtonClose)) __obj.updateDynamic("backButtonClose")(backButtonClose.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (backdropContent != null) __obj.updateDynamic("backdropContent")(backdropContent.rawNode.asInstanceOf[js.Any])
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropPressToClose)) __obj.updateDynamic("backdropPressToClose")(backdropPressToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (keyboardTopOffset != null) __obj.updateDynamic("keyboardTopOffset")(keyboardTopOffset.asInstanceOf[js.Any])
    onClosed.foreach(p => __obj.updateDynamic("onClosed")(p.toJsFn))
    if (onClosingState != null) __obj.updateDynamic("onClosingState")(js.Any.fromFunction1((t0: /* state */ scala.Boolean) => onClosingState(t0).runNow()))
    onOpened.foreach(p => __obj.updateDynamic("onOpened")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeArea != null) __obj.updateDynamic("swipeArea")(swipeArea.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeToClose)) __obj.updateDynamic("swipeToClose")(swipeToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeModalbox.mod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeModalbox.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeModalbox.mod.ModalProps])(children: _*)
  }
  @JSImport("react-native-modalbox", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

