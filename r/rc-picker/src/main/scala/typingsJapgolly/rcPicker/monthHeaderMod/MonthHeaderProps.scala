package typingsJapgolly.rcPicker.monthHeaderMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var prefixCls: String
  var viewDate: DateType
  def onNextYear(): Unit
  def onPrevYear(): Unit
  def onYearClick(): Unit
}

object MonthHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onNextYear: Callback,
    onPrevYear: Callback,
    onYearClick: Callback,
    prefixCls: String,
    viewDate: DateType
  ): MonthHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onNextYear")(onNextYear.toJsFn)
    __obj.updateDynamic("onPrevYear")(onPrevYear.toJsFn)
    __obj.updateDynamic("onYearClick")(onYearClick.toJsFn)
    __obj.asInstanceOf[MonthHeaderProps[DateType]]
  }
}

