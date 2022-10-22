package typingsJapgolly.timestring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): Double = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(input: String, returnUnit: Unit, opts: Options): Double = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], returnUnit.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(input: String, returnUnit: ReturnUnit): Double = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], returnUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(input: String, returnUnit: ReturnUnit, opts: Options): Double = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], returnUnit.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("timestring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * @default 7
      */
    var daysPerWeek: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 365.25s
      */
    var daysPerYear: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 24
      */
    var hoursPerDay: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 12
      */
    var monthsPerYear: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 4
      */
    var weeksPerMonth: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDaysPerWeek(value: Double): Self = StObject.set(x, "daysPerWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysPerWeekUndefined: Self = StObject.set(x, "daysPerWeek", js.undefined)
      
      inline def setDaysPerYear(value: Double): Self = StObject.set(x, "daysPerYear", value.asInstanceOf[js.Any])
      
      inline def setDaysPerYearUndefined: Self = StObject.set(x, "daysPerYear", js.undefined)
      
      inline def setHoursPerDay(value: Double): Self = StObject.set(x, "hoursPerDay", value.asInstanceOf[js.Any])
      
      inline def setHoursPerDayUndefined: Self = StObject.set(x, "hoursPerDay", js.undefined)
      
      inline def setMonthsPerYear(value: Double): Self = StObject.set(x, "monthsPerYear", value.asInstanceOf[js.Any])
      
      inline def setMonthsPerYearUndefined: Self = StObject.set(x, "monthsPerYear", js.undefined)
      
      inline def setWeeksPerMonth(value: Double): Self = StObject.set(x, "weeksPerMonth", value.asInstanceOf[js.Any])
      
      inline def setWeeksPerMonthUndefined: Self = StObject.set(x, "weeksPerMonth", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.timestring.timestringStrings.ms
    - typingsJapgolly.timestring.timestringStrings.milli
    - typingsJapgolly.timestring.timestringStrings.millisecond
    - typingsJapgolly.timestring.timestringStrings.milliseconds
    - typingsJapgolly.timestring.timestringStrings.s
    - typingsJapgolly.timestring.timestringStrings.sec
    - typingsJapgolly.timestring.timestringStrings.secs
    - typingsJapgolly.timestring.timestringStrings.second
    - typingsJapgolly.timestring.timestringStrings.seconds
    - typingsJapgolly.timestring.timestringStrings.m
    - typingsJapgolly.timestring.timestringStrings.min
    - typingsJapgolly.timestring.timestringStrings.mins
    - typingsJapgolly.timestring.timestringStrings.minute
    - typingsJapgolly.timestring.timestringStrings.minutes
    - typingsJapgolly.timestring.timestringStrings.h
    - typingsJapgolly.timestring.timestringStrings.hr
    - typingsJapgolly.timestring.timestringStrings.hrs
    - typingsJapgolly.timestring.timestringStrings.hour
    - typingsJapgolly.timestring.timestringStrings.hours
    - typingsJapgolly.timestring.timestringStrings.d
    - typingsJapgolly.timestring.timestringStrings.day
    - typingsJapgolly.timestring.timestringStrings.days
    - typingsJapgolly.timestring.timestringStrings.w
    - typingsJapgolly.timestring.timestringStrings.week
    - typingsJapgolly.timestring.timestringStrings.weeks
    - typingsJapgolly.timestring.timestringStrings.mon
    - typingsJapgolly.timestring.timestringStrings.mth
    - typingsJapgolly.timestring.timestringStrings.mths
    - typingsJapgolly.timestring.timestringStrings.month
    - typingsJapgolly.timestring.timestringStrings.months
    - typingsJapgolly.timestring.timestringStrings.y
    - typingsJapgolly.timestring.timestringStrings.yr
    - typingsJapgolly.timestring.timestringStrings.yrs
    - typingsJapgolly.timestring.timestringStrings.year
    - typingsJapgolly.timestring.timestringStrings.years
  */
  trait ReturnUnit extends StObject
  object ReturnUnit {
    
    inline def d: typingsJapgolly.timestring.timestringStrings.d = "d".asInstanceOf[typingsJapgolly.timestring.timestringStrings.d]
    
    inline def day: typingsJapgolly.timestring.timestringStrings.day = "day".asInstanceOf[typingsJapgolly.timestring.timestringStrings.day]
    
    inline def days: typingsJapgolly.timestring.timestringStrings.days = "days".asInstanceOf[typingsJapgolly.timestring.timestringStrings.days]
    
    inline def h: typingsJapgolly.timestring.timestringStrings.h = "h".asInstanceOf[typingsJapgolly.timestring.timestringStrings.h]
    
    inline def hour: typingsJapgolly.timestring.timestringStrings.hour = "hour".asInstanceOf[typingsJapgolly.timestring.timestringStrings.hour]
    
    inline def hours: typingsJapgolly.timestring.timestringStrings.hours = "hours".asInstanceOf[typingsJapgolly.timestring.timestringStrings.hours]
    
    inline def hr: typingsJapgolly.timestring.timestringStrings.hr = "hr".asInstanceOf[typingsJapgolly.timestring.timestringStrings.hr]
    
    inline def hrs: typingsJapgolly.timestring.timestringStrings.hrs = "hrs".asInstanceOf[typingsJapgolly.timestring.timestringStrings.hrs]
    
    inline def m: typingsJapgolly.timestring.timestringStrings.m = "m".asInstanceOf[typingsJapgolly.timestring.timestringStrings.m]
    
    inline def milli: typingsJapgolly.timestring.timestringStrings.milli = "milli".asInstanceOf[typingsJapgolly.timestring.timestringStrings.milli]
    
    inline def millisecond: typingsJapgolly.timestring.timestringStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.timestring.timestringStrings.millisecond]
    
    inline def milliseconds: typingsJapgolly.timestring.timestringStrings.milliseconds = "milliseconds".asInstanceOf[typingsJapgolly.timestring.timestringStrings.milliseconds]
    
    inline def min: typingsJapgolly.timestring.timestringStrings.min = "min".asInstanceOf[typingsJapgolly.timestring.timestringStrings.min]
    
    inline def mins: typingsJapgolly.timestring.timestringStrings.mins = "mins".asInstanceOf[typingsJapgolly.timestring.timestringStrings.mins]
    
    inline def minute: typingsJapgolly.timestring.timestringStrings.minute = "minute".asInstanceOf[typingsJapgolly.timestring.timestringStrings.minute]
    
    inline def minutes: typingsJapgolly.timestring.timestringStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.timestring.timestringStrings.minutes]
    
    inline def mon: typingsJapgolly.timestring.timestringStrings.mon = "mon".asInstanceOf[typingsJapgolly.timestring.timestringStrings.mon]
    
    inline def month: typingsJapgolly.timestring.timestringStrings.month = "month".asInstanceOf[typingsJapgolly.timestring.timestringStrings.month]
    
    inline def months: typingsJapgolly.timestring.timestringStrings.months = "months".asInstanceOf[typingsJapgolly.timestring.timestringStrings.months]
    
    inline def ms: typingsJapgolly.timestring.timestringStrings.ms = "ms".asInstanceOf[typingsJapgolly.timestring.timestringStrings.ms]
    
    inline def mth: typingsJapgolly.timestring.timestringStrings.mth = "mth".asInstanceOf[typingsJapgolly.timestring.timestringStrings.mth]
    
    inline def mths: typingsJapgolly.timestring.timestringStrings.mths = "mths".asInstanceOf[typingsJapgolly.timestring.timestringStrings.mths]
    
    inline def s: typingsJapgolly.timestring.timestringStrings.s = "s".asInstanceOf[typingsJapgolly.timestring.timestringStrings.s]
    
    inline def sec: typingsJapgolly.timestring.timestringStrings.sec = "sec".asInstanceOf[typingsJapgolly.timestring.timestringStrings.sec]
    
    inline def second: typingsJapgolly.timestring.timestringStrings.second = "second".asInstanceOf[typingsJapgolly.timestring.timestringStrings.second]
    
    inline def seconds: typingsJapgolly.timestring.timestringStrings.seconds = "seconds".asInstanceOf[typingsJapgolly.timestring.timestringStrings.seconds]
    
    inline def secs: typingsJapgolly.timestring.timestringStrings.secs = "secs".asInstanceOf[typingsJapgolly.timestring.timestringStrings.secs]
    
    inline def w: typingsJapgolly.timestring.timestringStrings.w = "w".asInstanceOf[typingsJapgolly.timestring.timestringStrings.w]
    
    inline def week: typingsJapgolly.timestring.timestringStrings.week = "week".asInstanceOf[typingsJapgolly.timestring.timestringStrings.week]
    
    inline def weeks: typingsJapgolly.timestring.timestringStrings.weeks = "weeks".asInstanceOf[typingsJapgolly.timestring.timestringStrings.weeks]
    
    inline def y: typingsJapgolly.timestring.timestringStrings.y = "y".asInstanceOf[typingsJapgolly.timestring.timestringStrings.y]
    
    inline def year: typingsJapgolly.timestring.timestringStrings.year = "year".asInstanceOf[typingsJapgolly.timestring.timestringStrings.year]
    
    inline def years: typingsJapgolly.timestring.timestringStrings.years = "years".asInstanceOf[typingsJapgolly.timestring.timestringStrings.years]
    
    inline def yr: typingsJapgolly.timestring.timestringStrings.yr = "yr".asInstanceOf[typingsJapgolly.timestring.timestringStrings.yr]
    
    inline def yrs: typingsJapgolly.timestring.timestringStrings.yrs = "yrs".asInstanceOf[typingsJapgolly.timestring.timestringStrings.yrs]
  }
}
