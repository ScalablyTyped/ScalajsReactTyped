package typingsJapgolly.reactNativeKeyboardSpacer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeKeyboardSpacer.mod.KeyboardSpacerProps
import typingsJapgolly.reactNativeKeyboardSpacer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeKeyboardSpacer {
  def apply(
    onToggle: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Callback = null,
    style: StyleProp[ViewStyle] = null,
    topSpacing: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[KeyboardSpacerProps, default, Unit, KeyboardSpacerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2((t0: /* keyboardIsOpen */ scala.Boolean, t1: /* keyboardSpace */ scala.Double) => onToggle(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topSpacing != null) __obj.updateDynamic("topSpacing")(topSpacing.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeKeyboardSpacer.mod.KeyboardSpacerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeKeyboardSpacer.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeKeyboardSpacer.mod.KeyboardSpacerProps])(children: _*)
  }
  @JSImport("react-native-keyboard-spacer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

