package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.ButtonProps
import typingsJapgolly.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  def apply(
    title: String,
    onPress: ReactEventFrom[NodeHandle with Element] => Callback,
    accessibilityLabel: String = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ButtonProps, typingsJapgolly.reactNative.mod.Button, Unit, ButtonProps] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNative.mod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNative.mod.Button](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNative.mod.ButtonProps])(children: _*)
  }
  @JSImport("react-native", "Button")
  @js.native
  object componentImport extends js.Object
  
}

