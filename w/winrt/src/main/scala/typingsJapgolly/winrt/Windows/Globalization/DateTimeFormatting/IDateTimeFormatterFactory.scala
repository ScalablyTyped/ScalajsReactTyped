package typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimeFormatterFactory extends js.Object {
  def createDateTimeFormatter(formatTemplate: String): DateTimeFormatter
  def createDateTimeFormatterContext(
    formatTemplate: String,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ): DateTimeFormatter
  def createDateTimeFormatterDate(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat
  ): DateTimeFormatter
  def createDateTimeFormatterDateTimeContext(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ): DateTimeFormatter
  def createDateTimeFormatterDateTimeLanguages(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String]
  ): DateTimeFormatter
  def createDateTimeFormatterLanguages(formatTemplate: String, languages: IIterable[String]): DateTimeFormatter
  def createDateTimeFormatterTime(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat): DateTimeFormatter
}

object IDateTimeFormatterFactory {
  @scala.inline
  def apply(
    createDateTimeFormatter: String => CallbackTo[DateTimeFormatter],
    createDateTimeFormatterContext: (String, IIterable[String], String, String, String) => CallbackTo[DateTimeFormatter],
    createDateTimeFormatterDate: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat) => CallbackTo[DateTimeFormatter],
    createDateTimeFormatterDateTimeContext: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String], String, String, String) => CallbackTo[DateTimeFormatter],
    createDateTimeFormatterDateTimeLanguages: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String]) => CallbackTo[DateTimeFormatter],
    createDateTimeFormatterLanguages: (String, IIterable[String]) => CallbackTo[DateTimeFormatter],
    createDateTimeFormatterTime: (HourFormat, MinuteFormat, SecondFormat) => CallbackTo[DateTimeFormatter]
  ): IDateTimeFormatterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDateTimeFormatter")(js.Any.fromFunction1((t0: java.lang.String) => createDateTimeFormatter(t0).runNow()))
    __obj.updateDynamic("createDateTimeFormatterContext")(js.Any.fromFunction5((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String], t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => createDateTimeFormatterContext(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("createDateTimeFormatterDate")(js.Any.fromFunction4((t0: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.YearFormat, t1: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat, t2: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.DayFormat, t3: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat) => createDateTimeFormatterDate(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("createDateTimeFormatterDateTimeContext")(js.Any.fromFunction11((t0: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.YearFormat, t1: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat, t2: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.DayFormat, t3: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat, t4: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.HourFormat, t5: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat, t6: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat, t7: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String], t8: java.lang.String, t9: java.lang.String, t10: java.lang.String) => createDateTimeFormatterDateTimeContext(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).runNow()))
    __obj.updateDynamic("createDateTimeFormatterDateTimeLanguages")(js.Any.fromFunction8((t0: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.YearFormat, t1: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat, t2: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.DayFormat, t3: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat, t4: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.HourFormat, t5: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat, t6: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat, t7: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => createDateTimeFormatterDateTimeLanguages(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    __obj.updateDynamic("createDateTimeFormatterLanguages")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => createDateTimeFormatterLanguages(t0, t1).runNow()))
    __obj.updateDynamic("createDateTimeFormatterTime")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.HourFormat, t1: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.MinuteFormat, t2: typingsJapgolly.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat) => createDateTimeFormatterTime(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IDateTimeFormatterFactory]
  }
}

