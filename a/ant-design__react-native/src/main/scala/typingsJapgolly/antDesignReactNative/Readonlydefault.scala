package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/MultiPickerProps.default> */
trait Readonlydefault extends js.Object {
  val children: js.UndefOr[js.Any] = js.undefined
  val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  val rootNativeProps: js.UndefOr[js.Any] = js.undefined
  val selectedValue: js.UndefOr[js.Array[_]] = js.undefined
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object Readonlydefault {
  @scala.inline
  def apply(
    children: js.Any = null,
    onScrollChange: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Callback = null,
    onValueChange: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Callback = null,
    rootNativeProps: js.Any = null,
    selectedValue: js.Array[_] = null,
    style: StyleProp[ViewStyle] = null
  ): Readonlydefault = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction2((t0: /* v */ js.UndefOr[js.Any], t1: /* i */ js.UndefOr[scala.Double]) => onScrollChange(t0, t1).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* v */ js.UndefOr[js.Any], t1: /* i */ js.UndefOr[scala.Double]) => onValueChange(t0, t1).runNow()))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlydefault]
  }
}

