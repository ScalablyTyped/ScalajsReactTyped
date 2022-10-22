package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonDatetimeElement
import typingsJapgolly.ionicCore.ionicCoreStrings.am
import typingsJapgolly.ionicCore.ionicCoreStrings.pm
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeDatetimeInterfaceMod {
  
  trait DatetimeChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String | js.Array[String] | Null] = js.undefined
  }
  object DatetimeChangeEventDetail {
    
    inline def apply(): DatetimeChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatetimeChangeEventDetail]
    }
    
    extension [Self <: DatetimeChangeEventDetail](x: Self) {
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  @js.native
  trait DatetimeCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_DatetimeCustomEvent: DatetimeChangeEventDetail = js.native
    
    @JSName("target")
    var target_DatetimeCustomEvent: HTMLIonDatetimeElement = js.native
  }
  
  trait DatetimeOptions extends StObject {
    
    var tmp: js.UndefOr[String] = js.undefined
  }
  object DatetimeOptions {
    
    inline def apply(): DatetimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatetimeOptions]
    }
    
    extension [Self <: DatetimeOptions](x: Self) {
      
      inline def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
    }
  }
  
  trait DatetimeParts extends StObject {
    
    var ampm: js.UndefOr[am | pm] = js.undefined
    
    var day: Double | Null
    
    var dayOfWeek: js.UndefOr[Double | Null] = js.undefined
    
    var hour: js.UndefOr[Double] = js.undefined
    
    var minute: js.UndefOr[Double] = js.undefined
    
    var month: Double
    
    var tzOffset: js.UndefOr[Double] = js.undefined
    
    var year: Double
  }
  object DatetimeParts {
    
    inline def apply(month: Double, year: Double): DatetimeParts = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], day = null)
      __obj.asInstanceOf[DatetimeParts]
    }
    
    extension [Self <: DatetimeParts](x: Self) {
      
      inline def setAmpm(value: am | pm): Self = StObject.set(x, "ampm", value.asInstanceOf[js.Any])
      
      inline def setAmpmUndefined: Self = StObject.set(x, "ampm", js.undefined)
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayNull: Self = StObject.set(x, "day", null)
      
      inline def setDayOfWeek(value: Double): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekNull: Self = StObject.set(x, "dayOfWeek", null)
      
      inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setTzOffset(value: Double): Self = StObject.set(x, "tzOffset", value.asInstanceOf[js.Any])
      
      inline def setTzOffsetUndefined: Self = StObject.set(x, "tzOffset", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.`date-time`
    - typingsJapgolly.ionicCore.ionicCoreStrings.`time-date`
    - typingsJapgolly.ionicCore.ionicCoreStrings.date
    - typingsJapgolly.ionicCore.ionicCoreStrings.time
    - typingsJapgolly.ionicCore.ionicCoreStrings.month
    - typingsJapgolly.ionicCore.ionicCoreStrings.year
    - typingsJapgolly.ionicCore.ionicCoreStrings.`month-year`
  */
  trait DatetimePresentation extends StObject
  object DatetimePresentation {
    
    inline def date: typingsJapgolly.ionicCore.ionicCoreStrings.date = "date".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.date]
    
    inline def `date-time`: typingsJapgolly.ionicCore.ionicCoreStrings.`date-time` = "date-time".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`date-time`]
    
    inline def month: typingsJapgolly.ionicCore.ionicCoreStrings.month = "month".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.month]
    
    inline def `month-year`: typingsJapgolly.ionicCore.ionicCoreStrings.`month-year` = "month-year".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`month-year`]
    
    inline def time: typingsJapgolly.ionicCore.ionicCoreStrings.time = "time".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.time]
    
    inline def `time-date`: typingsJapgolly.ionicCore.ionicCoreStrings.`time-date` = "time-date".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`time-date`]
    
    inline def year: typingsJapgolly.ionicCore.ionicCoreStrings.year = "year".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.year]
  }
  
  type TitleSelectedDatesFormatter = js.Function1[/* selectedDates */ js.Array[String], String]
}
