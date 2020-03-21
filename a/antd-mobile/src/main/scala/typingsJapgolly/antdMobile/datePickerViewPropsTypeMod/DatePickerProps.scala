package typingsJapgolly.antdMobile.datePickerViewPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.AnonDatePickerLocale
import typingsJapgolly.antdMobile.antdMobileStrings.date
import typingsJapgolly.antdMobile.antdMobileStrings.datetime
import typingsJapgolly.antdMobile.antdMobileStrings.month
import typingsJapgolly.antdMobile.antdMobileStrings.time
import typingsJapgolly.antdMobile.antdMobileStrings.year
import typingsJapgolly.antdMobile.datePickerPropsTypeMod.DatePickerPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends DatePickerPropsType {
  var className: js.UndefOr[String] = js.undefined
  var onScrollChange: js.UndefOr[js.Function3[/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: VdomNode = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    locale: AnonDatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: VdomNode = null,
    onChange: /* value */ js.Date => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onScrollChange: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double) => Callback = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Callback = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    title: VdomNode = null,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Date) => onChange(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3((t0: /* newValue */ js.Any, t1: /* vals */ js.Any, t2: /* index */ scala.Double) => onScrollChange(t0, t1, t2).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* vals */ js.Any, t1: /* index */ scala.Double) => onValueChange(t0, t1).runNow()))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}

