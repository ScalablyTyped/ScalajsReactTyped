package typingsJapgolly.reactNativeMaterialDesignSearchbar.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.ReturnKeyType
import typingsJapgolly.reactNative.mod.ReturnKeyTypeAndroid
import typingsJapgolly.reactNative.mod.ReturnKeyTypeIOS
import typingsJapgolly.reactNative.mod.TextInputProps
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarProps extends js.Object {
  var alwaysShowBackButton: js.UndefOr[Boolean] = js.undefined
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var iconBackName: js.UndefOr[String] = js.undefined
  var iconCloseName: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var iconPadding: js.UndefOr[Double] = js.undefined
  var iconSearchName: js.UndefOr[String] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var inputProps: js.UndefOr[TextInputProps] = js.undefined
  var inputStyle: js.UndefOr[TextStyle] = js.undefined
  var onBackPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEndEditing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearchChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placeholderColor: js.UndefOr[String] = js.undefined
  var returnKeyType: js.UndefOr[ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object SearchBarProps {
  @scala.inline
  def apply(
    height: Double,
    alwaysShowBackButton: js.UndefOr[Boolean] = js.undefined,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    iconBackName: String = null,
    iconCloseName: String = null,
    iconColor: String = null,
    iconPadding: Int | Double = null,
    iconSearchName: String = null,
    iconSize: Int | Double = null,
    inputProps: TextInputProps = null,
    inputStyle: TextStyle = null,
    onBackPress: js.UndefOr[Callback] = js.undefined,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onEndEditing: js.UndefOr[Callback] = js.undefined,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onSearchChange: /* text */ String => Callback = null,
    onSubmitEditing: js.UndefOr[Callback] = js.undefined,
    padding: Int | Double = null,
    placeholder: String = null,
    placeholderColor: String = null,
    returnKeyType: ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS = null,
    textStyle: TextStyle = null
  ): SearchBarProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShowBackButton)) __obj.updateDynamic("alwaysShowBackButton")(alwaysShowBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (iconBackName != null) __obj.updateDynamic("iconBackName")(iconBackName.asInstanceOf[js.Any])
    if (iconCloseName != null) __obj.updateDynamic("iconCloseName")(iconCloseName.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconPadding != null) __obj.updateDynamic("iconPadding")(iconPadding.asInstanceOf[js.Any])
    if (iconSearchName != null) __obj.updateDynamic("iconSearchName")(iconSearchName.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    onBackPress.foreach(p => __obj.updateDynamic("onBackPress")(p.toJsFn))
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onEndEditing.foreach(p => __obj.updateDynamic("onEndEditing")(p.toJsFn))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onSearchChange(t0).runNow()))
    onSubmitEditing.foreach(p => __obj.updateDynamic("onSubmitEditing")(p.toJsFn))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderColor != null) __obj.updateDynamic("placeholderColor")(placeholderColor.asInstanceOf[js.Any])
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarProps]
  }
}

