package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.ionicCoreInts.`28`
import typingsJapgolly.ionicCore.ionicCoreInts.`29`
import typingsJapgolly.ionicCore.ionicCoreInts.`30`
import typingsJapgolly.ionicCore.ionicCoreInts.`31`
import typingsJapgolly.ionicCore.ionicCoreStrings.h12
import typingsJapgolly.ionicCore.ionicCoreStrings.h23
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeUtilsHelpersMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/utils/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNumDaysInMonth(month: Double, year: Double): `29` | `30` | `28` | `31` = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumDaysInMonth")(month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[`29` | `30` | `28` | `31`]
  
  inline def is24Hour(locale: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is24Hour")(locale.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def is24Hour(locale: String, hourCycle: h23 | h12): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is24Hour")(locale.asInstanceOf[js.Any], hourCycle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLocaleDayPeriodRTL(locale: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocaleDayPeriodRTL")(locale.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMonthFirstLocale(locale: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonthFirstLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMonthFirstLocale(locale: String, formatOptions: DateTimeFormatOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMonthFirstLocale")(locale.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
