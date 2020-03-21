package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.mod.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.CheckBoxProps> */
trait PartialCheckBoxProps extends js.Object {
  var Component: js.UndefOr[ComponentClassP[js.Object]] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedColor: js.UndefOr[String] = js.undefined
  var checkedIcon: js.UndefOr[String | Element] = js.undefined
  var checkedTitle: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var iconRight: js.UndefOr[Boolean] = js.undefined
  var iconType: js.UndefOr[IconType] = js.undefined
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var title: js.UndefOr[String | Element] = js.undefined
  var titleProps: js.UndefOr[PartialTextProperties] = js.undefined
  var uncheckedColor: js.UndefOr[String] = js.undefined
  var uncheckedIcon: js.UndefOr[String | Element] = js.undefined
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PartialCheckBoxProps {
  @scala.inline
  def apply(
    Component: ComponentClassP[js.Object] = null,
    center: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
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
    wrapperStyle: StyleProp[ViewStyle] = null
  ): PartialCheckBoxProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[PartialCheckBoxProps]
  }
}

