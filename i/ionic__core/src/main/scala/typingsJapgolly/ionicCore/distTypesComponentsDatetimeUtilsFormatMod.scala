package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeParts
import typingsJapgolly.ionicCore.ionicCoreStrings.am
import typingsJapgolly.ionicCore.ionicCoreStrings.pm
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeUtilsFormatMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/utils/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTimePadding(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addTimePadding")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatValue(): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatValue")().asInstanceOf[js.UndefOr[String | Null]]
  inline def formatValue(value: String): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def formatValue(value: js.Array[String]): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def generateDayAriaLabel(locale: String, today: Boolean, refParts: DatetimeParts): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDayAriaLabel")(locale.asInstanceOf[js.Any], today.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getDay(locale: String, refParts: DatetimeParts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDay")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFormattedHour(hour: Double, use24Hour: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedHour")(hour.asInstanceOf[js.Any], use24Hour.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getLocalizedDateTime(locale: String, refParts: DatetimeParts, options: DateTimeFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedDateTime")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getLocalizedDateTimeParts(locale: String, refParts: DatetimeParts, options: DateTimeFormatOptions): js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedDateTimeParts")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[DateTimeFormatPart]]
  
  inline def getLocalizedDayPeriod(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedDayPeriod")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getLocalizedDayPeriod(locale: String, dayPeriod: am | pm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedDayPeriod")(locale.asInstanceOf[js.Any], dayPeriod.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getLocalizedTime(locale: String, refParts: DatetimeParts, use24Hour: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedTime")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any], use24Hour.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMonthAndDay(locale: String, refParts: DatetimeParts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthAndDay")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMonthAndYear(locale: String, refParts: DatetimeParts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthAndYear")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMonthDayAndYear(locale: String, refParts: DatetimeParts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthDayAndYear")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTodayLabel(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTodayLabel")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getYear(locale: String, refParts: DatetimeParts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(locale.asInstanceOf[js.Any], refParts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeDateTzOffset(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDateTzOffset")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
