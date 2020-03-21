package typingsJapgolly.antdMobileRn.datePickerPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.AnonDatePickerLocale
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.date
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.datetime
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.month
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.time
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerPropsType extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dismissText: js.UndefOr[Node] = js.undefined
  var extra: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | (js.Function1[/* value */ js.Date, String])] = js.undefined
  var locale: js.UndefOr[AnonDatePickerLocale] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[datetime | date | year | month | time] = js.undefined
  var okText: js.UndefOr[Node] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Date, Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DatePickerPropsType {
  @scala.inline
  def apply(
    children: VdomNode = null,
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
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Callback = null,
    title: VdomNode = null,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
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
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* vals */ js.Any, t1: /* index */ scala.Double) => onValueChange(t0, t1).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerPropsType]
  }
}

