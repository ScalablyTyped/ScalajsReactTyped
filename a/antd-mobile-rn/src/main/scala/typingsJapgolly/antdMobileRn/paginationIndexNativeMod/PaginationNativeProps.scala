package typingsJapgolly.antdMobileRn.paginationIndexNativeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.button
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.number
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.pointer
import typingsJapgolly.antdMobileRn.paginationPropsTypeMod.PaginationPropsType
import typingsJapgolly.antdMobileRn.paginationStyleIndexNativeMod.IPaginationStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNativeProps extends PaginationPropsType {
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[IPaginationStyle] = js.undefined
}

object PaginationNativeProps {
  @scala.inline
  def apply(
    current: Double,
    total: Double,
    indicatorStyle: StyleProp[ViewStyle] = null,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Callback = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrev: js.UndefOr[Callback] = js.undefined,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: IPaginationStyle = null
  ): PaginationNativeProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* current */ scala.Double) => onChange(t0).runNow()))
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrev.foreach(p => __obj.updateDynamic("onPrev")(p.toJsFn))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationNativeProps]
  }
}

