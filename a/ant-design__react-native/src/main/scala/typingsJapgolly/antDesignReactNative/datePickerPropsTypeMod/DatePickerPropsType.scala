package typingsJapgolly.antDesignReactNative.datePickerPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.AnonDatePickerLocale
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.date
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.datetime
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.month
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.time
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.year
import typingsJapgolly.antDesignReactNative.datePickerPropsMod.DatePickerProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerPropsType extends DatePickerProps {
  var children: js.UndefOr[Node] = js.undefined
  @JSName("defaultDate")
  var defaultDate_DatePickerPropsType: js.UndefOr[js.Date] = js.undefined
  var dismissText: js.UndefOr[Node] = js.undefined
  var extra: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | (js.Function1[/* value */ js.Date, String])] = js.undefined
  @JSName("locale")
  var locale_DatePickerPropsType: js.UndefOr[AnonDatePickerLocale] = js.undefined
  @JSName("maxDate")
  var maxDate_DatePickerPropsType: js.UndefOr[js.Date] = js.undefined
  @JSName("minDate")
  var minDate_DatePickerPropsType: js.UndefOr[js.Date] = js.undefined
  @JSName("mode")
  var mode_DatePickerPropsType: js.UndefOr[datetime | date | year | month | time] = js.undefined
  var okText: js.UndefOr[Node] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Date, Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DatePickerPropsType {
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
    title: VdomNode = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerPropsType = {
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
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerPropsType]
  }
}

