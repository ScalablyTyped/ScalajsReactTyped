package typingsJapgolly.adhan

import typingsJapgolly.adhan.adhanStrings.asr
import typingsJapgolly.adhan.adhanStrings.dhuhr
import typingsJapgolly.adhan.adhanStrings.fajr
import typingsJapgolly.adhan.adhanStrings.isha
import typingsJapgolly.adhan.adhanStrings.maghrib
import typingsJapgolly.adhan.adhanStrings.none
import typingsJapgolly.adhan.adhanStrings.sunrise
import typingsJapgolly.adhan.anon.Dhuhr
import typingsJapgolly.adhan.libTypesTypeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPrayerTimesMod {
  
  @JSImport("adhan/lib/types/PrayerTimes", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PrayerTimes {
    def this(
      coordinates: typingsJapgolly.adhan.libTypesCoordinatesMod.default,
      date: js.Date,
      calculationParameters: typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    ) = this()
  }
  
  @js.native
  trait PrayerTimes extends StObject {
    
    var asr: js.Date = js.native
    
    var calculationParameters: typingsJapgolly.adhan.libTypesCalculationParametersMod.default = js.native
    
    var coordinates: typingsJapgolly.adhan.libTypesCoordinatesMod.default = js.native
    
    def currentPrayer(): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    def currentPrayer(date: js.Date): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    
    var date: js.Date = js.native
    
    var dhuhr: js.Date = js.native
    
    var fajr: js.Date = js.native
    
    var isha: js.Date = js.native
    
    var maghrib: js.Date = js.native
    
    def nextPrayer(): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    def nextPrayer(date: js.Date): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    
    var sunrise: js.Date = js.native
    
    var sunset: js.Date = js.native
    
    def timeForPrayer(prayer: ValueOf[Dhuhr]): js.Date | Null = js.native
  }
}
