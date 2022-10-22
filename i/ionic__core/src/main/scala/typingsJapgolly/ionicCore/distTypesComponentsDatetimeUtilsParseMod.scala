package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeParts
import typingsJapgolly.ionicCore.ionicCoreStrings.am
import typingsJapgolly.ionicCore.ionicCoreStrings.pm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeUtilsParseMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/utils/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clampDate(dateParts: DatetimeParts): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("clampDate")(dateParts.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  inline def clampDate(dateParts: DatetimeParts, minParts: Unit, maxParts: DatetimeParts): DatetimeParts = (^.asInstanceOf[js.Dynamic].applyDynamic("clampDate")(dateParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[DatetimeParts]
  inline def clampDate(dateParts: DatetimeParts, minParts: DatetimeParts): DatetimeParts = (^.asInstanceOf[js.Dynamic].applyDynamic("clampDate")(dateParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any])).asInstanceOf[DatetimeParts]
  inline def clampDate(dateParts: DatetimeParts, minParts: DatetimeParts, maxParts: DatetimeParts): DatetimeParts = (^.asInstanceOf[js.Dynamic].applyDynamic("clampDate")(dateParts.asInstanceOf[js.Any], minParts.asInstanceOf[js.Any], maxParts.asInstanceOf[js.Any])).asInstanceOf[DatetimeParts]
  
  inline def convertToArrayOfNumbers(): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfNumbers")().asInstanceOf[js.UndefOr[js.Array[Double]]]
  inline def convertToArrayOfNumbers(input: String): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfNumbers")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
  inline def convertToArrayOfNumbers(input: js.Array[Double]): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfNumbers")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
  inline def convertToArrayOfNumbers(input: Double): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfNumbers")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
  
  inline def getPartsFromCalendarDay(el: HTMLElement): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("getPartsFromCalendarDay")(el.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  
  inline def parseAmPm(hour: Double): am | pm = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAmPm")(hour.asInstanceOf[js.Any]).asInstanceOf[am | pm]
  
  inline def parseDate(): js.UndefOr[DatetimeParts | js.Array[DatetimeParts]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")().asInstanceOf[js.UndefOr[DatetimeParts | js.Array[DatetimeParts]]]
  inline def parseDate(`val`: String): DatetimeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts]
  inline def parseDate(`val`: js.Array[String]): DatetimeParts | js.Array[DatetimeParts] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts | js.Array[DatetimeParts]]
  
  inline def parseDate_Array(`val`: js.Array[String]): js.Array[DatetimeParts] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[DatetimeParts]]
  
  inline def parseDate_Union(`val`: String): DatetimeParts | js.Array[DatetimeParts] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[DatetimeParts | js.Array[DatetimeParts]]
  
  inline def parseDate_Unit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")().asInstanceOf[Unit]
  
  inline def parseMaxParts(max: String, todayParts: DatetimeParts): DatetimeParts = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMaxParts")(max.asInstanceOf[js.Any], todayParts.asInstanceOf[js.Any])).asInstanceOf[DatetimeParts]
  
  inline def parseMinParts(min: String, todayParts: DatetimeParts): DatetimeParts = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMinParts")(min.asInstanceOf[js.Any], todayParts.asInstanceOf[js.Any])).asInstanceOf[DatetimeParts]
}
