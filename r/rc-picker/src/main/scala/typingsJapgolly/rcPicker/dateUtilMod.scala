package typingsJapgolly.rcPicker

import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.NullableDateType
import typingsJapgolly.rcPicker.interfaceMod.PickerMode
import typingsJapgolly.rcPicker.rcPickerNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/utils/dateUtil", JSImport.Namespace)
@js.native
object dateUtilMod extends js.Object {
  val WEEK_DAY_COUNT: `7` = js.native
  def getClosingViewDate[DateType](viewDate: DateType, picker: PickerMode, generateConfig: GenerateConfig[DateType]): DateType = js.native
  def getClosingViewDate[DateType](viewDate: DateType, picker: PickerMode, generateConfig: GenerateConfig[DateType], offset: Double): DateType = js.native
  def getWeekStartDate[DateType](locale: String, generateConfig: GenerateConfig[DateType], value: DateType): DateType = js.native
  def isEqual[DateType](
    generateConfig: GenerateConfig[DateType],
    value1: NullableDateType[DateType],
    value2: NullableDateType[DateType]
  ): Boolean = js.native
  def isInRange[DateType](
    generateConfig: GenerateConfig[DateType],
    startDate: NullableDateType[DateType],
    endDate: NullableDateType[DateType],
    current: NullableDateType[DateType]
  ): Boolean = js.native
  def isNullEqual[T](value1: T, value2: T): js.UndefOr[Boolean] = js.native
  def isSameDate[DateType](
    generateConfig: GenerateConfig[DateType],
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = js.native
  def isSameDecade[DateType](
    generateConfig: GenerateConfig[DateType],
    decade1: NullableDateType[DateType],
    decade2: NullableDateType[DateType]
  ): Boolean = js.native
  def isSameMonth[DateType](
    generateConfig: GenerateConfig[DateType],
    month1: NullableDateType[DateType],
    month2: NullableDateType[DateType]
  ): Boolean = js.native
  def isSameTime[DateType](
    generateConfig: GenerateConfig[DateType],
    time1: NullableDateType[DateType],
    time2: NullableDateType[DateType]
  ): Boolean = js.native
  def isSameWeek[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: String,
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = js.native
  def isSameYear[DateType](
    generateConfig: GenerateConfig[DateType],
    year1: NullableDateType[DateType],
    year2: NullableDateType[DateType]
  ): Boolean = js.native
}

