package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ionicCore.anon.Am
import typingsJapgolly.ionicCore.anon.Day
import typingsJapgolly.ionicCore.anon.DayOfWeek
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeParts
import typingsJapgolly.ionicCore.distTypesComponentsPickerColumnInternalPickerColumnInternalInterfacesMod.PickerColumnItem
import typingsJapgolly.ionicCore.ionicCoreStrings.h12
import typingsJapgolly.ionicCore.ionicCoreStrings.h23
import typingsJapgolly.ionicCore.mod.Mode
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeUtilsDataMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/utils/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateMonths(refParts: DatetimeParts): js.Array[DatetimeParts] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMonths")(refParts.asInstanceOf[js.Any]).asInstanceOf[js.Array[DatetimeParts]]
  
  inline def generateTime(refParts: DatetimeParts): Am = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any]).asInstanceOf[Am]
  inline def generateTime(refParts: DatetimeParts, hourCycle: h12 | h23): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: Unit,
    maxParts: Unit,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: Unit,
    maxParts: Unit,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: Unit,
    maxParts: Unit,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(refParts: DatetimeParts, hourCycle: h12 | h23, minParts: Unit, maxParts: DatetimeParts): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: Unit,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: Unit,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: Unit,
    maxParts: DatetimeParts,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(refParts: DatetimeParts, hourCycle: h12 | h23, minParts: DatetimeParts): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: DatetimeParts,
    maxParts: Unit,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: DatetimeParts,
    maxParts: Unit,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: DatetimeParts,
    maxParts: Unit,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(refParts: DatetimeParts, hourCycle: h12 | h23, minParts: DatetimeParts, maxParts: DatetimeParts): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: h12 | h23,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: Unit,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: Unit,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: Unit,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(refParts: DatetimeParts, hourCycle: Unit, minParts: Unit, maxParts: DatetimeParts): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: DatetimeParts,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(refParts: DatetimeParts, hourCycle: Unit, minParts: DatetimeParts): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: Unit,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: Unit,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: Unit,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(refParts: DatetimeParts, hourCycle: Unit, minParts: DatetimeParts, maxParts: DatetimeParts): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    hourValues: js.Array[Double],
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  inline def generateTime(
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    hourValues: Unit,
    minuteValues: js.Array[Double]
  ): Am = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTime")(refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], hourValues.asInstanceOf[js.Any], minuteValues.asInstanceOf[js.Any])).asInstanceOf[Am]
  
  inline def getCombinedDateColumnData(locale: String, todayParts: DatetimeParts, minParts: DatetimeParts, maxParts: DatetimeParts): CombinedDateColumnData = (^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedDateColumnData")(locale.asInstanceOf[js.Any], todayParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[CombinedDateColumnData]
  inline def getCombinedDateColumnData(
    locale: String,
    todayParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    dayValues: js.Array[Double]
  ): CombinedDateColumnData = (^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedDateColumnData")(locale.asInstanceOf[js.Any], todayParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any])).asInstanceOf[CombinedDateColumnData]
  inline def getCombinedDateColumnData(
    locale: String,
    todayParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    dayValues: js.Array[Double],
    monthValues: js.Array[Double]
  ): CombinedDateColumnData = (^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedDateColumnData")(locale.asInstanceOf[js.Any], todayParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any])).asInstanceOf[CombinedDateColumnData]
  inline def getCombinedDateColumnData(
    locale: String,
    todayParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    dayValues: Unit,
    monthValues: js.Array[Double]
  ): CombinedDateColumnData = (^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedDateColumnData")(locale.asInstanceOf[js.Any], todayParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any])).asInstanceOf[CombinedDateColumnData]
  
  inline def getDayColumnData(locale: String, refParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: Unit,
    dayValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: Unit,
    dayValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: Unit,
    dayValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(locale: String, refParts: DatetimeParts, minParts: Unit, maxParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: DatetimeParts,
    dayValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: DatetimeParts,
    dayValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: DatetimeParts,
    dayValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(locale: String, refParts: DatetimeParts, minParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: Unit,
    dayValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: Unit,
    dayValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: Unit,
    dayValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(locale: String, refParts: DatetimeParts, minParts: DatetimeParts, maxParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    dayValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    dayValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getDayColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    dayValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], dayValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  
  inline def getDaysOfMonth(month: Double, year: Double, firstDayOfWeek: Double): js.Array[Day | DayOfWeek] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDaysOfMonth")(month.asInstanceOf[js.Any], year.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Array[Day | DayOfWeek]]
  
  inline def getDaysOfWeek(locale: String, mode: Mode): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDaysOfWeek")(locale.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getDaysOfWeek(locale: String, mode: Mode, firstDayOfWeek: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDaysOfWeek")(locale.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getMonthColumnData(locale: String, refParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: Unit,
    monthValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: Unit,
    monthValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: Unit,
    monthValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(locale: String, refParts: DatetimeParts, minParts: Unit, maxParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: DatetimeParts,
    monthValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: DatetimeParts,
    monthValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: DatetimeParts,
    monthValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(locale: String, refParts: DatetimeParts, minParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: Unit,
    monthValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: Unit,
    monthValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: Unit,
    monthValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(locale: String, refParts: DatetimeParts, minParts: DatetimeParts, maxParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    monthValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    monthValues: js.Array[Double],
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getMonthColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    monthValues: Unit,
    formatOptions: DateTimeFormatOptions
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], monthValues.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  
  inline def getTimeColumnsData(locale: String, refParts: DatetimeParts): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(locale: String, refParts: DatetimeParts, hourCycle: h23 | h12): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: Unit,
    maxParts: Unit,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: Unit,
    maxParts: Unit,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: Unit,
    maxParts: Unit,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: Unit,
    maxParts: DatetimeParts
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: Unit,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: Unit,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: Unit,
    maxParts: DatetimeParts,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(locale: String, refParts: DatetimeParts, hourCycle: h23 | h12, minParts: DatetimeParts): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: DatetimeParts,
    maxParts: Unit,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: DatetimeParts,
    maxParts: Unit,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: DatetimeParts,
    maxParts: Unit,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: DatetimeParts,
    maxParts: DatetimeParts
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: h23 | h12,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: Unit,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: Unit,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: Unit,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(locale: String, refParts: DatetimeParts, hourCycle: Unit, minParts: Unit, maxParts: DatetimeParts): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: Unit,
    maxParts: DatetimeParts,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(locale: String, refParts: DatetimeParts, hourCycle: Unit, minParts: DatetimeParts): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: Unit,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: Unit,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: Unit,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: DatetimeParts
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    allowedHourValues: js.Array[Double],
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  inline def getTimeColumnsData(
    locale: String,
    refParts: DatetimeParts,
    hourCycle: Unit,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    allowedHourValues: Unit,
    allowedMinuteVaues: js.Array[Double]
  ): StringDictionary[js.Array[PickerColumnItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeColumnsData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], allowedHourValues.asInstanceOf[js.Any], allowedMinuteVaues.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[PickerColumnItem]]]
  
  inline def getToday(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToday")().asInstanceOf[String]
  
  inline def getYearColumnData(locale: String, refParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getYearColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: Unit,
    yearValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], yearValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getYearColumnData(locale: String, refParts: DatetimeParts, minParts: Unit, maxParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getYearColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: Unit,
    maxParts: DatetimeParts,
    yearValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], yearValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getYearColumnData(locale: String, refParts: DatetimeParts, minParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getYearColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: Unit,
    yearValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], yearValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getYearColumnData(locale: String, refParts: DatetimeParts, minParts: DatetimeParts, maxParts: DatetimeParts): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  inline def getYearColumnData(
    locale: String,
    refParts: DatetimeParts,
    minParts: DatetimeParts,
    maxParts: DatetimeParts,
    yearValues: js.Array[Double]
  ): js.Array[PickerColumnItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getYearColumnData")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any], yearValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumnItem]]
  
  trait CombinedDateColumnData extends StObject {
    
    var items: js.Array[PickerColumnItem]
    
    var parts: js.Array[DatetimeParts]
  }
  object CombinedDateColumnData {
    
    inline def apply(items: js.Array[PickerColumnItem], parts: js.Array[DatetimeParts]): CombinedDateColumnData = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedDateColumnData]
    }
    
    extension [Self <: CombinedDateColumnData](x: Self) {
      
      inline def setItems(value: js.Array[PickerColumnItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: PickerColumnItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setParts(value: js.Array[DatetimeParts]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: DatetimeParts*): Self = StObject.set(x, "parts", js.Array(value*))
    }
  }
}
