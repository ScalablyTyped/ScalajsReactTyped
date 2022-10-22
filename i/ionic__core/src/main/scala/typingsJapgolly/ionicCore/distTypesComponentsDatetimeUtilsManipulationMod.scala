package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Month
import typingsJapgolly.ionicCore.anon.Year
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeParts
import typingsJapgolly.ionicCore.ionicCoreStrings.am
import typingsJapgolly.ionicCore.ionicCoreStrings.pm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeUtilsManipulationMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/utils/manipulation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDays(refParts: DatetimeParts, numDays: Double): Month = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(refParts.asInstanceOf[js.Any], numDays.asInstanceOf[js.Any])).asInstanceOf[Month]
  
  inline def calculateHourFromAMPM(currentParts: DatetimeParts, newAMPM: am | pm): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateHourFromAMPM")(currentParts.asInstanceOf[js.Any], newAMPM.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convert12HourTo24Hour(hour: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convert12HourTo24Hour")(hour.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def convert12HourTo24Hour(hour: Double, ampm: am | pm): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convert12HourTo24Hour")(hour.asInstanceOf[js.Any], ampm.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertDataToISO(data: js.Array[DatetimeParts]): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToISO")(data.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  inline def convertDataToISO(data: DatetimeParts): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToISO")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertDataToISO_Array(data: js.Array[DatetimeParts]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToISO")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def convertDataToISO_Union(data: DatetimeParts): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToISO")(data.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  
  inline def getEndOfWeek(refParts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndOfWeek")(refParts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  
  inline def getInternalHourValue(hour: Double, use24Hour: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInternalHourValue")(hour.asInstanceOf[js.Any], use24Hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getInternalHourValue(hour: Double, use24Hour: Boolean, ampm: am | pm): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInternalHourValue")(hour.asInstanceOf[js.Any], use24Hour.asInstanceOf[js.Any], ampm.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNextDay(refParts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextDay")(refParts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  
  inline def getNextMonth(refParts: DatetimeParts): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextMonth")(refParts.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  inline def getNextWeek(refParts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextWeek")(refParts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  
  inline def getNextYear(refParts: DatetimeParts): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextYear")(refParts.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  inline def getPreviousDay(refParts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDay")(refParts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  
  inline def getPreviousMonth(refParts: DatetimeParts): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMonth")(refParts.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  inline def getPreviousWeek(refParts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousWeek")(refParts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  
  inline def getPreviousYear(refParts: DatetimeParts): Year = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousYear")(refParts.asInstanceOf[js.Any]).asInstanceOf[Year]
  
  inline def getStartOfWeek(refParts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartOfWeek")(refParts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  
  inline def subtractDays(refParts: DatetimeParts, numDays: Double): Month = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractDays")(refParts.asInstanceOf[js.Any], numDays.asInstanceOf[js.Any])).asInstanceOf[Month]
  
  inline def validateParts(parts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("validateParts")(parts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
}
