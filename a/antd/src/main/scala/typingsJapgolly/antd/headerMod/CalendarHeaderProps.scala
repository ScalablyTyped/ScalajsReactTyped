package typingsJapgolly.antd.headerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.generateCalendarMod.CalendarMode
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarHeaderProps[DateType] extends js.Object {
  var fullscreen: Boolean
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var mode: CalendarMode
  var prefixCls: String
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
  var value: DateType
  def onChange(date: DateType): Unit
  def onModeChange(mode: CalendarMode): Unit
}

object CalendarHeaderProps {
  @scala.inline
  def apply[DateType](
    fullscreen: Boolean,
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    mode: CalendarMode,
    onChange: DateType => Callback,
    onModeChange: CalendarMode => Callback,
    prefixCls: String,
    value: DateType,
    validRange: js.Tuple2[DateType, DateType] = null
  ): CalendarHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: DateType) => onChange(t0).runNow()))
    __obj.updateDynamic("onModeChange")(js.Any.fromFunction1((t0: typingsJapgolly.antd.generateCalendarMod.CalendarMode) => onModeChange(t0).runNow()))
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarHeaderProps[DateType]]
  }
}

