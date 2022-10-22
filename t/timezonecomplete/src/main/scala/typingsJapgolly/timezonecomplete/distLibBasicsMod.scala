package typingsJapgolly.timezonecomplete

import typingsJapgolly.timezonecomplete.distLibJavascriptMod.DateFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBasicsMod {
  
  @JSImport("timezonecomplete/dist/lib/basics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("timezonecomplete/dist/lib/basics", "TimeStruct")
  @js.native
  open class TimeStruct protected () extends StObject {
    /**
      * Constructor
      *
      * @param components Separate timestamp components (year, month, ...)
      * @throws timezonecomplete.Argument.Components if `components` is not an object
      * @throws timezonecomplete.Argument.* for invalid components (* = Year, Month, Day, Hour, Minute, Second, Milli)
      */
    def this(components: TimeComponentOpts) = this()
    /**
      * Constructor
      *
      * @param unixMillis milliseconds since 1-1-1970
      * @throws timezonecomplete.Argument.UnixMillis for non-integer unixMillis
      */
    def this(unixMillis: Double) = this()
    
    /**
      * The time value in separate year/month/... components
      */
    /* private */ var _components: Any = js.native
    
    /**
      * The time value in unix milliseconds
      */
    /* private */ var _unixMillis: Any = js.native
    
    def components: TimeComponents = js.native
    
    def day: Double = js.native
    
    /**
      * Equality function
      * @param other
      * @throws TypeError if other is not an Object
      */
    def equals(other: TimeStruct): Boolean = js.native
    
    def hour: Double = js.native
    
    def milli: Double = js.native
    
    def minute: Double = js.native
    
    def month: Double = js.native
    
    def second: Double = js.native
    
    def unixMillis: Double = js.native
    
    /**
      * Validate a timestamp. Filters out non-existing values for all time components
      * @returns true iff the timestamp is valid
      * @throws nothing
      */
    def validate(): Boolean = js.native
    
    def year: Double = js.native
    
    /**
      * The day-of-year 0-365
      * @throws nothing
      */
    def yearDay(): Double = js.native
  }
  /* static members */
  object TimeStruct {
    
    @JSImport("timezonecomplete/dist/lib/basics", "TimeStruct")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a TimeStruct from the given year, month, day etc
      *
      * @param year	Year e.g. 1970
      * @param month	Month 1-12
      * @param day	Day 1-31
      * @param hour	Hour 0-23
      * @param minute	Minute 0-59
      * @param second	Second 0-59 (no leap seconds)
      * @param milli	Millisecond 0-999
      * @throws timezonecomplete.Argument.Year for invalid year
      * @throws timezonecomplete.Argument.Month for invalid month
      * @throws timezonecomplete.Argument.Day for invalid day of month
      * @throws timezonecomplete.Argument.Hour for invalid hour
      * @throws timezonecomplete.Argument.Minute for invalid minute
      * @throws timezonecomplete.Argument.Second for invalid second
      * @throws timezonecomplete.Argument.Milli for invalid milliseconds
      */
    inline def fromComponents(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double]
    ): TimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("fromComponents")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], milli.asInstanceOf[js.Any])).asInstanceOf[TimeStruct]
    
    /**
      * Create a TimeStruct from a JavaScript date
      *
      * @param d	The date
      * @param df Which functions to take (getX() or getUTCX())
      * @throws nothing
      */
    inline def fromDate(d: js.Date, df: DateFunctions): TimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(d.asInstanceOf[js.Any], df.asInstanceOf[js.Any])).asInstanceOf[TimeStruct]
    
    /**
      * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
      * @throws timezonecomplete.Argument.S if `s` is not a proper iso string
      */
    inline def fromString(s: String): TimeStruct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[TimeStruct]
    
    /**
      * Create a TimeStruct from a number of unix milliseconds
      * (backward compatibility)
      * @throws timezonecomplete.Argument.UnixMillis for non-integer milliseconds
      */
    inline def fromUnix(unixMillis: Double): TimeStruct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnix")(unixMillis.asInstanceOf[js.Any]).asInstanceOf[TimeStruct]
  }
  
  @js.native
  sealed trait TimeUnit extends StObject
  @JSImport("timezonecomplete/dist/lib/basics", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TimeUnit & Double] = js.native
    
    @js.native
    sealed trait Day
      extends StObject
         with TimeUnit
    /* 4 */ val Day: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Day & Double = js.native
    
    @js.native
    sealed trait Hour
      extends StObject
         with TimeUnit
    /* 3 */ val Hour: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Hour & Double = js.native
    
    /**
      * End-of-enum marker, do not use
      */
    @js.native
    sealed trait MAX
      extends StObject
         with TimeUnit
    /* 8 */ val MAX: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.MAX & Double = js.native
    
    @js.native
    sealed trait Millisecond
      extends StObject
         with TimeUnit
    /* 0 */ val Millisecond: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Millisecond & Double = js.native
    
    @js.native
    sealed trait Minute
      extends StObject
         with TimeUnit
    /* 2 */ val Minute: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Minute & Double = js.native
    
    @js.native
    sealed trait Month
      extends StObject
         with TimeUnit
    /* 6 */ val Month: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Month & Double = js.native
    
    @js.native
    sealed trait Second
      extends StObject
         with TimeUnit
    /* 1 */ val Second: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Second & Double = js.native
    
    @js.native
    sealed trait Week
      extends StObject
         with TimeUnit
    /* 5 */ val Week: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Week & Double = js.native
    
    @js.native
    sealed trait Year
      extends StObject
         with TimeUnit
    /* 7 */ val Year: typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeUnit.Year & Double = js.native
  }
  
  @js.native
  sealed trait WeekDay extends StObject
  @JSImport("timezonecomplete/dist/lib/basics", "WeekDay")
  @js.native
  object WeekDay extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WeekDay & Double] = js.native
    
    @js.native
    sealed trait Friday
      extends StObject
         with WeekDay
    /* 5 */ val Friday: typingsJapgolly.timezonecomplete.distLibBasicsMod.WeekDay.Friday & Double = js.native
    
    @js.native
    sealed trait Monday
      extends StObject
         with WeekDay
    /* 1 */ val Monday: typingsJapgolly.timezonecomplete.distLibBasicsMod.WeekDay.Monday & Double = js.native
    
    @js.native
    sealed trait Saturday
      extends StObject
         with WeekDay
    /* 6 */ val Saturday: typingsJapgolly.timezonecomplete.distLibBasicsMod.WeekDay.Saturday & Double = js.native
    
    @js.native
    sealed trait Sunday
      extends StObject
         with WeekDay
    /* 0 */ val Sunday: typingsJapgolly.timezonecomplete.distLibBasicsMod.WeekDay.Sunday & Double = js.native
    
    @js.native
    sealed trait Thursday
      extends StObject
         with WeekDay
    /* 4 */ val Thursday: typingsJapgolly.timezonecomplete.distLibBasicsMod.WeekDay.Thursday & Double = js.native
    
    @js.native
    sealed trait Tuesday
      extends StObject
         with WeekDay
    /* 2 */ val Tuesday: typingsJapgolly.timezonecomplete.distLibBasicsMod.WeekDay.Tuesday & Double = js.native
    
    @js.native
    sealed trait Wednesday
      extends StObject
         with WeekDay
    /* 3 */ val Wednesday: typingsJapgolly.timezonecomplete.distLibBasicsMod.WeekDay.Wednesday & Double = js.native
  }
  
  inline def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryInsertionIndex")(arr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dayOfYear(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dayOfYear")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def daysInMonth(year: Double, month: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysInMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def daysInYear(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("daysInYear")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def firstWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("firstWeekDayOfMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lastWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastWeekDayOfMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def secondOfDay(hour: Double, minute: Double, second: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("secondOfDay")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stringToTimeUnit(s: String): TimeUnit = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToTimeUnit")(s.asInstanceOf[js.Any]).asInstanceOf[TimeUnit]
  
  inline def timeToUnixNoLeapSecs(components: TimeComponentOpts): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToUnixNoLeapSecs")(components.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def timeToUnixNoLeapSecs(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milli: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("timeToUnixNoLeapSecs")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], milli.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def timeUnitToMilliseconds(unit: TimeUnit): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeUnitToMilliseconds")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def timeUnitToString(unit: TimeUnit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeUnitToString")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def timeUnitToString(unit: TimeUnit, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeUnitToString")(unit.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unixToTimeNoLeapSecs(unixMillis: Double): TimeComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("unixToTimeNoLeapSecs")(unixMillis.asInstanceOf[js.Any]).asInstanceOf[TimeComponents]
  
  inline def weekDayNoLeapSecs(unixMillis: Double): WeekDay = ^.asInstanceOf[js.Dynamic].applyDynamic("weekDayNoLeapSecs")(unixMillis.asInstanceOf[js.Any]).asInstanceOf[WeekDay]
  
  inline def weekDayOnOrAfter(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekDayOnOrAfter")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def weekDayOnOrBefore(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekDayOnOrBefore")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def weekNumber(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekNumber")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def weekOfMonth(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekOfMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait TimeComponentOpts extends StObject {
    
    /**
      * Day of month 1-31, default 1
      */
    var day: js.UndefOr[Double] = js.undefined
    
    /**
      * Hour of day 0-23, default 0
      */
    var hour: js.UndefOr[Double] = js.undefined
    
    /**
      * Millisecond 0-999, default 0
      */
    var milli: js.UndefOr[Double] = js.undefined
    
    /**
      * Minute 0-59, default 0
      */
    var minute: js.UndefOr[Double] = js.undefined
    
    /**
      * Month 1-12, default 1
      */
    var month: js.UndefOr[Double] = js.undefined
    
    /**
      * Second 0-59, default 0
      */
    var second: js.UndefOr[Double] = js.undefined
    
    /**
      * Year, default 1970
      */
    var year: js.UndefOr[Double] = js.undefined
  }
  object TimeComponentOpts {
    
    inline def apply(): TimeComponentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeComponentOpts]
    }
    
    extension [Self <: TimeComponentOpts](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMilli(value: Double): Self = StObject.set(x, "milli", value.asInstanceOf[js.Any])
      
      inline def setMilliUndefined: Self = StObject.set(x, "milli", js.undefined)
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait TimeComponents extends StObject {
    
    /**
      * Day of month 1-31
      */
    var day: Double
    
    /**
      * Hour 0-23
      */
    var hour: Double
    
    /**
      * Millisecond 0-999
      */
    var milli: Double
    
    /**
      * Minute
      */
    var minute: Double
    
    /**
      * Month 1-12
      */
    var month: Double
    
    /**
      * Second
      */
    var second: Double
    
    /**
      * Year
      */
    var year: Double
  }
  object TimeComponents {
    
    inline def apply(
      day: Double,
      hour: Double,
      milli: Double,
      minute: Double,
      month: Double,
      second: Double,
      year: Double
    ): TimeComponents = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], milli = milli.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeComponents]
    }
    
    extension [Self <: TimeComponents](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMilli(value: Double): Self = StObject.set(x, "milli", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
