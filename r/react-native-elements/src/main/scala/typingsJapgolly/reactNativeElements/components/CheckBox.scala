package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.PartialTextProperties
import typingsJapgolly.reactNativeElements.mod.CheckBoxProps
import typingsJapgolly.reactNativeElements.mod.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CheckBox {
  def apply(
    checked: Boolean,
    Component: ComponentClassP[js.Object] = null,
    center: js.UndefOr[Boolean] = js.undefined,
    checkedColor: String = null,
    checkedIcon: String | Element = null,
    checkedTitle: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    fontFamily: String = null,
    iconRight: js.UndefOr[Boolean] = js.undefined,
    iconType: IconType = null,
    onIconPress: js.UndefOr[Callback] = js.undefined,
    onLongIconPress: js.UndefOr[Callback] = js.undefined,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    right: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    textStyle: StyleProp[TextStyle] = null,
    title: String | Element = null,
    titleProps: PartialTextProperties = null,
    uncheckedColor: String = null,
    uncheckedIcon: String | Element = null,
    wrapperStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CheckBoxProps, typingsJapgolly.reactNativeElements.mod.CheckBox, Unit, CheckBoxProps] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
  
      if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor.asInstanceOf[js.Any])
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (checkedTitle != null) __obj.updateDynamic("checkedTitle")(checkedTitle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRight)) __obj.updateDynamic("iconRight")(iconRight.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    onIconPress.foreach(p => __obj.updateDynamic("onIconPress")(p.toJsFn))
    onLongIconPress.foreach(p => __obj.updateDynamic("onLongIconPress")(p.toJsFn))
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (uncheckedColor != null) __obj.updateDynamic("uncheckedColor")(uncheckedColor.asInstanceOf[js.Any])
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.CheckBoxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.CheckBox](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.CheckBoxProps])(children: _*)
  }
  @JSImport("react-native-elements", "CheckBox")
  @js.native
  object componentImport extends js.Object
  
}

