package typingsJapgolly.rcPicker.monthBodyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthBodyProps[DateType] extends js.Object {
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
  def onSelect(value: DateType): Unit
}

object MonthBodyProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: DateType => Callback,
    prefixCls: String,
    viewDate: DateType,
    disabledDate: /* date */ DateType => CallbackTo[Boolean] = null,
    monthCellRender: (DateType, /* locale */ Locale) => CallbackTo[Node] = null,
    value: DateType = null
  ): MonthBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: DateType) => onSelect(t0).runNow()))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* date */ DateType) => disabledDate(t0).runNow()))
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2((t0: DateType, t1: /* locale */ typingsJapgolly.rcPicker.interfaceMod.Locale) => monthCellRender(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthBodyProps[DateType]]
  }
}

