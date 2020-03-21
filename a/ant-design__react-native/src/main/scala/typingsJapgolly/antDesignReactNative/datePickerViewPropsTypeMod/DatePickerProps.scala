package typingsJapgolly.antDesignReactNative.datePickerViewPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.AnonDatePickerLocale
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.date
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.datetime
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.month
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.time
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.year
import typingsJapgolly.antDesignReactNative.datePickerPropsTypeMod.DatePickerPropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends DatePickerPropsType {
  var styles: js.UndefOr[js.Any] = js.undefined
  var triggerTypes: js.UndefOr[String] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    date: js.Any = null,
    defaultDate: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: VdomNode = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    itemStyle: StyleProp[ViewStyle] = null,
    locale: AnonDatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: VdomNode = null,
    onChange: /* value */ js.Date => Callback = null,
    onDateChange: /* date */ js.Any => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Callback = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Callback = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null,
    title: VdomNode = null,
    triggerTypes: String = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2((t0: /* day */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatDay(t0, t1).runNow()))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2((t0: /* month */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatMonth(t0, t1).runNow()))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Date) => onChange(t0).runNow()))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: /* date */ js.Any) => onDateChange(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3((t0: /* date */ js.Any, t1: /* vals */ js.Any, t2: /* index */ scala.Double) => onScrollChange(t0, t1, t2).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* vals */ js.Any, t1: /* index */ scala.Double) => onValueChange(t0, t1).runNow()))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (triggerTypes != null) __obj.updateDynamic("triggerTypes")(triggerTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}

