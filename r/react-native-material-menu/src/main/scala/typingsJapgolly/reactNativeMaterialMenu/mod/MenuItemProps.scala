package typingsJapgolly.reactNativeMaterialMenu.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typingsJapgolly.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import typingsJapgolly.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var ellipsizeMode: js.UndefOr[clip | tail] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleMedia_] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledTextColor: String = null,
    ellipsizeMode: clip | tail = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: StyleMedia_ = null,
    textStyle: TextStyle = null,
    underlayColor: String = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

