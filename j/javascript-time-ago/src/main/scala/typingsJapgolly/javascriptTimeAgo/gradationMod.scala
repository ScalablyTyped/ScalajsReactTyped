package typingsJapgolly.javascriptTimeAgo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradationMod {
  
  @JSImport("javascript-time-ago/gradation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("javascript-time-ago/gradation", "canonical")
  @js.native
  val canonical: js.Array[Gradation] = js.native
  
  @JSImport("javascript-time-ago/gradation", "convenient")
  @js.native
  val convenient: js.Array[Gradation] = js.native
  
  @JSImport("javascript-time-ago/gradation", "day")
  @js.native
  val day: Double = js.native
  
  inline def getDate(value: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getDate(value: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getStep(gradation: js.Array[Gradation], unit: Unit): js.UndefOr[Gradation] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStep")(gradation.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Gradation]]
  
  @JSImport("javascript-time-ago/gradation", "hour")
  @js.native
  val hour: Double = js.native
  
  @JSImport("javascript-time-ago/gradation", "minute")
  @js.native
  val minute: Double = js.native
  
  @JSImport("javascript-time-ago/gradation", "month")
  @js.native
  val month: Double = js.native
  
  @JSImport("javascript-time-ago/gradation", "year")
  @js.native
  val year: Double = js.native
  
  trait Gradation extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var granularity: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var threshold_for_day: js.UndefOr[Double] = js.undefined
    
    var threshold_for_hour: js.UndefOr[Double] = js.undefined
    
    var threshold_for_minute: js.UndefOr[Double] = js.undefined
    
    var threshold_for_month: js.UndefOr[Double] = js.undefined
    
    var threshold_for_now: js.UndefOr[Double] = js.undefined
    
    var threshold_for_second: js.UndefOr[Double] = js.undefined
    
    var threshold_for_week: js.UndefOr[Double] = js.undefined
    
    var threshold_for_year: js.UndefOr[Double] = js.undefined
    
    var unit: js.UndefOr[Unit] = js.undefined
  }
  object Gradation {
    
    inline def apply(): Gradation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gradation]
    }
    
    extension [Self <: Gradation](x: Self) {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setThreshold_for_day(value: Double): Self = StObject.set(x, "threshold_for_day", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_dayUndefined: Self = StObject.set(x, "threshold_for_day", js.undefined)
      
      inline def setThreshold_for_hour(value: Double): Self = StObject.set(x, "threshold_for_hour", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_hourUndefined: Self = StObject.set(x, "threshold_for_hour", js.undefined)
      
      inline def setThreshold_for_minute(value: Double): Self = StObject.set(x, "threshold_for_minute", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_minuteUndefined: Self = StObject.set(x, "threshold_for_minute", js.undefined)
      
      inline def setThreshold_for_month(value: Double): Self = StObject.set(x, "threshold_for_month", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_monthUndefined: Self = StObject.set(x, "threshold_for_month", js.undefined)
      
      inline def setThreshold_for_now(value: Double): Self = StObject.set(x, "threshold_for_now", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_nowUndefined: Self = StObject.set(x, "threshold_for_now", js.undefined)
      
      inline def setThreshold_for_second(value: Double): Self = StObject.set(x, "threshold_for_second", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_secondUndefined: Self = StObject.set(x, "threshold_for_second", js.undefined)
      
      inline def setThreshold_for_week(value: Double): Self = StObject.set(x, "threshold_for_week", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_weekUndefined: Self = StObject.set(x, "threshold_for_week", js.undefined)
      
      inline def setThreshold_for_year(value: Double): Self = StObject.set(x, "threshold_for_year", value.asInstanceOf[js.Any])
      
      inline def setThreshold_for_yearUndefined: Self = StObject.set(x, "threshold_for_year", js.undefined)
      
      inline def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.now
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.second
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.minute
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.hour
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.day
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.week
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.month
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.year
  */
  trait Unit extends StObject
  object Unit {
    
    inline def day: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.day = "day".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.day]
    
    inline def hour: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.hour = "hour".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.hour]
    
    inline def minute: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.minute = "minute".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.minute]
    
    inline def month: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.month = "month".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.month]
    
    inline def now: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.now = "now".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.now]
    
    inline def second: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.second = "second".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.second]
    
    inline def week: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.week = "week".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.week]
    
    inline def year: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.year = "year".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.year]
  }
}
