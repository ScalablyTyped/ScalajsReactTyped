package typingsJapgolly.rcPicker.dateHeaderMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
  def onMonthClick(): Unit
  def onNextMonth(): Unit
  def onNextYear(): Unit
  def onPrevMonth(): Unit
  def onPrevYear(): Unit
  def onYearClick(): Unit
}

object DateHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onMonthClick: Callback,
    onNextMonth: Callback,
    onNextYear: Callback,
    onPrevMonth: Callback,
    onPrevYear: Callback,
    onYearClick: Callback,
    prefixCls: String,
    viewDate: DateType,
    value: DateType = null
  ): DateHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onMonthClick")(onMonthClick.toJsFn)
    __obj.updateDynamic("onNextMonth")(onNextMonth.toJsFn)
    __obj.updateDynamic("onNextYear")(onNextYear.toJsFn)
    __obj.updateDynamic("onPrevMonth")(onPrevMonth.toJsFn)
    __obj.updateDynamic("onPrevYear")(onPrevYear.toJsFn)
    __obj.updateDynamic("onYearClick")(onYearClick.toJsFn)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateHeaderProps[DateType]]
  }
}

