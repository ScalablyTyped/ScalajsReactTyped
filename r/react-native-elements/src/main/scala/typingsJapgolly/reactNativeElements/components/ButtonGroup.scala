package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.mod.ButtonGroupProps
import typingsJapgolly.reactNativeElements.mod.ElementObject
import typingsJapgolly.reactNativeElements.mod.InnerBorderStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonGroup {
  def apply(
    buttons: js.Array[ElementObject | String],
    onPress: Double => Callback,
    Component: ComponentType[_] = null,
    activeOpacity: Int | Double = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    containerBorderRadius: Int | Double = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: Boolean | js.Array[Double] = null,
    disabledSelectedStyle: StyleProp[ViewStyle] = null,
    disabledSelectedTextStyle: StyleProp[TextStyle] = null,
    disabledStyle: StyleProp[ViewStyle] = null,
    disabledTextStyle: StyleProp[TextStyle] = null,
    innerBorderStyle: InnerBorderStyleProperty = null,
    lastBorderStyle: StyleProp[TextStyle | ViewStyle] = null,
    onHideUnderlay: js.UndefOr[Callback] = js.undefined,
    onShowUnderlay: js.UndefOr[Callback] = js.undefined,
    selectMultiple: js.UndefOr[Boolean] = js.undefined,
    selectedButtonStyle: StyleProp[ViewStyle] = null,
    selectedIndex: Int | Double = null,
    selectedIndexes: js.Array[Double] = null,
    selectedTextStyle: StyleProp[TextStyle] = null,
    setOpacityTo: /* value */ Double => Callback = null,
    textStyle: StyleProp[TextStyle] = null,
    underlayColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ButtonGroupProps, 
    typingsJapgolly.reactNativeElements.mod.ButtonGroup, 
    Unit, 
    ButtonGroupProps
  ] = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: scala.Double) => onPress(t0).runNow()))
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerBorderRadius != null) __obj.updateDynamic("containerBorderRadius")(containerBorderRadius.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledSelectedStyle != null) __obj.updateDynamic("disabledSelectedStyle")(disabledSelectedStyle.asInstanceOf[js.Any])
    if (disabledSelectedTextStyle != null) __obj.updateDynamic("disabledSelectedTextStyle")(disabledSelectedTextStyle.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (disabledTextStyle != null) __obj.updateDynamic("disabledTextStyle")(disabledTextStyle.asInstanceOf[js.Any])
    if (innerBorderStyle != null) __obj.updateDynamic("innerBorderStyle")(innerBorderStyle.asInstanceOf[js.Any])
    if (lastBorderStyle != null) __obj.updateDynamic("lastBorderStyle")(lastBorderStyle.asInstanceOf[js.Any])
    onHideUnderlay.foreach(p => __obj.updateDynamic("onHideUnderlay")(p.toJsFn))
    onShowUnderlay.foreach(p => __obj.updateDynamic("onShowUnderlay")(p.toJsFn))
    if (!js.isUndefined(selectMultiple)) __obj.updateDynamic("selectMultiple")(selectMultiple.asInstanceOf[js.Any])
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedIndexes != null) __obj.updateDynamic("selectedIndexes")(selectedIndexes.asInstanceOf[js.Any])
    if (selectedTextStyle != null) __obj.updateDynamic("selectedTextStyle")(selectedTextStyle.asInstanceOf[js.Any])
    if (setOpacityTo != null) __obj.updateDynamic("setOpacityTo")(js.Any.fromFunction1((t0: /* value */ scala.Double) => setOpacityTo(t0).runNow()))
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.ButtonGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.ButtonGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.ButtonGroupProps])(children: _*)
  }
  @JSImport("react-native-elements", "ButtonGroup")
  @js.native
  object componentImport extends js.Object
  
}

