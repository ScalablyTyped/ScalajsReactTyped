package typingsJapgolly.antdMobileRn.radioItemNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antdMobileRn.AnonTarget
import typingsJapgolly.antdMobileRn.radioPropsTypeMod.RadioItemPropsType
import typingsJapgolly.antdMobileRn.radioStyleIndexNativeMod.IRadioStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioItemNativeProps extends RadioItemPropsType {
  var radioStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[IRadioStyle] = js.undefined
}

object RadioItemNativeProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* e */ AnonTarget => Callback = null,
    onClick: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    radioProps: js.Object = null,
    radioStyle: StyleProp[ImageStyle] = null,
    style: StyleProp[ViewStyle] = null,
    styles: IRadioStyle = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): RadioItemNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antdMobileRn.AnonTarget) => onChange(t0).runNow()))
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (radioProps != null) __obj.updateDynamic("radioProps")(radioProps.asInstanceOf[js.Any])
    if (radioStyle != null) __obj.updateDynamic("radioStyle")(radioStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioItemNativeProps]
  }
}

