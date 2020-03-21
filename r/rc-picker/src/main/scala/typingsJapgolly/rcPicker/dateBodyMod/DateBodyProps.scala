package typingsJapgolly.rcPicker.dateBodyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import typingsJapgolly.rcPicker.interfaceMod.OnSelect
import typingsJapgolly.rcPicker.rcPickerStrings.key
import typingsJapgolly.rcPicker.rcPickerStrings.mouse
import typingsJapgolly.rcPicker.rcPickerStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateBodyProps[DateType] extends DateBodyPassProps[DateType] {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var onSelect: OnSelect[DateType]
  var prefixCls: String
  var rowCount: Double
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
}

object DateBodyProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: (DateType, /* type */ key | mouse | submit) => Callback,
    prefixCls: String,
    rowCount: Double,
    viewDate: DateType,
    dateRender: (DateType, DateType) => CallbackTo[Node] = null,
    disabledDate: DateType => CallbackTo[Boolean] = null,
    prefixColumn: DateType => CallbackTo[Node] = null,
    rowClassName: DateType => CallbackTo[String] = null,
    value: DateType = null
  ): DateBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: DateType, t1: /* type */ typingsJapgolly.rcPicker.rcPickerStrings.key | typingsJapgolly.rcPicker.rcPickerStrings.mouse | typingsJapgolly.rcPicker.rcPickerStrings.submit) => onSelect(t0, t1).runNow()))
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: DateType, t1: DateType) => dateRender(t0, t1).runNow()))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: DateType) => disabledDate(t0).runNow()))
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1((t0: DateType) => prefixColumn(t0).runNow()))
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1((t0: DateType) => rowClassName(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateBodyProps[DateType]]
  }
}

